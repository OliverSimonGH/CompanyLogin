package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.ResultDAO;
import com.nsa.assessment.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultDAO resultDAO;
}
