package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private int id;
    private String name;
    private int fkAccount;
    private int fkAssessor;

    public Company(String name, int fkAccount, int fkAssessor) {
        this.name = name;
        this.fkAccount = fkAccount;
        this.fkAssessor = fkAssessor;
    }

    public Company(String name, int fkAccount) {
        this.name = name;
        this.fkAccount = fkAccount;
    }
}
