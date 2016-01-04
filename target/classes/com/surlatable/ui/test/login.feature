@SmokeTest
Feature: Login Functionality Feature

In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working

@positiveScenario
Scenario Outline: Login Functionality

Given user navigates to "<url>"  
When click login or register link
And logs in using Email as "<email>" 
And password as a "<password>"
And clicks the Submit button
Then login should be successful
And Home page should be displayed
And should be able to logout successfully

Examples:
|     url 				     | 	     email         		|	password         	|
|http://www.surlatable.com/  | ayuube1977@gmail.com   	|	abdi2006        	|


