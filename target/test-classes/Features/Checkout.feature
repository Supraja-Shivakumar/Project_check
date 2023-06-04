Feature: Search and Place the order for products

@PlaceOrder

Scenario Outline: Search Experience for the product seach in both home and offers page

Given User is on GreenCart Landing Page
When User searched with Shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <Name> in checkout page 
And Verify the user has the ability to enter promo code and place the order

Examples:
|Name|
|Tom|

