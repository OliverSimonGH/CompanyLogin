package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.AssessorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AssessorDAOImpl implements AssessorDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
