package com.ilCarro.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LetTheCarWorkPage extends BasePage{
    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "pickUpPlace")
    WebElement inputLocation;
    public LetTheCarWorkPage fillLocation(String text) {
        type(inputLocation,text);
        pause(500);
        inputLocation.sendKeys(Keys.ARROW_DOWN);
        inputLocation.sendKeys(Keys.ENTER);
        return this;
    }
    @FindBy(id = "make")
    WebElement manufacturer;
    public LetTheCarWorkPage fillManufacturer(String text) {
        type(manufacturer,text);
        return this;
    }
    @FindBy(id = "model")
    WebElement model;
    public LetTheCarWorkPage fillModelDetails(String text) {
        type(model,text);
        return this;
    }
    @FindBy(id = "year")
    WebElement year;
    public LetTheCarWorkPage fillsYear(String text) {
        type(year,text);
        return this;
    }
    @FindBy(id = "fuel")
    WebElement fuel;
    public LetTheCarWorkPage selectsFuel(String text) {
            Select select = new Select(fuel);
            select.selectByVisibleText(text);
            List<WebElement> options = select.getOptions();

            for (int i = 0; i < options.size(); i++) {
                System.out.println(options.get(i).getText());
            }
            return this;
        }
    @FindBy(id = "seats")
    WebElement seats;
    public LetTheCarWorkPage fillsSeats(String text) {
        type(seats,text);
        return this;

    }
    @FindBy(id = "class")
    WebElement inputClass;
    public LetTheCarWorkPage fillsCarClass(String text) {
        type(inputClass, text);
        return this;
    }
    @FindBy(id = "serialNumber")
    WebElement regNumber;
    public LetTheCarWorkPage fillsCarRegistrationNumber(String text) {
        type(regNumber, text);
        return this;
    }
    @FindBy(id = "price")
    WebElement price;
    public LetTheCarWorkPage fillsPrice(String text) {
        type(price,text);
        return this;
    }
    @FindBy(id = "about")
    WebElement inputInfo;
    public LetTheCarWorkPage fillsAboutThatCar(String text) {
        type(inputInfo,text);
        return this;
    }
    @FindBy(id = "photos")
    WebElement uploadPicture;
    public LetTheCarWorkPage uploadsPhotosOfTheCar(String path) {
        uploadPicture.sendKeys(path);

        return this;
    }
    @FindBy(css = "[type='submit']")
    WebElement submit;
    public LetTheCarWorkPage clickSubmitButton() {
        click(submit);
        return this;
    }
    @FindBy(css = ".message")
    WebElement message;

    public LetTheCarWorkPage isMessage(String text) {
        assert message.getText().contains(text);

        return this;
    }
}
