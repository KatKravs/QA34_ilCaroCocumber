Feature: Rent Out Car
@rentoutcar
  Scenario: Provide Car Details for Rental
    Given User launches Chrome browser
    When User opens ilCarro HomePage
  And User click on Login link
  And User enters valid data
  And User click on Yalla button
    And User clicks on the Let the car work link
    And User fills Location details
    And User fills Manufacturer
    And User fills Model details
    And User fills Year
    And User selects Fuel
    And User fills Seats
    And User fills Car class
    And User fills Car registration number
    And User fills  Price
    And User fills About that car
    And User uploads photos of the car
    And User clicks on the Submit button
    Then Car adding Message is displayed