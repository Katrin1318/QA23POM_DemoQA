package com.telran.demoqa.tests;

import com.telran.demoqa.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase{

    @Test
    public void loginPositiveTest() {
        new LoginPage(driver).login("Mark", "Mark12345!")
                .verifyUserName("Mark")
                .logout();
    }

    @Test
    public void loginPositiveWithAssertTest() {
        new LoginPage(driver).login("Mark", "Mark12345!")
                .isAccountAssert("Mark")
                .logout();
    }
}
