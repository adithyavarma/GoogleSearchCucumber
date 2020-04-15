Feature: Browsing Google for testing

Scenario: Google Web Browsing

Given User is in Google Home Page
When Title of page is Google
Then Click on Im Feeling Lucky button
When Title of page is Google Doodles
Then Navigate back to the Google Home Page
Then Enter data in the search text box
Then Click on Google Search button
When Title of page is entered search data
Then close the browser