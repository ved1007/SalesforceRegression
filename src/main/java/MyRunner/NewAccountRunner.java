package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/newaccount.feature",

        glue = {"stepDefinitions" }, 
        format = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, // to generate different types of reporting
		monochrome = true, // display the console output in a proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false // to check the mapping is proper between feature file and step def file
//      tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
	//	plugin= {"pretty", "html:test-output"}
)

public class NewAccountRunner {

}