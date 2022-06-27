Feature: Verifying the Login functionality of FreeCRM website
#1 TestCase
Background: 
Given Opens the browser
When Enters the url 
And User clicked on login button
Then User enter username and password
And user press Login button
Then User navigate to the '<module>' page
And User nevigated to the website home page

#2 TestCase
Scenario: Checking Calendar Functionality
When User clicks on Day button
And User clicks on Week button
Then User clicks on Month button
And User clicks on Agenda button
Then User clicks on Next (>) button
And User clicks on Previous (<) button

#3 TestCase
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

#4 TestCAse
Scenario:
As a user, I want to create a New Calendar with New Name
So that I can arrange my new  Meeting easily.
Then User navigate to the Calendar page
And User click on top side
When User click on Manage Calendars button
And User click on Add Calendar plus button
And User Enter Name for New Calendar
And User click on Add button
And User can select the calendar to set it as Primary Calendar
And User click on Close button

#5 TestCase
Scenario:
As a user, I want to Logout

Then User navigate to the Calendar page
And User should select the setting option
And User select logout button

