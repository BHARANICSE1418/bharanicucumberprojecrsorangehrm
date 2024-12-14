Feature: Facebook Login Functionality 

@Facebookopen
Scenario: Successful login with valid credentials 
Given User is on the Facebook login page
When User enters "username" in the username field
And User enters "password" in the password field
When User clicks on the Login button 
Then User should be successfully logged in to Facebook