package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.AccountDAO;
import com.nsa.assessment.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public Account findByUserName(String username) {
        try {
            Account account = jdbcTemplate.queryForObject("SELECT * FROM account WHERE email_address = ?",
                    new Object[]{username},
                    (rs, rowNum) -> new Account(
                            rs.getInt("id"),
                            rs.getString("email_address"),
                            rs.getString("password_salt"),
                            rs.getString("password"),
                            rs.getTimestamp("date_created")
                    ));

            List<String> authorities = getUserRoles(account.getId());
            account.setRoles(authorities);

            return account;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    @Transactional
    public Account findById(int id) {
        List<String> authorities = getUserRoles(id);

        Account account = jdbcTemplate.queryForObject("SELECT * FROM account WHERE id = ?",
                new Object[]{id},
                (rs, rowNum) -> new Account(
                        rs.getInt("id"),
                        rs.getString("email_address"),
                        rs.getString("password_salt"),
                        rs.getString("password"),
                        rs.getTimestamp("date_created"),
                        authorities
                ));

        return account;
    }

    private List<String> getUserRoles(int id) {
        return jdbcTemplate.queryForList("SELECT r.role FROM account a JOIN account_role ar ON a.id = ar.fk_account JOIN role r ON r.id = ar.fk_role WHERE a.id = ?",
                new Object[]{id}, String.class);
    }
}
