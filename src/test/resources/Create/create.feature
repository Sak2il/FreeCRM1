Feature: Verifying the Login functionality of FreeCRM website
Background: 
Given Opens the browser
When Enters the url 
And User clicked on login button
Then User enter username and password
And user press Login button
Then User navigate to the Calendar page

Scenario:
As a user, I want to create a new meeting for valid Title
So that I can access my newly created Meeting easily.



When user click on Create button
And user enters valid Title
#And User select Start Date and End Date
And User Select the Category from dropdown list
And User select Tags of Calendar
And user enters detailed Description
And user enter Location of meeting
And user select the Information about Deals
And User enters the Task to be perform
And user select the Case from list
#And User select alert before meeting time 
#And User get alert message Via Mail
#And User select the  member to whom the project is Assigned to
And User select the name of Participants
And User Select the name of Company
And User Select the name of Identifier
Then user click on Save button
And User navigate to the particular Calendar info page