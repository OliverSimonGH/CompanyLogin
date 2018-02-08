package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.CompanyDAO;
import com.nsa.assessment.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDAO companyDAO;
}
