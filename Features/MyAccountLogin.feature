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

#Simple login without parameters
#Feature: MyAccount-Login Feature
#	Description: This feature will test a login functionality
#
#		Scenario: Login With valid username and password
#		Given Open Browser
#		When Enter the url "https://practice.automationtesting.in/"
#		And Click on My Account menu
#		And Enter registered username and password
#		And Click on login button
#		Then User must successfully login to the webpage

#Feature: MyAccount-Registration
#	Description: This feature will test registration functionality
#		Scenario : Registration with valid email_id and password
#		Given Open Browser
#		When Enter the url: "https://practice.automationtesting.in/"
#		And Click on Account Menu
#		And Enter Email address and password
#		And Click on register
#		Then User must register sucessfully

#Login with Parameter passed from feature file
#Feature: MyAccount-Login Feature
#Description: This feature will test a login functionality
#
#Scenario: Login With valid username and password
#			Given Open Browser
#			When Enter the url "https://practice.automationtesting.in/"
#			And Click on My Account menu
#			And Enter registered username "abad@gmail.com" and password "malanahimahit"
#			And Click on login button
#			Then User must successfully login to the webpage


#Login with Scenario outlines and example
#Use to pass multiple username and password for same scenario
#Feature: MyAccount-Login Feature
  #Description: This feature will test a login functionality
#
  #Scenario Outline: Login With valid username and password
    #Given Open Browser
    #When Enter the url "https://practice.automationtesting.in/"
    #And Click on My Account menu
    #And Enter registered username "<username>" and password "<password>" 
    #And Click on login button
    #Then verify login
#
    #Examples: 
      #| username       | password       |
      #| abad           | malanahiamahit |
      #| swaroopkorde24 | 9767279102		 |
      #| aba            | abcd           |

      
#Add multiple values using data table parameters
Feature: MyAccount-Login Feature
  Description: This feature will test a login functionality

  Scenario Outline: Login With valid username and password
    Given Open Browser
    When Enter the url "https://practice.automationtesting.in/"
    And Click on My Account menu
    And Enter registered username and password
          | abw | malanahimahit |
    And Click on login button
    Then User must successfully login to the webpage
