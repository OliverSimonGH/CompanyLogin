package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
