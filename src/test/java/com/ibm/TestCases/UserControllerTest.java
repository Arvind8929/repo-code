package com.ibm.TestCases;

import com.ibm.TestCases.controller.UserController;
import com.ibm.TestCases.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest extends TestCasesApplication {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    public void setup(){

    }

    @Test
    public void getEmployees_test() throws Exception{

        String s="Employee";
        Mockito.when(userService.getEmployees()).thenReturn(s);

        String response=userController.getEmployees();
        Assertions.assertEquals(s,response);
    }

}
