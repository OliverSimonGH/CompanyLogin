package com.nsa.assessment.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/all")
    public String accessAll(){
        return "All accounts can access this";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping("/secured")
    public String accessSecured(){
        return "Secured accounts can access this";
    }
}
