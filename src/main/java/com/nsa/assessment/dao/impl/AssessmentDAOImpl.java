package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.AssessmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AssessmentDAOImpl implements AssessmentDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
