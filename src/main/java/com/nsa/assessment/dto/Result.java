package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private int fkModule;
    private int fkAssessment;
    private int score;

    public Result(int score) {
        this.score = score;
    }
}
