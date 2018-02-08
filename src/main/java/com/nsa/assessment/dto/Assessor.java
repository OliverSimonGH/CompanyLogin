package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assessor {

    private int id;
    private String name;
    private int fkAccount;

    public Assessor(String name, int fkAccount) {
        this.name = name;
        this.fkAccount = fkAccount;
    }
}
