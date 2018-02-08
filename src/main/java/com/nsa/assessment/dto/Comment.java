package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private int fkCustomer;
    private int fkQuestion;
    private int score;
    private String comment;

    public Comment(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }
}
