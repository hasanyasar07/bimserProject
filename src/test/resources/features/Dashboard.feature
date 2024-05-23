@dashboard
Feature: As System Administrator, I want to see vacation days.


  Scenario: show the vacation days page after logging in as administrator
    * Goes to the given "url"
    * Select the correct "company", enter the correct "username" and "password"
    * Click the Login button
    * Click the BEAM SYSTEM ADMINISTRATOR radio button
    * Click the Continue button
    * Click the Application Menu
    * Click the System button
    * Click the Common Definitions button
    * Click Vacation Days button
    * Confirm that Vacation Days page is visible
