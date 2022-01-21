Feature: Entering details of travel 

Scenario: Positive test validating travelling data
Given Initialize the browser with chrome
Given Navigate to "https://www.irctc.co.in/nget/train-search" site
Given click on ok to remove the popup
When user enter "Adra" and "howrah" 
Then show the coresponding trains available