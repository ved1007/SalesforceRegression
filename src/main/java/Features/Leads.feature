Feature: Created New Lead 

Scenario Outline: Within the Salesforce application User is able to create new leads

	Given Salesforce site 
	When Salesforce page title as "Login | Salesforce" 
	Then Login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter "<username>" and "<password>" 
	And  Click login btn 
	And Salesforce Home page title as "Home | Salesforce"
	And Click Leads tab 
	Then Click New button
#	Then Click on Next button
	Then Click on Save button
	Then Populate the Search Criteria fields
	Then Click Search


	Examples: 
		| username                           | password    | 
		| vedant.jagani@campingworld.com.test| Welcome2019*|