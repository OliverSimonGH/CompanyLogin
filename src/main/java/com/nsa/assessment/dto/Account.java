package com.nsa.assessment.dto;

import com.nsa.assessment.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private int id;
    private String emailAddress;
    private String passwordSalt;
    private String password;
    private List<String> roles;
    private Timestamp date_created;

    public Account(int id, String emailAddress, String passwordSalt, String password, Timestamp date_created, List<String> roles) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.passwordSalt = passwordSalt;
        this.password = password;
        this.date_created = date_created;
        this.roles = roles;
    }

    public Account(int id, String emailAddress, String passwordSalt, String password, Timestamp date_created) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.passwordSalt = passwordSalt;
        this.password = password;
        this.date_created = date_created;
    }

    public Account(Account account) {
        this.id = account.getId();
        this.emailAddress = account.getEmailAddress();
        this.passwordSalt = account.getPasswordSalt();
        this.password = account.getPassword();
        this.date_created = account.getDate_created();
        this.roles = account.getRoles();
    }
}
