#Senaryo;
  #1 siteyi açınız
  #2- username ve passwordu gönderin ve login butonuna tıklatın
  #3- Login olduğunuzu doğrulayın




Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click Login button
    Then User should login successfully