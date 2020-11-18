Feature: Create New Account

Scenario Outline: Within the Salesforce application User is able to create New Account

Given User will Open Salesforce Website
When verify title for the Salesforce page
Then user will enter "<username>" and "<password>"
And user click  the login button
And verify title for the Salesforce Home page
Then user will click on the waffle icon
Then user will navigate to the Search field and search for the Account
Then user weill verify title for the Account page
Then user will click on the New button
Then user will select the Household radio button
Then user will click the Next button within the New Account window
Then user will verify that the required fields message is displayed
Then user will populate fields within the Account Information section "<accountname>" and "<phone>" and "<assetcount>"
Then user will populate fields within the Address Inforamtion section "<billingstreet>" and "<shippingstreet>" and "<billingcity>" and "<shippingcity>" and "<billingzipcode>" and "<shippingzipcode>"
Then user will populate fields within the Cloud MDM Information
And Click on the Save button




Examples: 
	| username                           | password    | accountname | phone     | assetcount | billingstreet | shippingstreet | billingcity | shippingcity | billingzipCode | shippingzipcode |
	| vedant.jagani@campingworld.com.test| Welcome2019*| Automation1 | 1234567890| 101       | 101 Chicago St| 102 Chicago St| Chicago    |S Chicago   |60103         |60169          |
	
	  