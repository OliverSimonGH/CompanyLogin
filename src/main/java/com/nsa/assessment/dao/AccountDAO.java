package com.nsa.assessment.dao;

import com.nsa.assessment.dto.Account;

import java.util.List;

public interface AccountDAO {

    Account findByUserName(String username);
    Account findById(int id);
}
