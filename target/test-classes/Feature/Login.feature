Feature: Login Movies apps Application

  Background: 
    Given Navigate to movies application

  Scenario: verify login functionality  of movies application
    When Verify user landed on the movieapp homepage
    When Verify login heading in the login page
    Then Verify username label is displayed
    Then Verify password label is displayed
    Then click on thelogin button in the login page
    Then close the browser

  Scenario: login application to movie App
    When Verify empty input fields in the login page
    Then close the browser

  Scenario: Application login funcationality
    Then Verify empty username input field
    Then close the browser

  Scenario: login application without password
    When Verify empty password input field
    Then close the browser

  Scenario: login application Invalid username and password
    Then verify the Invalid username and password text is displayed
    Then close the browser

  Scenario: login application valid username and password
    When Enter Valid username and password and click on the login button
    Then close the browser

  Scenario: login application HomepageTest movies this steps
    When Enter Valid username and password and click on the login button
    When Verify user navigated to Homepage
    Then close the browser

  Scenario: login application HomapgeTest movie this step
    When Enter Valid username and password and click on the login button
    Then Verify play button is displayed in moviesapp homepage
    Then close the browser

  Scenario: login application HomepageTest movie  apps
    When Enter Valid username and password and click on the login button
    Then verify List of movies card are displayed
    Then close the browser

  Scenario: login application hompage contact us
    When Enter Valid username and password and click on the login button
    Then Verify contact button text is displayed are not
    Then close the browser

  Scenario: login application Headersection
    When Enter Valid username and password and click on the login button
    Then Verify Movies Banner is displayed
    When Verify Navbar is displayed
    Then close the browser

  Scenario: login application Headersection funcationalities
    When Enter Valid username and password and click on the login button
    When Verify homepage url
    When Verify Movies Banner is displayed
    When Verify account page url
    When Verify User Profile page url
    Then close the browser

  Scenario: login application popularpageTest
    When Enter Valid username and password and click on the login button
    When Verify Movies Banner is displayed
    When Verify the popular movies is displayed
    Then close the browser

  Scenario: login application SearchTestFuncationality
    When Enter Valid username and password and click on the login button
    When Verify Click on the button
    When Verify movies name count
    When Verify movies Count
    When verify the Navigate another page
    Then close the browser

  Scenario: login application Movies details page
    When Enter Valid username and password and click on the login button
    When Verify Check Movie Home Page details
    When verify click on the button popular page
    Then Verify and Check the popular movie details
    Then close the browser

  Scenario: login application Movies App acount details
    When Enter Valid username and password and click on the login button
    When Veriify navigate popular page
    Then verify navigate profile page
    Then Verify navigate profile page get heading Text
    Then verify profile page title
    Then close the browser

  Scenario: login application Movies profile page
    When Enter Valid username and password and click on the login button
    When Veriify navigate popular page
    Then verify navigate profile page
    When Verify profile login page text membership heading
    Then Verify prigile login page plan detail heading
    Then close the browser
