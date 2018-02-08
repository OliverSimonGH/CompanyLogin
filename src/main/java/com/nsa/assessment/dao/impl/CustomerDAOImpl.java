package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
