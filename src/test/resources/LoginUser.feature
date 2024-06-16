Feature: Veriy user login sucessfully

Scenario Outline: Data driven test case for user login
Given : User login details ID<id> Pass<password>
Examples: 
|id|password|
|"Viru18"|"Viru02"|
|"Viru18"|"Viru0"|
|"Viru8"|"Viru02"|
|"Viru8"|"Viru0"|