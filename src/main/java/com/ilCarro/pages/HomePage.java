package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homePageTitle);
        return new HomePage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(3)")
    WebElement theCarWorklink;
    public LetTheCarWorkPage clickOnLetTheCarWorkLink() {
        click(theCarWorklink);
        return new LetTheCarWorkPage(driver);
    }
}
