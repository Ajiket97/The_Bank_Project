Feature: Registration of para bank page

Scenario Outline: This is my  data driven test case
Given I have the login page information<Name><LastName><Address><City><State><Zip Code><Phone><SSN><Username><Password><ConfirmPass> 
Examples: 
|Name|LastName|Address|City|State|Zip Code|Phone||SSN||Username|Password|ConfirmPass|
|"ajit"|"Shingnare"|"pune"|"pune"|"pune"|"abc123"|"9876543210"||"120300"||"Ajit"|"Aj@123"|"Aj@123"|
|"ajiket"|"Shingnare"|"pune"|"pune"|"pune"|"abc123"|"9876543210"||"120300"||"Ajit"|"Aj@123"|"Aj@123"|
|"amit"|"Shingnare"|"pune"|"pune"|"pune"|"abc123"|"9876543210"||"120300"||"Ajit"|"Aj@123"|"Aj@123"|
|"VirT"|"Shingnare"|"pune"|"pune"|"pune"|"abc123"|"9876543210"||"120300"||"Ajit"|"Aj@123"|"Aj@123"|