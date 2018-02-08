package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.AssessorDAO;
import com.nsa.assessment.service.AssessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssessorServiceImpl implements AssessorService {

    @Autowired
    private AssessorDAO assessorDAO;
}
