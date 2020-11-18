package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadsPage extends BasePageTest {

    By UserNameField = By.id("username");
    By PasswordField = By.id("password");
    By LeadsTabClick = By.xpath("//a[@title='Leads']");
    By LoginBtnClick = By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']");
    By NewButtonClick = By.xpath("//div[@title='New']");
    //   By NextBtnClick = By.xpath("//span[contains(text(),'Next')]");
    By SaveBtnClick = By.xpath("*[data-aura-rendered-by^='182:'][data-aura-rendered-by$='a']");
    By FirstNameInputField = By.id("input-2");
    By LastNameInputField = By.id("input-3");
    By EmailNameInputField = By.id("input-4");
    By PhoneNameInputField = By.id("input-5");
    By IDSCustomerInputField = By.id("input-6");
    By GoodSamMembershipNumInputField = By.id("input-7");
    By AddressInputField = By.id("input-8");
    By CityInputField = By.id("input-9");
    By StateInputField = By.id("input-10");
    By ZipInputField = By.id("input-11");

    public void userNamefield(String username) {

        $(UserNameField).sendKeys(username);
    }

    public void passwordField(String password) {
        $(PasswordField).sendKeys(password);

    }

    public void loginBtnClick() {
        $(LoginBtnClick).click();

    }

    public void salesForceHomePageTitle(String SFHomePageTitle) {
        String HomepageTitle = driver.getTitle();
        System.out.println(HomepageTitle);
        Assert.assertEquals(SFHomePageTitle, HomepageTitle);
        driver.navigate().refresh();

    }

    public void leadTabClick() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", $(LeadsTabClick));

    }

    public void newBtnClick() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", $(NewButtonClick));

    }

//	public void nextBtnClick() {
//		$(NextBtnClick).click();
//
//	}

    public void saveBtnClick() {
        //      $(SaveBtnClick).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable((SaveBtnClick))).click();

//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", $(SaveBtnClick));


    }

    public void firstNameInputField() {
        $(FirstNameInputField).sendKeys("Firstname");

    }

    public void lastNameInputField() {
        $(LastNameInputField).sendKeys("LastName");

    }

    public void eMailInputField() {
        $(EmailNameInputField).sendKeys("Email");

    }

    public void phoneInputField() {
        $(PhoneNameInputField).sendKeys("Phone");

    }

    public void idsCustomerNumInputField() {
        $(IDSCustomerInputField).sendKeys("IDS Customer Number");

    }

    public void goodSamMembershipNumInputField() {
        $(GoodSamMembershipNumInputField).sendKeys("Good Same membership");

    }

    public void addressInputField() {
        $(AddressInputField).sendKeys("Address field");

    }

    public void cityInputField() {
        $(CityInputField).sendKeys("City field");
    }

    public void stateInputField() {
        $(StateInputField).sendKeys("States field");

    }

    public void zipInputField() {
        $(ZipInputField).sendKeys("60103");

    }

}
