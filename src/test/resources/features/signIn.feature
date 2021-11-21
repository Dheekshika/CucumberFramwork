Feature: signin page
Scenario: user clicks on signin link
Given user is on home page of the url
When user clicks on the signin link
Then sign in page displays
And user enter credentials
And user clicks on signin 