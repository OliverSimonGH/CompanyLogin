package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.QuestionDAO;
import com.nsa.assessment.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDAO questionDAO;
}
