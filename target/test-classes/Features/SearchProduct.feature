Feature: Search and Place the order for products
@OfferPage
Scenario Outline: Search Experience for the product seach in both home and offers page
Given User is on GreenCart Landing Page
When User searched with Shortname <Name> and extracted actual name of product
Then User searched for <Name> same shortname in offers page 
And  Check if product exist with same name in landing page
Examples:
|Name|
|Tom|
|Beet|
