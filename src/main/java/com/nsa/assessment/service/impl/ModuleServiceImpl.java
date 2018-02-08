package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.ModuleDAO;
import com.nsa.assessment.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleDAO moduleDAO;
}
