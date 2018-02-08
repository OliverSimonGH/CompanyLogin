package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private int id;
    private String question;
    private int fkModule;

    public Question(String question, int fkModule) {
        this.question = question;
        this.fkModule = fkModule;
    }
}
