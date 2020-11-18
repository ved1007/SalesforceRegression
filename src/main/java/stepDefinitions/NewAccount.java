package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccount {

	WebDriver driver;

	@Given("^User will Open Salesforce Website$")
	public void user_will_Open_Salesforce_Website() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^verify title for the Salesforce page$")
	public void verify_title_for_the_Salesforce_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);

	}

	@Then("^user will enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_enter_and(String arg1, String arg2) {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);

	}

	@Then("^user click  the login button$")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^verify title for the Salesforce Home page$")
	public void verify_title_for_the_Salesforce_Home_page() throws InterruptedException {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);
		Thread.sleep(4000);

	}

	@Then("^user will click on the waffle icon$")
	public void user_will_click_on_the_waffle_icon() throws InterruptedException {

		Actions action = new Actions(driver);
		WebElement waffle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		action.moveToElement(waffle).click().build().perform();

		System.out.println("Clicked on the Waffle button");
		Thread.sleep(3000);

		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception e) {

			System.out.println("Alert pop up is closed");

		}

	}

	@Then("^user will navigate to the Search field and search for the Account$")
	public void user_will_navigate_to_the_Search_field_and_search_for_the_Account() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys("Accounts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

// Verify page title
	@Then("^user weill verify title for the Account page$")
	public void user_weill_verify_title_for_the_Account_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Recently Viewed | Accounts | Salesforce", title);
	}

// Click on New button
	@Then("^user will click on the New button$")
	public void user_will_click_on_the_New_button() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']")));
		button.click();

	}

	@Then("^user will select the Household radio button$")
	public void user_will_select_the_Household_radio_button() {

	}

	@Then("^user will click the Next button within the New Account window$")
	public void user_will_click_the_Next_button_within_the_New_Account_window() {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement nextButton = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
		nextButton.click();

	}

	@Then("^user will verify that the required fields message is displayed$")
	public void user_will_verify_that_the_required_fields_message_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement saveButton = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Save']")));
		saveButton.click();

		String requiredFieldMessage = driver
				.findElement(By.xpath("//span[contains(text(), 'Review the errors on this page.')]")).getText();
		String expected = "Review the errors on this page.";
		Assert.assertEquals(requiredFieldMessage, expected);

		// Take screenshot and store as a file format
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// now copy the screenshot to desired location using copyFile //method
		try {
			FileUtils.copyFile(source,
					new File("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/Screenshots/RequiredField.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^user will populate fields within the Account Information section \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_populate_fields_within_the_Account_Information_section_and_and(String accountname,
			String phone, String assetcount) throws Throwable {

//Account Name field		
		driver.findElements(By.xpath("//input[@class=' input' and @type='text']")).get(0).sendKeys(accountname);
//Phone field		
		driver.findElement(By.xpath("//input[@class=' input' and @type='tel']")).sendKeys(phone);
//Asset Count
		driver.findElement(By.xpath("//input[@class = 'input uiInputSmartNumber']")).sendKeys(assetcount);
//Close Date
		driver.findElements(By.xpath("//input[@class=' input' and @type='text']")).get(1).click();
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("31")) {
				dates.get(i).click();
				break;
			}
		}
	}

	@Then("^user will populate fields within the Address Inforamtion section \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_populate_fields_within_the_Address_Inforamtion_section_and_and_and_and_and(String billingstreet,
			String shippingstreet, String billingcity, String shippingcity, String abillingzipcoderg5, String shippingzipcode) throws Throwable {

		// Billing Street
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Billing Street']")).click();

		driver.findElement(By.xpath("//textarea[@placeholder='Billing Street']")).sendKeys(billingstreet);
//		driver.findElement(By.xpath("*[id^='239:'][id$='a']")).sendKeys("billingstreet");

		// Shipping Street
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Shipping Street']")).click();

		driver.findElement(By.xpath("//textarea[@placeholder='Shipping Street']")).sendKeys(shippingstreet);
		// Billing City
		driver.findElement(By.xpath("//input[@placeholder='Billing City']")).sendKeys(billingcity);

		// Billing States dropdown field
		driver.findElement(By.xpath("//a[contains(text(),'None') and @data-interactive-lib-uid='17']")).click();
		driver.findElement(By.xpath("//a[@title='Illinois']")).click();

		// Shipping City
		driver.findElement(By.xpath("//input[@placeholder='Shipping City']")).sendKeys(shippingcity);

		// Shipping States dropdown field
//		driver.findElement(By.xpath("//a[contains(text(),'None') and @data-interactive-lib-uid='22']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[@title='Alaska']")).click();

		WebElement ele = driver
				.findElement(By.xpath("//a[contains(text(),'None') and @data-interactive-lib-uid='22']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);

		// Billing Zip Code
		driver.findElement(By.xpath("//input[@placeholder='Billing Zip/Postal Code']")).sendKeys(shippingzipcode);

		// Shipping Zip Code
		driver.findElement(By.xpath("//input[@placeholder='Shipping Zip/Postal Code']")).sendKeys(shippingzipcode);
	}

	@Then("^user will populate fields within the Cloud MDM Information$")
	public void user_will_populate_fields_within_the_Cloud_MDM_Information() {

		// Account Source
		driver.findElement(By.xpath("//a[contains(text(),'None') and @data-interactive-lib-uid='23']")).click();
		driver.findElement(By.xpath("//a[@title='Internet']")).click();

		// Brand Strategy
		driver.findElement(By.xpath("//a[contains(text(),'None') and @data-interactive-lib-uid='26']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CWRV')]")).click();

		// Acxiom Household ID
		driver.findElement(By.xpath("//input[@data-interactive-lib-uid='24']")).sendKeys("Acxiom Household ID field");

		// QAS Billing Validation Time stamp
		driver.findElement(By.xpath("//input[@data-interactive-lib-uid='27']"))
				.sendKeys("QAS Billing validation Status field");

		// QAS Billing Validation Timestamp
		driver.findElements(By.xpath("//input[@class=' input' and @type='text']")).get(4).click();

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));

		int total_node = dates.size();

		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();

			if (date.equals("30")) {
				dates.get(i).click();
				break;
			}
		}

		// Select Time
		driver.findElements(By.xpath("//input[@class=' input' and @type='text']")).get(5).clear();
		driver.findElements(By.xpath("//input[@class=' input' and @type='text']")).get(5).sendKeys("5:00 AM");

	}

	@Then("^Click on the Save button$")
	public void click_on_the_Save_button() {
		driver.findElements(By.xpath("//span[contains(text(),'Save')]")).get(2).click();

		// Take screenshot and store as a file format
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// now copy the screenshot to desired location using copyFile //method
		try {
			FileUtils.copyFile(source,
					new File("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/Screenshots/AccountCreated.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//	@Then("^use will close the application$")
//	public void use_will_close_the_application() {
//		driver.findElement(By.xpath("//button[@title='Cancel']")).click();
//		driver.quit();
//		System.out.println("Salesforce application is closed");

//		driver.findElements(By.xpath("werwerewrewrewr")).get(1).click();
//	}
