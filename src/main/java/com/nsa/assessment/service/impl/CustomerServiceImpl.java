package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.CustomerDAO;
import com.nsa.assessment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
}
