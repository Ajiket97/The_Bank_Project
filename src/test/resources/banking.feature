Feature: Registration of para bank

Scenario: Verify State Required Or not
When Click on Register button
And fill the form
Then Get the message

Scenario: Verify SSN Number Required Or not
Given User is already on the Sign up form
Then Getting the message