package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyModule {

    private int fkCompany;
    private int fkModule;
    private boolean deleted;

    public CompanyModule(boolean deleted) {
        this.deleted = deleted;
    }
}
