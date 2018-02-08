package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.ResultDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResultDAOImpl implements ResultDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
