package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.CompanyModuleDAO;
import com.nsa.assessment.service.CompanyModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyModuleServiceImpl implements CompanyModuleService {

    @Autowired
    private CompanyModuleDAO companyModuleDAO;
}
