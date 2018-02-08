package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private int id;
    private String name;
    private int fkAccount;
    private int fkCompany;

    public Customer(String name, int fkAccount, int fkCompany) {
        this.name = name;
        this.fkAccount = fkAccount;
        this.fkCompany = fkCompany;
    }
}
