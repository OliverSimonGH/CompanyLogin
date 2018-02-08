package com.nsa.assessment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private int id;
    private String emailAddress;
    private String passwordSalt;
    private String password;
    private Timestamp date_created;

    public Account(String emailAddress, String passwordSalt, String password, Timestamp date_created) {
        this.emailAddress = emailAddress;
        this.passwordSalt = passwordSalt;
        this.password = password;
        this.date_created = date_created;
    }
}
