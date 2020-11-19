package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "//Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/Opportunities.feature",

        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json",
                "junit:junit_xml/cucumber.xml"},
        monochrome = true,
        strict = true,
        dryRun = false
//      tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
       
)

public class OpportunitiesRunner {

}