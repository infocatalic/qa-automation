Feature: to test login functionality of acti
Scenario: verify login is successful with valid credentials
Given browser is open
And user is on login page
When usre enters UN and PWD
And click on login button
Then user should navigate to home page
