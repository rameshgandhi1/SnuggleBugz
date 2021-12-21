@smoke @regression
Feature: Validate the forgot password functionality of SnuggleBugz
Scenario: Validate the forgot password with invalid email address
Given User should launch chrome browser and load url
When Move the cursor into page header and click
And Move the cursor into my account click
And User should click the forgot passwod link
And User should type the invalid email Address 
         #2D map
         |ramesh|gandhi|marvin|
         |123456|088777|777789|
         |677655|789976|007877|
         
And User should click the send button
Then User should navigate to forgot password page


