Feature: Verifying the Login functionality of FreeCRM website

Scenario Outline: 
Given Opens the browser
When Enters the url 
And User clicked on login button
Then User enter username and password
And user press Login button
Then User navigate to the '<module>' page
And User nevigated to the website home page

Examples:
|module|
|Calendar|

