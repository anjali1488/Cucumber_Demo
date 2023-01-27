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

Feature: Search the hotel in Adactin app
  I want to use this feature to test the search functionality of Adactin app
  
  
  Scenario Outline: Search results displayed upon filling mandatory values

		Given User is on login page
    When user enters "<username>", "<password>"
    And user clicks on login button
    And Login is successful
    And search page is displayed
		And user selects "<location>", "<rooms>", "<check in date>", "<check out date>", "<adults>"
		And user clicks on search button
		Then search results should be displayed
		
		Examples:
		
		| username | password | location | rooms | check in date | check out date | adults |
		| santosh13 | Snoopy1234 | Melbourne | 1 - One | 13/01/2023 | 14/01/2023 | 1 - One |
		| vasuvespag | vasu1234 | Sydney | 2 - Two | 15/01/2023 | 16/01/2023 | 2 - Two |
		
		 

 
 