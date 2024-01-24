Feature: Login Movies apps Application

  Background: 
    Given Navigate to movies application

  Scenario:  verify login functionality  of movies application
    When Verify user landed on the movieapp homepage
    When Verify login heading in the login page
    Then Verify username label is displayed
    Then Verify password label is displayed
    Then click on the login button in the login page 
    Then close the browser

  Scenario: login application to movie App
    When login application empty input field
    Then close the browser

  Scenario: Application login funcationality
    Then login application empty username
    Then close the browser

  Scenario: login application without password
    When login application empty password
    Then close the browser

  Scenario: login application Invalid username and password
    Then login application Invalid username and password
    Then close the browser

  Scenario: login application valid username and password
    When login application Valid username and password
    Then close the browser

  Scenario: login application HomepageTest movies this steps
    When login application Valid username and password
    When Login Navigate Home page text findout
    Then close the browser

  Scenario: login application HomapgeTest movie this step
    When login application Valid username and password
    Then login application Hompage display play button
    Then close the browser

  Scenario: login application HomepageTest movie  apps
    When login application Valid username and password
    Then login application List of movies displayed
    Then close the browser

  Scenario: login application hompage contact us
    When login application Valid username and password
    Then login applicstion contact us text
    Then close the browser

  Scenario: login application Headersection
    When login application Valid username and password
    Then login application logo is displayed header section
    When login application Navbar is displayed
    Then close the browser

  Scenario: login application Headersection funcationalities
    When login application Valid username and password
    When login application homepage url
    When login application Navbar is displayed
    Then login application popular url
    When login application account url
    When login application check the url
    Then close the browser

  Scenario: login application popularpageTest
    When login application Valid username and password
    When login application Navbar is displayed
    When login application popular movies Verify displayed
    Then close the browser

  Scenario: login application SearchTestFuncationality
    When login application Valid username and password
    When login application Search icon click button
    When login application Search Test movies name count
    When Login application movies Count
    When login Click on the button another movies
    Then close the browser

  Scenario: login application Movies details page
    When login application Valid username and password
    When login application Check Home movie details
    When login application click the popular button
    Then login application Check popular movie details
    Then close the browser

  Scenario: ligin application Movies App acount details
    When login application Valid username and password
    When login application popular
    Then login application account
    Then login application Test the Heading
    Then login application Test page title
    Then close the browser
