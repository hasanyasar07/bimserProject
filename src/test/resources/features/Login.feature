@test
Feature: As System Administrator, I want to log in to the system securely.

  Background:
      * Goes to the given "url"

  Scenario: Login with the correct company, username and password
    * Select the correct "company", enter the correct "username" and "password"
    * Click the Login button
    * Click the BEAM SYSTEM ADMINISTRATOR radio button
    * Click the Continue button
    * Confirm that the text "BEAM / SİSTEM YÖNETİCİSİ" is visible




  Scenario: Unable to login with correct company and username and incorrect password

  Scenario: Unable to login with correct company, incorrect username and correct password

  Scenario: Unable to login with correct company, incorrect username and  password

  Scenario: Unable to login with incorrect companies, correct username and  password


