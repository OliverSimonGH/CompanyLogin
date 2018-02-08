package com.nsa.assessment.service.impl;

import com.nsa.assessment.dao.AccountDAO;
import com.nsa.assessment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;
}
