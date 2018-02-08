package com.nsa.assessment.dao.impl;

import com.nsa.assessment.dao.ModuleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ModuleDAOImpl implements ModuleDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
