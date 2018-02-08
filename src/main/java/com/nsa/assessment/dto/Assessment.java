package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assessment {

    private int id;
    private boolean approved;
    private int unapprovedQviScore;
    private int approvedQviScore;
    private Timestamp dateCreated;
    private Timestamp dateAssessed;
    private int fkCompany;

    public Assessment(boolean approved, int unapprovedQviScore, int approvedQviScore, Timestamp dateCreated, Timestamp dateAssessed, int fkCompany) {
        this.approved = approved;
        this.unapprovedQviScore = unapprovedQviScore;
        this.approvedQviScore = approvedQviScore;
        this.dateCreated = dateCreated;
        this.dateAssessed = dateAssessed;
        this.fkCompany = fkCompany;
    }

    public Assessment(boolean approved, int unapprovedQviScore, Timestamp dateCreated, int fkCompany) {
        this.approved = approved;
        this.unapprovedQviScore = unapprovedQviScore;
        this.dateCreated = dateCreated;
        this.fkCompany = fkCompany;
    }
}
