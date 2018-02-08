package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.CompanyModuleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyModuleDAOImpl implements CompanyModuleDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
