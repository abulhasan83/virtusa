Feature: validate user login credentials
Background: User is on the home page
Scenario: Verify the product search
Given User enters the product in the search field
When User clicks the search button
And User navigate to product listing
Then User should seen the desired product list
