package com.nsa.assessment.service;

import com.nsa.assessment.dao.AccountDAO;
import com.nsa.assessment.dto.Account;
import com.nsa.assessment.dto.AccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountDAO.findByUserName(username);
        if (account == null) throw new UsernameNotFoundException("Username Not Found");
        else return new AccountDetails(account);
    }
}
