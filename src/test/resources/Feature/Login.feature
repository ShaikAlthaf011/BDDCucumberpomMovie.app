Feature: Login Movies apps Application

  Background: 
    Given First login url movies application

  Scenario: login to movies application
    When login Website logo is displayed
    When login application Heading Text
    Then login application label username text
    Then login application label password text
    Then login application click on the button
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
    Then close the browser
