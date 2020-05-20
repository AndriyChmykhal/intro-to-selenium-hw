package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;

public class MainPage extends com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy

    @FindBy(how = CSS, using = "h2")
    private WebElement secureAreaTitle;

    @FindBy(how = CSS, using = ".icon-2x")
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return secureAreaTitle.getText();
    }

    public MainPage clickLogout() {
        logoutButton.click();
        return this;
    }
}
