Feature: Verifying the Login functionality of FreeCRM website
Background: 
Given Opens the browser
When Enters the url 
And User clicked on login button
Then User enter username and password
And user press Login button
Then User navigate to the Calendar page

Scenario: Checking Calendar Functionality
When User clicks on Day button
And User clicks on Week button
Then User clicks on Month button
And User clicks on Agenda button
Then User clicks on Next (>) button
And User clicks on Previous (<) button


