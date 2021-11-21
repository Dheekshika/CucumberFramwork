Feature: Search product
Scenario: Search the product in the search box of the url
Given user is on the url
When user enters NewYear gifts in the searchbox
Then product page displays
And user clicks on the products option
And clicks on dropdown to select price from low to high