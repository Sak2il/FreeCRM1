Feature: Verifying the Login functionality of FreeCRM website
Background: 
Given Opens the browser
When Enters the url 
And User clicked on login button
Then User enter username and password
And user press Login button
Then User navigate to the Calendar page

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
