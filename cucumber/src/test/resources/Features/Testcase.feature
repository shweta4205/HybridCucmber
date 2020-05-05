@orangeHRM
Feature: OrangeHRM Website

@tc_01_login
Scenario Outline: validate the login functionality

Given Launch the browser and enter the url
When Login page is opened
Then Enter "<username>" and "<password>"
And Click the login Button

Examples:
|username |password|
|Admin    |admin123|
|admin  |admin124|


@tc_01_admin
Scenario Outline: Enter values in Admin page


Then Click on admin
Then Enter "<username>"
Then Enter Userrole "<role>"
Then Enter EmployeeName "<en>"
Then Enter Status "<status>"
Then Click on search button

Examples:
|username|role|en|status|
|hannah.flores|ESS|Hannah Flores|Enabled|
