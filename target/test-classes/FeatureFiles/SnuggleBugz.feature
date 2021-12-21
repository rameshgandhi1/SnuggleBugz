Feature: To validate the login functionality of SnuggleBugz
@sanity
Scenario: Validate the login page with invalid username and invalid password
Given You should launch the browser and load SnuggleBugz Page
When Move the cursor into page header and click
And Move the cursor into my account click
And User should type username in the SnuggleBugz
And user should type password in the SnuggleBugz
And User should click login button
And I need to print the title of my page
Then User should naviagte to incorrect credential page

@regression
Scenario Outline: To validate the login page with valid username and invalid password
Given You should launch the browser and load SnuggleBugz Page
When Move the cursor into page header and click
And Move the cursor into my account click
And User should type the valid username "<user>" in the snuggle page
And I need to print the current url of page
And user should type the invalid password in the snuggle page "<pass>"
And User should click the login button
Then User should navigate to incorrect credential page

Examples:
         |user||pass|
         |java||java@123|
        
         






