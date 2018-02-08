package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.CommentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDAOImpl implements CommentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
