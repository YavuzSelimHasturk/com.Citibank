
Feature: Citibank
@wip
  Scenario: CitiFX PULSE login process

    Given user goes to Citibank homepage
    And  verify that Citibank homepage has been opened
    And user goes to login page by clicking CitiFX Pulse from Online Services
    And verify that CitiFX Pulse login page has been opened
    And user enter user id
    And user clicks Continue button
    And user enter password
    And user click login button
    Then user verify that the "Login Failed" warning is displayed




