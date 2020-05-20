package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        userSteps.login("tomsmith", "SuperSecretPassword!")
                .logout();
    }
}
