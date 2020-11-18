package pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

public class OpportunitiesPage extends BasePageTest {

	By userNameField = By.id("username");
	By passwordField = By.id("password");
	By LogInToSandboxBtn = By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']");
	By ClickOnOpportunityTab1 = By.xpath("//a[@title='Opportunities']");
	By NewButton = By.xpath("//div[@title='New']//parent::a[@class='forceActionLink']");
	By NextBtn = By.xpath("//span[contains(text(),'Next')]");
	By WorkSheetIDInputField = By.cssSelector("*[id^='31:'][id$='a']");
	By DateAndTimeCalendar1 = By.cssSelector("*[id^='51:'][id$='a']");
	By PromoMessageInputField = By.cssSelector("*[id^='117:'][id$='a']");
	By CustomerNumberInputField = By.cssSelector("*[id^='302:'][id$='a']");
	By QuoteNumberInputField = By.cssSelector("*[id^='368:'][id$='a']");

//    By ELeadCheatCheckBox = By.cssSelector("*[id^='172:'][id$='a']");
	By opportunityNameInput = By.cssSelector("*[id^='501:'][id$='a']");
	By AmountInputField = By.cssSelector("*[id^='517:'][id$='a']");
	By AccountNameSearchField1 = By.cssSelector("*[id^='586:'][id$='a']");
	By AccountNameSearchFieldPopulat = By.xpath("//div[contains(text(),'Jagani3, Vedant3')]");

	By CloseDateClick = By.cssSelector("*[id^='662:'][id$='a']");

	By StageClick = By.cssSelector("*[data-aura-rendered-by^='792:'][data-aura-rendered-by$='a']");
	By StageValueSelected = By.xpath("//a[@title='In-Process']");

	By NicknameInputField = By.cssSelector("*[id^='842:'][id$='a']");
	By ExpirationDate1 = By.cssSelector("*[id^='882:'][id$='a']");

	By ProbabilityInputField = By.cssSelector("*[id^='1013:'][id$='a']");

	By OpportunitySellingOwnerNamefield = By.cssSelector("*[id^='997:'][id$='a']");
	By DroppedDealershipfield = By.cssSelector("*[id^='1071:'][id$='a']");
	By IDSCustomerNumber = By.cssSelector("*[id^='1045:'][id$='a']");
	By IDSFIQuoteNumber = By.cssSelector("*[id^='1101:'][id$='a']");
	By ReviewRequestedDate = By.cssSelector("*[id^='1159:'][id$='a']");
	By ReviewRequestedDatePopulated = By.xpath("//table[@class='calGrid']//td");

	By FirstSurveyAttemptDate = By.cssSelector("*[id^='1204:'][id$='a']");
	By FirstSurveyAttemptDatePopulate = By.xpath("//table[@class='calGrid']//td");

	By WriteUpAmountInputField = By.cssSelector("*[id^='1186:'][id$='a']");
	By CountryField = By.cssSelector("*[id^='1241:'][id$='a']");
	By eLeadCreateDateClick = By.cssSelector("*[id^='1179:'][id$='a']");
	
	By DealershipSearchBoxClick = By.cssSelector("*[id^='1284:'][id$='a']");
	By DealershipSearchFieldPopulate = By.xpath("//div[@title='CNC CONCORD NC RVSALES']");

	By CustomerAppointmentDateAndTimeField = By.cssSelector("*[id^='1520:'][id$='a']");
	By CustomerAppointmentDateAndTimeCalender = By.xpath("//table[@class='calGrid']//td");

	By TypeDropDownFieldClick = By.cssSelector("*[aria-describedby^='1474:'][aria-describedby$='a-label']");
	By TypeDropDownFieldPopulate = By.xpath("//a[contains(text(),'New Business')]");

	By AppointmentCompletedDateField = By.cssSelector("*[id^='1672:'][id$='a']");
	By AppointmentCompletedDateFieldCalender = By.xpath("//table[@class='calGrid']//td");

	By CustomerDeliveryDateAndTimeField = By.cssSelector("*[id^='1715:'][id$='a']");
	By CustomerDeliveryDateAndTimeCalender = By.xpath("//table[@class='calGrid']//td");
	// By AppointmentSetCheckbox = By.xpath("*[id^='1375:'][id$='a']");
//	By DeliverySetCheckbox = By.xpath("*[id^='1471:'][id$='a']");
//	By ContactedCheckBox = By.xpath("*[id^='1507:'][id$='a']");
//	By UpAssignedCheckbox = By.xpath("*[id^='1487:'][id$='a']");
//	By RepliedCheckBox = By.xpath("*[id^='1599:'][id$='a']");
//    By FirstResponseTimeField = By.cssSelector("*[id^='1523:'][id$='a']");
//    By FirstResponseTimeFieldCalender = By.xpath("//table[@class='calGrid']//td");
//    By PDIPrintedDateAndTimeField = By.cssSelector("*[id^='1563:'][id$='a']");
//    By PDIPrintedDateAndTimeCalender = By.xpath("//table[@class='calGrid']//td");
//    By BusinessAdjustedCreatedDateField = By.cssSelector("*[id^='1633:'][id$='a']");
//    By BusinessAdjustedCreatedDateCalender = By.xpath("//table[@class='calGrid']//td");
//    By BusinessAdjustedCreatedDateEndField = By.cssSelector("*[id^='1687:'][id$='a']");
//    By BusinessAdjustedCreatedDateEndCalender = By.xpath("//table[@class='calGrid']//td");
//    By BusinessAdjustedCreatedDateStartField = By.cssSelector("*[id^='1741:'][id$='a']");
//    By BusinessAdjustedCreatedDateStartCalender = By.xpath("//table[@class='calGrid']//td");
	By NewUsedYearToClick = By.cssSelector("*[aria-describedby^='2032:'][aria-describedby$='a-label']");
	By NewUsedYearToPopulate = By.xpath("//a[@title='New']");
	By YearFromClick = By.cssSelector("*[aria-describedby^='1982:'][aria-describedby$='a-label']");
	By YearFromPopulate = By.xpath("//a[@title='2017']");
	By YearToClick = By.cssSelector("*[aria-describedby^='2078:'][aria-describedby$='a-label']");
	By YearToPopulate = By.xpath("//a[@title='2017']");
	By PriceToClick = By.cssSelector("*[aria-describedby^='2330:'][aria-describedby$='a-label']");
	By PriceToPopulate = By.xpath("//a[contains(text(),'4,000')]");
	
	By PaymentFromClick = By.cssSelector("*[aria-describedby^='2456:'][aria-describedby$='a-label']");
	By PaymentFromPopulate = By.xpath("//a[@title='75']");
	
	By PaymentToClick = By.cssSelector("*[aria-describedby^='2582:'][aria-describedby$='a-label']");
	By PaymentToPopulate = By.xpath("//a[@title='100']");
	
	By LengthFromClick = By.cssSelector("*[aria-describedby^='2708:'][aria-describedby$='a-label']");
	By LengthFromPopulate = By.xpath("//a[@title='6 ft']");
	
	By LengthToClick = By.cssSelector("*[aria-describedby^='2804:'][aria-describedby$='a-label']");
	By LengthToPopulate = By.xpath("//a[@title='10 ft']");
	
	By FloorplanStyleClick = By.cssSelector("*[aria-describedby^='2758:'][aria-describedby$='a-label']");
	By FloorplanStylePopulate = By.xpath("//a[@title='Park Model']");
	
	By GeniusNotes1RVAttributes = By.cssSelector("*[id^='2854:'][id$='a']");
	By NumberSlideOutsInputField = By.cssSelector("*[id^='2880:'][id$='a']");
	By Notes2MeetAndGreetInput = By.cssSelector("*[id^='2902:'][id$='a']");
	By GeniusNotes3TradeNotesInputField = By.cssSelector("*[id^='2946:'][id$='a']");
	By NumSleepsInputField = By.cssSelector("*[id^='2990:'][id$='a']");

	// By PriceFromClick =
	// By.cssSelector("*[aria-describedby^='2100:'][aria-describedby$='a-label']");
	// By PriceFromPopulate = By.xpath("//a[contains(text(),'6000')]");

	By InterestedTypeInputField = By.cssSelector("*[id^='3037:'][id$='a']");
	By InteriorColorInputField = By.cssSelector("*[id^='3053:'][id$='a']");
	By InterestedCategoryInputField = By.cssSelector("*[id^='3073:'][id$='a']");	
	By ExteriorColorInputField = By.cssSelector("*[id^='3089:'][id$='a']");	
	By InterestedYearInputField = By.cssSelector("*[id^='3109:'][id$='a']");
	By NumberDoorsInputField = By.cssSelector("*[id^='3125:'][id$='a']");
	By InterestedMakeInputField = By.cssSelector("*[id^='3147:'][id$='a']");
	By MileageInputField = By.cssSelector("*[id^='3163:'][id$='a']");	
	By InterestedModelInputField = By.cssSelector("*[id^='3185:'][id$='a']");	
	By VehicleOptionsInputField = By.cssSelector("*[id^='3201:'][id$='a']");
	By InterestedProductInput = By.cssSelector("*[id^='3221:'][id$='a']");
	By InterestLevelDropdownClick = By.cssSelector("*[aria-describedby^='3237:'][aria-describedby$='a-label']");
	By InterestLevelDropdownPopulate = By.xpath("//a[@title='Highly Interested']");	
	By VehicleTrimInputField = By.cssSelector("*[id^='3287:'][id$='a']");
	By BuyingHorizonInputField = By.cssSelector("*[id^='3303:'][id$='a']");	
	By VehicleEngineInputField = By.cssSelector("*[id^='3323:'][id$='a']");
	By PaymentMethodDropdownClick = By.cssSelector("*[aria-describedby^='3339:'][aria-describedby$='a-label']");
	By PaymentMethodDropdownPopulate = By.xpath("//a[@title='Finance']");	
	By ChassisDropdownClick = By.cssSelector("*[aria-describedby^='3389:'][aria-describedby$='a-label']");
	By ChassisDropdownPopulate = By.xpath("//a[@title='Chevrolet Express 3500']");
	By PaymentDetailsInput = By.cssSelector("*[id^='3435:'][id$='a']");
	By TransmissionField = By.cssSelector("*[id^='3455:'][id$='a']");
	By VehiclePricingField = By.cssSelector("*[id^='3471:'][id$='a']");		
	By InterestedStockField = By.cssSelector("*[id^='3491:'][id$='a']");	
	By VehicleCommentsField = By.cssSelector("*[id^='3507:'][id$='a']");
	By InterestedIdField = By.cssSelector("*[id^='3527:'][id$='a']");
	By WebpageField = By.cssSelector("*[id^='3543:'][id$='a']");
	By ToyDeskDropdownClick = By.cssSelector("*[aria-describedby^='3564:'][aria-describedby$='a-label']");
	By ToyDeskDropdownPopulate = By.xpath("//a[@title='Yes']");
	By OutDoorKitchenDropdownClick = By.cssSelector("*[aria-describedby^='3630:'][aria-describedby$='a-label']");
	By OutDoorKitchenDropdownPopulate = By.xpath("//a[@title='Yes']");
	By OutdoorEntertainmentkDropdownClick = By.cssSelector("*[aria-describedby^='3696:'][aria-describedby$='a-label']");
	By OutdoorEntertainmentDropdownPopulate = By.xpath("//a[@title='No']");
	By PreviousStageDropdownClick = By.cssSelector("*[aria-describedby^='3912:'][aria-describedby$='a-label']");
	By PreviousStageDropdownPopulate = By.xpath("//a[@title='In-Process']");
	By TowVehicleYearField = By.cssSelector("*[id^='3973:'][id$='a']");
	By MaxTowingCapacityField = By.cssSelector("*[id^='3991:'][id$='a']");	
	By TowVehicleMakeField = By.cssSelector("*[id^='4013:'][id$='a']");	
	By TowVehicleModelField = By.cssSelector("*[id^='4047:'][id$='a']");
	By TowVehicleVINField = By.cssSelector("*[id^='4063:'][id$='a']");
	By TowVehicleTrimField = By.cssSelector("*[id^='4083:'][id$='a']");
	By TowVehicleStyleField = By.cssSelector("*[id^='4117:'][id$='a']");
	By CurrentOwnerCategoryField = By.cssSelector("*[id^='4162:'][id$='a']");
	By CurrentOwnedMileageField = By.cssSelector("*[id^='4178:'][id$='a']");
	By CurrentOwnedYearField = By.cssSelector("*[id^='4200:'][id$='a']");
	By CurrentOwnedPayoffField = By.cssSelector("*[id^='4216:'][id$='a']");
	By CurrentOwnedMakeField = By.cssSelector("*[id^='4238:'][id$='a']");
	By CurrentOwnedQuoteLowField = By.cssSelector("*[id^='4254:'][id$='a']");	
	By CurrentOwnedProductField = By.cssSelector("*[id^='4276:'][id$='a']");	
	By CurrentOwnedModelField = By.cssSelector("*[id^='4314:'][id$='a']");	
	By CurrentOwnedQuoteHighField = By.cssSelector("*[id^='4292:'][id$='a']");	
	By CurrentOwnedTrimField = By.cssSelector("*[id^='4350:'][id$='a']");	
	By CurrentOwnedQuoteDetailsField = By.cssSelector("*[id^='4330:'][id$='a']");	
	By CurrentOwnedCommentsField = By.cssSelector("*[id^='4366:'][id$='a']");	
	By CurrentOwnedLengthField = By.cssSelector("*[id^='4386:'][id$='a']");
	By CurrentOwnedConditionField = By.cssSelector("*[id^='4402:'][id$='a']");
	By CurrentOwnedEngineField = By.cssSelector("*[id^='4422:'][id$='a']");	
	By CurrentOwnedIDField = By.cssSelector("*[id^='4438:'][id$='a']");	
	By CurrentOwnedOptionsField = By.cssSelector("*[id^='4458:'][id$='a']");
	
	// Info from Lead (To Change Contact Info, Scroll Down to Contact Roles)
	By LeadPhoneField = By.cssSelector("*[id^='4503:'][id$='a']");	
	By LeadEmailField = By.cssSelector("*[id^='4519:'][id$='a']");	
	By LeadMobilePhoneField = By.cssSelector("*[id^='4539:'][id$='a']");	
	By LeadScoreField = By.cssSelector("*[id^='4555:'][id$='a']");	
	By LeadOtherPhoneField = By.cssSelector("*[id^='4577:'][id$='a']");	
	By LeadWorkPhoneField = By.cssSelector("*[id^='4633:'][id$='a']");	
	By LeadMessageField = By.cssSelector("*[aria-labelledby^='label-4673:'][aria-labelledby$='a']");	
	By EndVisitNotesField = By.cssSelector("*[data-aura-rendered-by^='4743:'][data-aura-rendered-by$='a']");
	By SourceField = By.cssSelector("*[id^='4780:'][id$='a']");	
	By LeadSourceDropDownClick = By.cssSelector("*[aria-describedby^='4876:'][aria-describedby$='a-label']");
	By LeadSourceDropDownPopulate = By.xpath("//a[@title='Internet']");	
	By FormNameField = By.cssSelector("*[id^='4922:'][id$='a']");	
	By WebLeadSoureDetailDropDownClick = By.cssSelector("*[aria-describedby^='4942:'][aria-describedby$='a-label']");	
	By WebLeadSoureDetailDropDownPopulate = By.xpath("//a[@title='Dealer Website']");
	By TrackingMediumField = By.cssSelector("*[id^='4910:'][id$='a']");
	By TrackingSCPCField = By.cssSelector("*[id^='5006:'][id$='a']");
	By WebLeadSourceNameField = By.cssSelector("*[id^='5026:'][id$='a']");
	By DiscriptionField = By.cssSelector("*[id^='5477:'][id$='a']");
//    By PriceDropDownClick = By.cssSelector("*[aria-describedby^='5488:'][aria-describedby$='a-label']");
//    By PriceDropDownPopulate = By.xpath("//a[@title='$15,000 to $30,000']");
	By PrimaryEmailField = By.cssSelector("*[id^='5822:'][id$='a']");
	By PrimaryPhoneField = By.cssSelector("*[id^='5856:'][id$='a']");
	By LeadIPAddressField = By.cssSelector("*[id^='5904:'][id$='a']");
	By LeadSystemDataField = By.cssSelector("*[id^='5938:'][id$='a']");
	By CategoryDropDownClick = By.cssSelector("*[aria-describedby^='6008:'][aria-describedby$='a-label']");
	By CategoryDropDownPopulate = By.xpath("//a[@title='Camping Trailer']");
	By TrackingIDField = By.cssSelector("*[id^='6097:'][id$='a']");
	By TrackingLandingPageURLField = By.cssSelector("*[id^='6133:'][id$='a']");
	By TrackingReferralURLField = By.cssSelector("*[id^='6170:'][id$='a']");
	By TrackingPromoCodeField = By.cssSelector("*[id^='6207:'][id$='a']");
	By NextStepField = By.cssSelector("*[id^='6223:'][id$='a']");
	By TrackingCampaignField = By.cssSelector("*[id^='6243:'][id$='a']");
	By TrackingSourceField = By.cssSelector("*[id^='6277:'][id$='a']");
	By TrackingContentField = By.cssSelector("*[id^='6311:'][id$='a']");
	By TrackingKeywordsField = By.cssSelector("*[id^='6407:'][id$='a']");
	By BackendGPField = By.cssSelector("*[id^='6455:'][id$='a']");
	By ADCampaignField = By.cssSelector("*[id^='6477:'][id$='a']");
	By ADGroupField = By.cssSelector("*[id^='6511:'][id$='a']");
	By ADKeywordField = By.cssSelector("*[id^='6545:'][id$='a']");
	By ADSlotField = By.cssSelector("*[id^='6579:'][id$='a']");
	By ADSlotPositionField = By.cssSelector("*[id^='6613:'][id$='a']");
	By ADContentField = By.cssSelector("*[id^='6647:'][id$='a']");
	By ClicktheSavebutton = By.cssSelector("*[data-aura-rendered-by^='9159:'][data-aura-rendered-by$='a']");

	public void userNamefield(String username) {
		$(userNameField).sendKeys(username);
	}

	public void passwordField(String password) {
		$(passwordField).sendKeys(password);
	}

	public void LogInToSandboxBtn() {
		$(LogInToSandboxBtn).click();
	}

	public void clickOnOpportunityTab() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", $(ClickOnOpportunityTab1));

	}

	public void clickOnNewBtn() {
		waitForElementToBeClickable(NewButton);
		$(NewButton).click();
	}

	public void clickOnNextBtn() {
		waitForElementToBeClickable(NextBtn);
		$(NextBtn).click();

	}

	public void clicktheSavebutton1() {
		$(ClicktheSavebutton).click();

	}

	public void requiredFieldMessage() {
		// Take screenshot and store as a file format
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		try {
			FileUtils.copyFile(source,
					new File("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/ScreenshotsFiles/ReqFields2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void workSheetIDInputField(String WorksheetID) {
		$(WorkSheetIDInputField).sendKeys(WorksheetID);

	}

	public void dateAndTimeCalender1() {
		$(DateAndTimeCalendar1).click();
	}

	public void dateAndTimeCalender2() {
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("25")) {
				dates.get(i).click();
				break;
			}
		}
	}

	public void promoMessageInputField(String PromoMessage) {
		$(PromoMessageInputField).sendKeys(PromoMessage);

	}

	public void customerNumberInputField(String CustomerNumber) {
		$(CustomerNumberInputField).sendKeys(CustomerNumber);
	}

	public void quoteNumberInputField(String QuoteNumber) {
		$(QuoteNumberInputField).sendKeys(QuoteNumber);
	}

	public void expirationDate2() {
		List<WebElement> expirationDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node2 = expirationDate.size();
		for (int i = 0; i < total_node2; i++) {
			String date = expirationDate.get(i).getText();
			if (date.equals("30")) {
				expirationDate.get(i).click();
				break;
			}
		}
	}

//    public void eLeadCheatCheckBox() {
//        waitForElementToBeClickable(ELeadCheatCheckBox);
//        $(ELeadCheatCheckBox).click();
//
//    }

	public void opportunityName(String OpportunityName) {
		$(opportunityNameInput).sendKeys(OpportunityName);
	}

	// Amount field
	public void amountInputField(String Amount) {
		$(AmountInputField).sendKeys(Amount);
	}

	// Account Name search field
	public void accountNameSearchField() {
		$(AccountNameSearchField1).click();
	}

	// Populate Account Name field
	public void accountNameSearchFieldPopulated() {
		$(AccountNameSearchFieldPopulat).click();
	}

	// Clicking on the Close Date field
	public void closeDateClick() {
		$(CloseDateClick).click();
	}

	// Close Date
	public void closeDate() {
		List<WebElement> closeDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = closeDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = closeDate.get(i).getText();
			if (date.equals("8")) {
				closeDate.get(i).click();
				break;
			}
		}
	}

	// Clicking on the Stage field
	public void stageClick() {
		$(StageClick).click();
	}

	// Populate the Stage field
	public void stageSelect() {
		$(StageValueSelected).click();
	}

	// Nickname field
	public void nickNameInputField(String Nickname) {
		$(NicknameInputField).sendKeys(Nickname);
	}

	// Click on the Expiration Date field
	public void expirationDate1() {
		$(ExpirationDate1).click();
	}

	// Probability % field
	public void probabilityInputField(String Probability) {
		$(ProbabilityInputField).sendKeys(Probability);
	}

	// Opportunity Selling Owner Name field
	public void opportunitySellingOwnerName(String OpportunitySellingOwnerName) {
		$(OpportunitySellingOwnerNamefield).sendKeys(OpportunitySellingOwnerName);
	}

	// Dropped Dealership field
	public void droppedDealershipfield(String DroppedDealership) {
		$(DroppedDealershipfield).sendKeys(DroppedDealership);
	}

	// IDS Customer# field
	public void idsCustomerNumberfield(String IDSCustomerNum) {
		$(IDSCustomerNumber).sendKeys(IDSCustomerNum);

	}

	// IDS Customer# field
	public void iDSFIQuoteNumberField(String IDSFIQuoteNum) {
		$(IDSFIQuoteNumber).sendKeys(IDSFIQuoteNum);

	}

	// Clicking on the Review Requested Date field
	public void reviewRequestedClick() {
		$(ReviewRequestedDate).click();
	}

	// Review Requested Date field
	public void ReviewRequestedDatePopulated() {
		List<WebElement> requestedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = requestedDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = requestedDate.get(i).getText();
			if (date.equals("29")) {
				requestedDate.get(i).click();
				break;
			}
		}
	}

	// First Survey Attempt Date field
	public void firstSurveyAttemptDate() {
		$(FirstSurveyAttemptDate).click();
	}

	// First Survey Attempt Date field
	public void firstSurveyAttemptDatePopulate() {
		List<WebElement> firstSurveyAttemptDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node3 = firstSurveyAttemptDate.size();
		for (int i = 0; i < total_node3; i++) {
			String date = firstSurveyAttemptDate.get(i).getText();
			if (date.equals("25")) {
				firstSurveyAttemptDate.get(i).click();
				break;
			}
		}
	}

	// Write-Up Amount field
	public void writeUpAmountField(String WriteUpAmount) {
		$(WriteUpAmountInputField).sendKeys(WriteUpAmount);

	}

	// County field
	public void countryField(String County) {
		$(CountryField).sendKeys(County);

	}

	// eLead Create Date field
	public void eLeadCreateDateClick() {
		$(FirstSurveyAttemptDate).click();
	}

	// eLead Create Date field
	public void ELeadCreateDatePopulate() {
		List<WebElement> eLeadCreateDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node3 = eLeadCreateDate.size();
		for (int i = 0; i < total_node3; i++) {
			String date = eLeadCreateDate.get(i).getText();
			if (date.equals("25")) {
				eLeadCreateDate.get(i).click();
				break;
			}
		}
	}

	// Dealership search field click
	public void dealershipSearchFieldclick() {
		$(DealershipSearchBoxClick).click();
		driver.findElement(By.cssSelector("*[id^='1284:'][id$='a']")).sendKeys("CNC ");
	}

	// Dealership field populate
	public void dealershipSearchFieldPopulated() {
		$(DealershipSearchFieldPopulate).click();
	}

	// Customer appointment Date and Time
	public void customerAppointmentDateAndTimeField() {
		$(CustomerAppointmentDateAndTimeField).click();
	}

	// Customer appointment Date and Time
	public void customerAppointmentDateAndTimeCalender() {
		List<WebElement> customerAppointmentDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node4 = customerAppointmentDate.size();
		for (int i = 0; i < total_node4; i++) {
			String date = customerAppointmentDate.get(i).getText();
			if (date.equals("25")) {
				customerAppointmentDate.get(i).click();
				break;
			}
		}
	}

	// Type Drop down field
	public void typeDropDownField() {
		$(TypeDropDownFieldClick).click();
	}

	// Type Drop down field selected
	public void typeDropDownFieldPopulate() {
		$(TypeDropDownFieldPopulate).click();
	}

	// Appointment completed Date
	public void AppointmentCompletedDateField() {
		$(AppointmentCompletedDateField).click();
	}

	// Appointment completed Date
	public void appointmentCompletedDateFieldCalender() {
		List<WebElement> appointmentCompletedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node5 = appointmentCompletedDate.size();
		for (int i = 0; i < total_node5; i++) {
			String date = appointmentCompletedDate.get(i).getText();
			if (date.equals("25")) {
				appointmentCompletedDate.get(i).click();
				break;
			}
		}
	}

	// CustomerDelivery Date and Time
	public void customerDeliveryDateAndTime() {
		$(CustomerDeliveryDateAndTimeField).click();
	}

	// CustomerDelivery Date and Time
	public void customerDeliveryDateAndTimeCalender() {
		List<WebElement> CustomerDelivery = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node6 = CustomerDelivery.size();
		for (int i = 0; i < total_node6; i++) {
			String date = CustomerDelivery.get(i).getText();
			if (date.equals("25")) {
				CustomerDelivery.get(i).click();
				break;
			}
		}
	}

	// Appointment Set checkbox
//	public void appointmentSetCheckbox() {
//		$(AppointmentSetCheckbox).click();
//	}

	// Delivery Set checkbox
//	public void deliverySetCheckbox() {
//		$(DeliverySetCheckbox).click();
//	}

	// Contacted
//	public void contactedCheckBox() {
//		$(ContactedCheckBox).click();
//	}

	// Up Assigned checkbox
//	public void upAssignedCheckbox() {
//		$(UpAssignedCheckbox).click();
//	}

	// Replied
//	public void repliedCheckBox() {
//		$(RepliedCheckBox).click();
//	}

	// FirstResponseTime
//    public void firstResponseTimeField() {
//        $(FirstResponseTimeField).click();
//    }

	// FirstResponseTime
//    public void FirstResponseTimeFieldCalender() {
//        List<WebElement> FirstResponseTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node7 = FirstResponseTime.size();
//        for (int i = 0; i < total_node7; i++) {
//            String date = FirstResponseTime.get(i).getText();
//            if (date.equals("25")) {
//                FirstResponseTime.get(i).click();
//                break;
//            }
//        }
//    }

	// PDIPrinted Date and Time
//    public void pdiPrintedDateAndTimeField() {
//        $(PDIPrintedDateAndTimeField).click();
//    }
	// PDIPrinted Date and Time

//    public void PDIPrintedDateAndTimeCalender() {
//        List<WebElement> PDIPrinted = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node8 = PDIPrinted.size();
//        for (int i = 0; i < total_node8; i++) {
//            String date = PDIPrinted.get(i).getText();
//            if (date.equals("25")) {
//                PDIPrinted.get(i).click();
//                break;
//            }
//        }
//    }

	// BusinessAdjustedCreatedDate
//    public void businessAdjustedCreatedDateField() {
//        $(BusinessAdjustedCreatedDateField).click();
//    }

	// BusinessAdjustedCreatedDate
//    public void BusinessAdjustedCreatedDateCalender() {
//        List<WebElement> BusinessAdjustedCreatedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node9 = BusinessAdjustedCreatedDate.size();
//        for (int i = 0; i < total_node9; i++) {
//            String date = BusinessAdjustedCreatedDate.get(i).getText();
//            if (date.equals("25")) {
//                BusinessAdjustedCreatedDate.get(i).click();
//                break;
//            }
//        }
//    }

//    // BusinessAdjustedCreatedDate
//    public void businessAdjustedCreatedDateEndField() {
//        $(BusinessAdjustedCreatedDateEndField).click();
//    }

	// BusinessAdjustedCreatedDateEnd
//    public void BusinessAdjustedCreatedDateEndCalender() {
//        List<WebElement> BusinessAdjustedCreatedDateEnd = driver
//                .findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node10 = BusinessAdjustedCreatedDateEnd.size();
//        for (int i = 0; i < total_node10; i++) {
//            String date = BusinessAdjustedCreatedDateEnd.get(i).getText();
//            if (date.equals("25")) {
//                BusinessAdjustedCreatedDateEnd.get(i).click();
//                break;
//            }
//        }
//    }

//    // BusinessAdjustedCreatedDate
//    public void businessAdjustedCreatedDateStartField() {
//        $(BusinessAdjustedCreatedDateStartField).click();
//
//    }

	// BusinessAdjustedCreatedDateEnd
	public void BusinessAdjustedCreatedDateStartCalender() {
		List<WebElement> BusinessAdjustedCreatedDateStart = driver
				.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node11 = BusinessAdjustedCreatedDateStart.size();
		for (int i = 0; i < total_node11; i++) {
			String date = BusinessAdjustedCreatedDateStart.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDateStart.get(i).click();
				break;
			}
		}
	}

	// New/Used - Year To
	public void newUsedYearToClick() {
		$(NewUsedYearToClick).click();

	}

	// New/Used - Year To
	public void newUsedYearToPopulate() {
		driver.findElements(By.xpath("//a[@title='New']")).get(1).click();

	}

	// Floorplan Style
	public void floorplanStyleClick() {
		$(FloorplanStyleClick).click();

	}

	// Floorplan Style
	public void floorplanStylePopulate() {
		$(FloorplanStylePopulate).click();

	}

	// Genius Notes 1 (RV Attributes)
	public void geniusNotes1RVAttributes(String GeniusNotes1) {
		$(GeniusNotes1RVAttributes).sendKeys(GeniusNotes1);

	}

	// Notes 2 (Meet & Greet)
	public void note2MeetAndGreet(String Notes2MeetAndGreet) {
		$(Notes2MeetAndGreetInput).sendKeys(Notes2MeetAndGreet);
	}

	// Genius Notes 3 (Trade Notes)
	public void geniusNotes3TradeNotesInputField(String GeniusNotes3TradeNotes) {
		$(GeniusNotes3TradeNotesInputField).sendKeys(GeniusNotes3TradeNotes);
	}

	// # Sleeps
	public void numberSleep(String NumSleeps) {
		$(NumSleepsInputField).sendKeys(NumSleeps);

	}

	// Year From
	public void yearFromClick() {
		$(YearFromClick).click();

	}

	// Year From
	public void yearFromPopulate() {
		$(YearFromPopulate).click();

	}

	// Year To field click
	public void yearToClick() {
		$(YearToClick).click();

	}

	// Year To field populate
	public void yearToPopulate() {
		driver.findElements(By.xpath("//a[@title='2017']")).get(1).click();

	}

//	// Price From
//	public void priceFromClick() {
//		$(PriceFromClick).click();
//
//	}
//
//	// Price From
//	public void PriceFromPopulate() {
//		$(PriceFromPopulate).click();
//
//	}

	// Price To Click
	public void priceToClick() {
		$(PriceToClick).click();

	}

	// Price To Populate
	public void PriceToPopulate() {
		$(PriceToPopulate).click();

	}

	// Payment From click on it
	public void paymentFromClick() {
		$(PaymentFromClick).click();

	}

	// Payment From populated
	public void paymentFromPopulate() {
		$(PaymentFromPopulate).click();

	}

	// Payment To
	public void paymentToClick() {
		$(PaymentToClick).click();

	}

	// Payment To
	public void paymentToPopulate() {
		driver.findElements(By.xpath("//a[@title='100']")).get(1).click();

	}

	// click on the Length From field
	public void lengthFromClick() {
		$(LengthFromClick).click();

	}

	// Populate the Length From field
	public void lengthFromPopulate() {
		driver.findElements(By.xpath("//a[@title='6 ft']")).get(0).click();

	}

	// Length To field click
	public void lengthToClick() {
		$(LengthToClick).click();

	}

	// Length To field populate
	public void lengthToPopulate() {
		driver.findElements(By.xpath("//a[@title='10 ft']")).get(1).click();

	}

	// # Slide Outs
	public void numberSlideOutsInputField() {
		$(NumberSlideOutsInputField).click();

	}

	// Interested Type
	public void interestedTypeInputField(String InterestedType) {
		$(InterestedTypeInputField).sendKeys(InterestedType);

	}

	// Interior Color
	public void interiorColorInputField(String InteriorColor) {
		$(InteriorColorInputField).sendKeys(InteriorColor);

	}

	// Interested Category
	public void interestedCategoryInputField(String IntrestedCategory) {
		$(InterestedCategoryInputField).sendKeys(IntrestedCategory);

	}

	// Exterior Color
	public void exteriorColorInputField(String ExteriorColor) {
		$(ExteriorColorInputField).sendKeys(ExteriorColor);

	}

	// Interested Year
	public void interestedYear(String InterestedYear) {
		$(InterestedYearInputField).sendKeys(InterestedYear);

	}

	// # Doors
	public void numberDoors(String Doors) {
		$(NumberDoorsInputField).sendKeys(Doors);

	}

	// # Interested Make Input Field
	public void interestedMakeInputField(String InterestedMake) {
		$(InterestedMakeInputField).sendKeys(InterestedMake);

	}

	// MileageInputField
	public void mileageInputField(String Mileage) {
		$(MileageInputField).sendKeys(Mileage);

	}

	// InterestedModel
	public void interestedModelInputField(String IntrestedModel) {
		$(InterestedModelInputField).sendKeys(IntrestedModel);

	}

	// Vehicle Options
	public void vehicleOptionsInputField(String VehicleOptions) {
		$(VehicleOptionsInputField).sendKeys(VehicleOptions);

	}

	// Interested Product
	public void interestedProductInput(String IntrestedProduct) {
		$(InterestedProductInput).sendKeys(IntrestedProduct);

	}

	// Interest Level Click
	public void iNterestLevelDropdownClick() {
		$(InterestLevelDropdownClick).click();

	}
	// Interest Level Populate
	public void iNterestLevelDropdownPopulate() {
		$(InterestLevelDropdownPopulate).click();

	}

	// Vehicle Trim
	public void vehicleTrim(String VehicleTrim) {
		$(VehicleTrimInputField).sendKeys(VehicleTrim);

	}

	// Buying Horizon
	public void buyingHorizon(String BuyingHorizon) {
		$(BuyingHorizonInputField).sendKeys(BuyingHorizon);

	}

	// Vehicle Engine
	public void vehicleEngine(String VehicleEngine) {
		$(VehicleEngineInputField).sendKeys(VehicleEngine);

	}

	// Payment Method Click

	public void paymentMethodDropdownClick() {
		$(PaymentMethodDropdownClick).click();

	}
	// Payment Method Populate

	public void paymentMethodDropdownPopulate() {
		$(PaymentMethodDropdownPopulate).click();

	}

	// Chassis dropdown Click
	public void chassisDropdownClick() {
		$(ChassisDropdownClick).click();

	}

	// Chassis dropdown Populate
	public void chassisDropdownPopulate() {
		$(ChassisDropdownPopulate).click();

	}

	// Payment Details
	public void paymentDetailsInput(String PaymentDetails) {
		$(PaymentDetailsInput).sendKeys(PaymentDetails);

	}

	// Transmission
	public void transmissionField(String Transmission) {
		$(TransmissionField).sendKeys(Transmission);
	}

	// Vehicle pricing
	public void vehiclePricingField(String VehiclePricing) {
		$(VehiclePricingField).sendKeys(VehiclePricing);
	}

	// Interested Stock
	public void interestedStockField(String InterestedStock) {
		$(InterestedStockField).sendKeys(InterestedStock);
	}

	// Vehicle Comments
	public void vehicleCommentsField(String VehicleComments) {
		$(VehicleCommentsField).sendKeys(VehicleComments);
	}

	// Interested Id
	public void interestedIdField(String IntrestedID) {
		$(InterestedIdField).sendKeys(IntrestedID);
	}

	// Webpage
	public void webpageField(String webpage) {
		$(WebpageField).sendKeys(webpage);
	}

	// Toy Desk dropdown field click
	public void toyDeskDropdownClick() {
		$(ToyDeskDropdownClick).click();
	}

	public void toyDeskDropdownPopulate() {
	//	$(ToyDeskDropdownPopulate).click();
		driver.findElements(By.xpath("//a[@title='Yes']")).get(0).click();
	}

	// Outdoor Kitchen dropdown field click
	public void outdoorKitchenDropdownClick() {
		$(OutDoorKitchenDropdownClick).click();
	}

	// Outdoor Kitchen dropdown field populate
	public void outdoorKitchenDropdownPopulate() {
		//$(OutDoorKitchenDropdownPopulate).click();
		driver.findElements(By.xpath("//a[@title='Yes']")).get(1).click();
	}

	// Outdoor Entertainment dropdown field click
	public void outdoorEntertainmentDropdownClick() {
		$(OutdoorEntertainmentkDropdownClick).click();
	}

	// Outdoor Entertainment dropdown field populate
	public void outdoorEntertainmentDropdownPopulate() {
		//$(OutdoorEntertainmentDropdownPopulate).click();
		driver.findElements(By.xpath("//a[@title='No']")).get(2).click();
	}

	// PriviousStage dropdown field click
	public void previousStageDropdownClick() {
		$(PreviousStageDropdownClick).click();
	}
	public void previousStageDropdownPopulate() {
		//$(PreviousStageDropdownPopulate).click();
		driver.findElements(By.xpath("//a[@title='In-Process']")).get(1).click();
	}

	// Tow Vehicle Year
	public void towVehicleYearField(String TowVehicleYear) {
		$(TowVehicleYearField).sendKeys(TowVehicleYear);
	}

	// Max Towing Capacity
	public void maxTowingCapacityField(String MaxTowingCapacity) {
		$(MaxTowingCapacityField).sendKeys(MaxTowingCapacity);
	}

	// Tow Vehicle Make
	public void towVehicleMakeField(String TowVehicleMake) {
		$(TowVehicleMakeField).sendKeys(TowVehicleMake);
	}

	// Tow Vehicle Model
	public void towVehicleModelField(String TowVehicleModel) {
		$(TowVehicleModelField).sendKeys(TowVehicleModel);
	}

	// Tow Vehicle VIN
	public void towVehicleVINField(String TowVehicleVIN) {
		$(TowVehicleVINField).sendKeys(TowVehicleVIN);
	}

	// Tow Vehicle Trim
	public void towVehicleTrimField(String TowVehicleTrim) {
		$(TowVehicleTrimField).sendKeys(TowVehicleTrim);
	}

	// Tow Vehicle Style
	public void towVehicleStyleField(String TowVehicleStyle) {
		$(TowVehicleStyleField).sendKeys(TowVehicleStyle);
	}

	// Current Owner Category
	public void currentOwnerCategoryField(String CurrentOwnerCategory) {
		$(CurrentOwnerCategoryField).sendKeys(CurrentOwnerCategory);
	}

	// Current Owned Mileage
	public void currentOwnedMileageField(String CurrentOwnedMileage) {
		$(CurrentOwnedMileageField).sendKeys(CurrentOwnedMileage);
	}

	// Current Owned Year
	public void currentOwnedYearField(String CurrentOwnedYear) {
		$(CurrentOwnedYearField).sendKeys(CurrentOwnedYear);
	}

	// Current Owned Payoff
	public void currentOwnedPayoffField(String CurrentOwnedPayoff) {
		$(CurrentOwnedPayoffField).sendKeys(CurrentOwnedPayoff);
	}

	// Current Owned Make
	public void currentOwnedMakeField(String CurrentOwnedMake) {
		$(CurrentOwnedMakeField).sendKeys(CurrentOwnedMake);
	}

	// Current Owned Quote Low
	public void currentOwnedQuoteLowField(String CurrentOwnedQuoteLow) {
		$(CurrentOwnedQuoteLowField).sendKeys(CurrentOwnedQuoteLow);
	}

	// Current Owned Product
	public void currentOwnedProductField(String CurrentOwnedProduct) {
		$(CurrentOwnedProductField).sendKeys(CurrentOwnedProduct);
	}

	// Current Owned Model
	public void currentOwnedModelField(String CurrentOwnedModel) {
		$(CurrentOwnedModelField).sendKeys(CurrentOwnedModel);
	}

	// Current Owned Quote High
	public void currentOwnedQuoteHighField(String CurrentOwnedQuoteHigh) {
		$(CurrentOwnedQuoteHighField).sendKeys(CurrentOwnedQuoteHigh);
	}

	// Current Owned Trim
	public void currentOwnedTrimField(String CurrentOwnedTrim) {
		$(CurrentOwnedTrimField).sendKeys(CurrentOwnedTrim);
	}

	// Current Owned Quote Details
	public void currentOwnedQuoteDetailsField(String CurrentOwnedQuoteDetails) {
		$(CurrentOwnedQuoteDetailsField).sendKeys(CurrentOwnedQuoteDetails);
	}

	// Current Owned Length
	public void currentOwnedLengthField(String CurrentOwnedLength) {
		$(CurrentOwnedLengthField).sendKeys(CurrentOwnedLength);
	}

	// Current Owned Comments
	public void currentOwnedCommentsField(String CurrentOwnedComments) {
		$(CurrentOwnedCommentsField).sendKeys(CurrentOwnedComments);
	}

	// Current Owned Engine
	public void currentOwnedEngineField(String CurrentOwnedEngine) {
		$(CurrentOwnedEngineField).sendKeys(CurrentOwnedEngine);
	}

	// Current Owned Condition
	public void currentOwnedConditionField(String CurrentOwnedCondition) {
		$(CurrentOwnedConditionField).sendKeys(CurrentOwnedCondition);
	}

	// Current Owned ID
	public void currentOwnedIDField(String CurrentOwnedID) {
		$(CurrentOwnedIDField).sendKeys(CurrentOwnedID);
	}

	// Current Owned Options
	public void currentOwnedOptionsField(String CurrentOwnedOptions) {
		$(CurrentOwnedOptionsField).sendKeys(CurrentOwnedOptions);
	}

	// Lead Phone
	public void leadPhoneField(String LeadPhone) {
		$(LeadPhoneField).sendKeys(LeadPhone);
	}

	// Lead Email
	public void leadEmailField(String LeadEmail) {
		$(LeadEmailField).sendKeys(LeadEmail);
	}

	// Lead Mobile Phone
	public void leadMobilePhoneField(String LeadMobilePhone) {
		$(LeadMobilePhoneField).sendKeys(LeadMobilePhone);
	}

	// Lead Score
	public void leadScoreField(String LeadScore) {
		$(LeadScoreField).sendKeys(LeadScore);
	}

	// Lead other Phone
	public void leadOtherPhoneField(String LeadOtherPhone) {
		$(LeadOtherPhoneField).sendKeys(LeadOtherPhone);
	}

	// Lead Work Phone
	public void leadWorkPhoneField(String LeadWorkPhone) {
		$(LeadWorkPhoneField).sendKeys(LeadWorkPhone);
	}

	// Lead Message
	public void leadMessageField(String LeadMessage) {
		$(LeadMessageField).sendKeys(LeadMessage);
	}

	// End Visit Notes
	public void endVisitNotesField(String EndViditNotes) {
		$(EndVisitNotesField).sendKeys(EndViditNotes);
	}

	// Source
	public void sourceField(String Source) {
		$(SourceField).sendKeys(Source);
	}

	// Lead Source drop down click
	public void leadSourceDropDownClick() {
		$(LeadSourceDropDownClick).click();
	}

	// Lead Source drop down populate
	public void leadSourceDropDownPopulate() {
		$(LeadSourceDropDownPopulate).click();
	}

	// FormName
	public void FormNameField(String FormName) {
		$(FormNameField).sendKeys(FormName);
	}

	// Web Lead Source Detail drop down click
	public void webLeadSoureDetailDropDownClick() {
		$(WebLeadSoureDetailDropDownClick).click();

	}

	// Web Lead Source Detail drop down populate
	public void WebLeadSoureDetailDropDownPopulate() {
		$(WebLeadSoureDetailDropDownPopulate).click();

	}

	// Tracking Medium
	public void trackingMediumField(String TrackingMedium) {
		$(TrackingMediumField).sendKeys(TrackingMedium);
	}

	// Tracking SCPC
	public void trackingSCPCField(String TrackingSCPC) {
		$(TrackingSCPCField).sendKeys(TrackingSCPC);
	}

	// Web Lead Source Name
	public void webLeadSourceNameField(String WebLeadSourceName) {
		$(WebLeadSourceNameField).sendKeys(WebLeadSourceName);
	}

	// eLead Create Date
//    public void eLeadCreateDateCalender() {
//        driver.findElement(By.cssSelector("*[id^='5430:'][id$='a']")).click();
//        List<WebElement> eLeadCreatedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node = eLeadCreatedDate.size();
//        for (int i = 0; i < total_node; i++) {
//            String date = eLeadCreatedDate.get(i).getText();
//            if (date.equals("27")) {
//                eLeadCreatedDate.get(i).click();
//                break;
//            }
//
//        }
//
//    }

	// Description
	public void discriptionField(String Discription) {
		$(DiscriptionField).sendKeys(Discription);
	}

//    // Price drop down click
//    public void priceDropDownClick() {
//        $(PriceDropDownClick).click();
//
//    }

	// Price drop down populate
//    public void priceDropDownPopulate() {
//        $(PriceDropDownPopulate).click();
//
//    }

	// Primary Email
	public void primaryEmailField(String PrimaryEmail) {
		$(PrimaryEmailField).sendKeys(PrimaryEmail);
	}

	// Primary Phone
	public void primaryPhoneField(String PrimaryPhone) {
		$(PrimaryPhoneField).sendKeys(PrimaryPhone);
	}

	// Lead Ip Address
	public void leadIPAddressField(String LeadIPAddress) {
		$(LeadIPAddressField).sendKeys(LeadIPAddress);
	}

	// Lead System Data
	public void leadSystemDataField(String LeadSystemData) {
		$(LeadSystemDataField).sendKeys(LeadSystemData);
	}

	// Category drop down click
	public void categoryDropDownClick() {
		$(CategoryDropDownClick).click();
	}

	// Category drop down populate
	public void categoryDropDownPopulate() {
		$(CategoryDropDownPopulate).click();
	}

	// Tracking Id
	public void trackingIDField(String TrackingID) {
		$(TrackingIDField).sendKeys(TrackingID);
	}

	// Tracking LandingPage URL
	public void trackingLandingPageURLField(String TrackingLandingPageURL) {
		$(TrackingLandingPageURLField).sendKeys(TrackingLandingPageURL);
	}

	// Tracking Referral URL
	public void trackingReferralURLField(String TrackingReferralURL) {
		$(TrackingReferralURLField).sendKeys(TrackingReferralURL);
	}

	// Tracking Promo Code
	public void trackingPromoCodeField(String TrackingPromoCode) {
		$(TrackingPromoCodeField).sendKeys(TrackingPromoCode);
	}

	// Next Step
	public void nextStepField(String NextStep) {
		$(NextStepField).sendKeys(NextStep);
	}

	// Tracking Campaign
	public void trackingCampaignField(String TrackingCampaign) {
		$(TrackingCampaignField).sendKeys(TrackingCampaign);
	}

	// Tracking Source
	public void trackingSourceField(String TrackingSource) {
		$(TrackingSourceField).sendKeys(TrackingSource);
	}

	// Tracking Content
	public void TrackingContentField(String TrackingContent) {
		$(TrackingContentField).sendKeys(TrackingContent);
	}

	// Tracking Keywords
	public void trackingKeywordsField(String TrackingKeywords) {
		$(TrackingKeywordsField).sendKeys(TrackingKeywords);
	}

	// Backend GP
	public void BackendGPField(String BackendGP) {
		$(BackendGPField).sendKeys(BackendGP);
	}

	// Ad Campaign
	public void ADCampaignField(String ADCampaign) {
		$(ADCampaignField).sendKeys(ADCampaign);
	}

	// Ad Group
	public void aDGroupField(String ADGroup) {
		$(ADGroupField).sendKeys(ADGroup);
	}

	// Ad Keyword
	public void ADKeywordField(String ADKeyword) {
		$(ADKeywordField).sendKeys(ADKeyword);
	}

	// Ad Slot
	public void ADSlotField(String ADSlot) {
		$(ADSlotField).sendKeys(ADSlot);
	}

	// Ad Slot Position
	public void aDSlotPositionField(String ADSlotPosition) {
		$(ADSlotPositionField).sendKeys(ADSlotPosition);
	}

	// Ad Content
	public void ADContentField(String ADContent) {
		$(ADContentField).sendKeys(ADContent);
	}

	// LastActivityDate
	public void lastActivityDateCalender() {
		driver.findElement(By.cssSelector("*[id^='6852:'][id$='a']")).click();
		List<WebElement> LastActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node12 = LastActivityDate.size();
		for (int i = 0; i < total_node12; i++) {
			String date = LastActivityDate.get(i).getText();
			if (date.equals("27")) {
				LastActivityDate.get(i).click();
				break;
			}
		}
	}

	// Next Activity Date
	public void nextActivityDateCalender() {
		driver.findElement(By.cssSelector("*[id^='6915:'][id$='a']")).click();
		List<WebElement> NextActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node13 = NextActivityDate.size();
		for (int i = 0; i < total_node13; i++) {
			String date = NextActivityDate.get(i).getText();
			if (date.equals("27")) {
				NextActivityDate.get(i).click();
				break;
			}
		}
	}

	// LastStageChangeTime Date and Time
//    public void lastStageChangeTimeDateAndTimeCalender() {
//        driver.findElement(By.cssSelector("*[id^='6875:'][id$='a']")).click();
//        List<WebElement> LastStageChangeTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node14 = LastStageChangeTime.size();
//        for (int i = 0; i < total_node14; i++) {
//            String date = LastStageChangeTime.get(i).getText();
//            if (date.equals("27")) {
//                LastStageChangeTime.get(i).click();
//                break;
//            }
//        }
//    }

	// Last Sales Activity Date Time
	public void LastSalesActivityDateTimeCalender() {
		driver.findElement(By.cssSelector("*[id^='6875:'][id$='a']")).click();
		List<WebElement> LastSalesActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node15 = LastSalesActivityDate.size();
		for (int i = 0; i < total_node15; i++) {
			String date = LastSalesActivityDate.get(i).getText();
			if (date.equals("27")) {
				LastSalesActivityDate.get(i).click();
				break;
			}
		}
	}

//    // Last Lead Conversion Date Time
//    public void LastLeadConversionDateTimeCalender() {
//        driver.findElement(By.cssSelector("*[id^='6879:'][id$='a']")).click();
//        List<WebElement> LastLeadConversionDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
//        int total_node16 = LastLeadConversionDate.size();
//        for (int i = 0; i < total_node16; i++) {
//            String date = LastLeadConversionDate.get(i).getText();
//            if (date.equals("30")) {
//                LastLeadConversionDate.get(i).click();
//                break;
//            }
//        }
//    }

	// CRM Submission TIME DATE
	public void CRMSubmissionTIMEDATECalender() {
		driver.findElement(By.cssSelector("*[id^='328:'][id$='a']")).click();
		List<WebElement> CRMSubmissionTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node17 = CRMSubmissionTime.size();
		for (int i = 0; i < total_node17; i++) {
			String date = CRMSubmissionTime.get(i).getText();
			if (date.equals("30")) {
				CRMSubmissionTime.get(i).click();
				break;
			}
		}

	}

	// public void clicktheSavebutton() {
	// $(ClicktheSavebutton).click();

	// }

}