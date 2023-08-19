#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: MyAccount-Login Feature
 Description: This feature will test a login functionality

  Scenario: Login With valid username and password
    Given Open Browser
    When Enter the url "https://practice.automationtesting.in/"
    And Click on My Account menu
    And Enter registered username and password
    And Click on login button
    Then User must successfully login to the webpage
