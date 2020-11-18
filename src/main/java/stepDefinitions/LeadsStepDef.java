package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.excel.test.utility.Xls_Reader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LeadsPage;

public class LeadsStepDef {

    WebDriver driver;
    Xls_Reader reader = new Xls_Reader(
            "/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/SampleData/ExcelTestData.xlsx");

    String WorksheetID = reader.getCellData("Sheet2Opportunities", "WorksheetID", 2);
    LeadsPage lead = new LeadsPage();

    @Given("^Salesforce site$")
    public void salesforce_site() {
        lead.setup();

    }

    @When("^Salesforce page title as \"([^\"]*)\"$")
    public void salesforce_page_title_as(String SFTitle) {
        String title = lead.getTitle();
        System.out.println(title);
        Assert.assertEquals(SFTitle, title);

    }

    @Then("^Login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_as_Dealer_Sales_or_DealerSalesManagerOrSystemAdmin_enter_and(String userName, String pwd) {
        lead.userNamefield(userName);
        lead.passwordField(pwd);
    }

    @Then("^Click login btn$")
    public void click_login_btn() throws InterruptedException {
        lead.loginBtnClick();
    }

    @Then("^Salesforce Home page title as \"([^\"]*)\"$")
    public void salesforce_Home_page_title_as(String SFHomePageTitle) throws InterruptedException {
        Thread.sleep(10000);
        String HomepageTitle = lead.getTitle();
        System.out.println("Vedant: " + HomepageTitle);
        Assert.assertEquals(SFHomePageTitle, HomepageTitle);
    }

    @Then("^Click Leads tab$")
    public void click_Leads_tab() {
        lead.leadTabClick();

    }

    @Then("^Click New button$")
    public void click_on_the_New_button() {
        lead.newBtnClick();

    }
//      @Then("^Click on Next button$")
//       public void click_on_Next_button()  {
//           lead.nextBtnClick();
//       }

    @Then("^Click on Save button$")
    public void Click_on_Save_button() {
       lead.saveBtnClick();

    }

    @Then("^Populate the Search Criteria fields$")
    public void populate_the_Search_Criteria_fields()  {

    }

    @Then("^Click Search$")
    public void click_Search()  {

    }
}
