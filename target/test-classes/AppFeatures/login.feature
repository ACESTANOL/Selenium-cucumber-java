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
#@tag
Feature: Login Functionality
	
  #Test Case 2: Login User with correct email and password
  @SOLO
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username "test02@yopmail.com"
    And the user enters valid password  "pass123456"
    And the user clicks the login button

 	#Test Case 3: Login User with incorrect email and password
  Scenario: Login User with incorrect email and password
    Given User is already on login page
    When Login using incorrect creadentials
    Then Error Your email or password is incorrect! should be displayed
	
	#Test Case 4: Logout User
  Scenario: Logout User
    Given User is already logged in
    When Logout user
    Then User should be navigated to login page

	#Test Case 5: Register User with existing email
  Scenario: Register User with existing email
    Given User is in on Login page
    When Register already registered email
    Then An error Email Address already exist! should be visible
