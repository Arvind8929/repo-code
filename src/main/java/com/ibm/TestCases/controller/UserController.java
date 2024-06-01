package com.ibm.TestCases.controller;

import com.ibm.TestCases.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/employee")
    public String getEmployees() throws Exception {
        String user = null;
        try {
            user = userService.getEmployees();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }
}
