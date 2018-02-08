package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.AssessmentDAO;
import com.nsa.assessment.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssessmentServiceImpl implements AssessmentService {

    @Autowired
    private AssessmentDAO assessmentDAO;
}
