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

@FunctionalTest
Feature: Sample Application
How to ignore some scenarios and run only what we need

 

@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a blank test

 

@RegressionTest
Scenario: Unsuccessful Login
Given This is a blank test

 

@SmokeTest
Scenario: Add product to cart
Given This is a blank test

 


Scenario: Add multiple products to cart
Given This is a blank test

 

@SmokeTest @RegressionTest
Scenario: Remove product from cart
Given This is a blank test

 

@RegressionTest
Scenario: Remove all products from cart
Given This is a blank test  

 

@SmokeTest
Scenario: Product quantity from cart page
Given This is a blank test  

 


Scenario: Decrease product quantity from cart page
Given This is a blank test  

 

@SmokeTest @E2ETest
Scenario: Buy product with cash payment
Given This is a blank test  

 

@SmokeTest @E2ETest
Scenario: Buy product with CC payment
Given This is a blank test  

 

@E2ETest
Scenario Outline: Payment Declined
Given This is a blank test  

 


Examples: 
| Payment Method | 
| CC |
| DC |
| Net Banking |
| Wallet |

 

 

 