package com.stepDefinition;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LetTheCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilCarro.pages.BasePage.driver;

public class LetTheCarWorkSteps {

    @And("User clicks on the Let the car work link")
    public void clicks_on_the_Let_the_car_work_link() {
        new HomePage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User fills Location details")
    public void fills_Location_details(){
        new LetTheCarWorkPage(driver).fillLocation("Tel Aviv, Israel");
    }
    @And("User fills Manufacturer")
    public void fills_Manufacturer(){
        new LetTheCarWorkPage(driver).fillManufacturer("1223");
    }
//
    @And("User fills Model details")
    public void fills_Model_details(){
        new LetTheCarWorkPage(driver).fillModelDetails("juk 2");
    }
    @And("User fills Year")
    public void fills_Year(){
        new LetTheCarWorkPage(driver).fillsYear("2010");
    }
//
    @And("User selects Fuel")
    public void selects_Fuel(){
        new LetTheCarWorkPage(driver).selectsFuel("Diesel");
    }
    @And("User fills Seats")
    public void fills_Seats(){
        new LetTheCarWorkPage(driver).fillsSeats("2");
    }
    @And("User fills Car class")
    public void fills_Car_class(){
        new LetTheCarWorkPage(driver).fillsCarClass("S");
    }

//
    @And("User fills Car registration number")
    public void fills_Car_registration_number(){
        new LetTheCarWorkPage(driver).fillsCarRegistrationNumber("AS3456KV");
    }
    @And("User fills  Price")
    public void fills_Price(){
        new LetTheCarWorkPage(driver).fillsPrice("300");
    }
    @And("User fills About that car")
    public void fills_About_that_car(){
        new LetTheCarWorkPage(driver).fillsAboutThatCar("The new car");
    }
    @And("User uploads photos of the car")
    public void uploads_photos_of_the_car(){
        new LetTheCarWorkPage(driver).uploadsPhotosOfTheCar("C:/QA/22-518x560.jpg");
    }
    @And("User clicks on the Submit button")
    public void clicks_on_the_Submit_button(){
        new LetTheCarWorkPage(driver).clickSubmitButton();
    }
//
    @Then("Car adding failed Message is displayed")
    public void Car_adding_failed_Message_is_displayed(){
       new LetTheCarWorkPage(driver).isMessage("JWT strings must contain exactly 2 period characters. Found: 0");
    }






}
