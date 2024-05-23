
Feature: As System Administrator, I want to log in to the system securely.

  Background:
      * Goes to the given "url"

    # Positive login test
  Scenario: Login with the correct company, username and password
    * Select the correct "company", enter the correct "username" and "password"
    * Click the Login button
    * Click the BEAM SYSTEM ADMINISTRATOR radio button
    * Click the Continue button
    * Confirm that the text "BEAM / SİSTEM YÖNETİCİSİ" is visible


    #Negative login test
  Scenario: Unable to login with correct company and username and incorrect password
    * Select the correct "company", enter the correct "username" and incorrect "incorrectPassword"
    * Click the Login button
    * Confirm that incorrect message is "Kullanıcı Adı veya Şifre Hatalı! Lütfen Kontrol Ediniz."

  Scenario: Unable to login with correct company, incorrect username and correct password
    * Select the correct "company", enter the incorrect "incorrectUsername" and correct "password"
    * Click the Login button
    * Confirm that incorrect message is "Kullanıcı Adı veya Şifre Hatalı! Lütfen Kontrol Ediniz."

  Scenario: Unable to login with correct company, incorrect username and  password
    * Select the correct "company", enter the incorrect "incorrectUsername" and "incorrectPassword"
    * Click the Login button
    * Confirm that incorrect message is "Kullanıcı Adı veya Şifre Hatalı! Lütfen Kontrol Ediniz."
  @test
  Scenario Outline: Unable to login with incorrect company, correct username and  password
    * Select the incorrect "<company>", enter the correct "username" and "password"
    * Click the Login button
    * Confirm that incorrect message is "Kullanıcı Adı veya Şifre Hatalı! Lütfen Kontrol Ediniz."

    Examples:
    |company|
    |TurkBilisim (o.kacar)|
    |9|
    |İİPEK|
    |8|
    |10|
    |11|
