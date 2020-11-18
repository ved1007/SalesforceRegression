package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.excel.test.utility.Xls_Reader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OpportunitiesPage;

public class OpportunitiesStepDef {

	WebDriver driver;

	Xls_Reader reader = new Xls_Reader(
			"/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/SampleData/ExcelTestData.xlsx");

	String WorksheetID = reader.getCellData("Sheet2Opportunities", "WorksheetID", 2);
	String PromoMessage = reader.getCellData("Sheet2Opportunities", "PromoMessage", 2);
	String CustomerNumber = reader.getCellData("Sheet2Opportunities", "CustomerNumber", 2);
	String QuoteNumber = reader.getCellData("Sheet2Opportunities", "QuoteNumber", 2);
	String OpportunityName = reader.getCellData("Sheet2Opportunities", "OpportunityName", 2);
	String Amount = reader.getCellData("Sheet2Opportunities", "Amount", 2);
	String Nickname = reader.getCellData("Sheet2Opportunities", "Nickname", 2);
	String Probability = reader.getCellData("Sheet2Opportunities", "Probability", 2);
	String OpportunitySellingOwnerName = reader.getCellData("Sheet2Opportunities", "OpportunitySellingOwnerName", 2);
	String DroppedDealership = reader.getCellData("Sheet2Opportunities", "DroppedDealership", 2);
	String IDSCustomerNum = reader.getCellData("Sheet2Opportunities", "IDSCustomerNum", 2);
	String IDSFIQuoteNum = reader.getCellData("Sheet2Opportunities", "IDSFIQuoteNum", 2);
	String Country = reader.getCellData("Sheet2Opportunities", "Country", 2);
	String WriteUpAmount = reader.getCellData("Sheet2Opportunities", "WriteUpAmount", 2);
	String GeniusNotes1 = reader.getCellData("Sheet2Opportunities", "GeniusNotes1", 2);
	String Notes2MeetAndGreet = reader.getCellData("Sheet2Opportunities", "Notes2MeetAndGreet", 2);
	String GeniusNotes3TradeNotes = reader.getCellData("Sheet2Opportunities", "GeniusNotes3TradeNotes", 2);
	String SlideOuts = reader.getCellData("Sheet2Opportunities", "SlideOuts", 2);
	String NumSleeps = reader.getCellData("Sheet2Opportunities", "NumSleeps", 2);
	String InterestedType = reader.getCellData("Sheet2Opportunities", "InterestedType", 2);
	String InteriorColor = reader.getCellData("Sheet2Opportunities", "InteriorColor", 2);
	String IntrestedCategory = reader.getCellData("Sheet2Opportunities", "IntrestedCategory", 2);
	String ExteriorColor = reader.getCellData("Sheet2Opportunities", "ExteriorColor", 2);
	String InterestedYear = reader.getCellData("Sheet2Opportunities", "InterestedYear", 2);
	String Mileage = reader.getCellData("Sheet2Opportunities", "Mileage", 2);
	String InterestedMake = reader.getCellData("Sheet2Opportunities", "InterestedMake", 2);
	String Doors = reader.getCellData("Sheet2Opportunities", "Doors", 2);
	String IntrestedModel = reader.getCellData("Sheet2Opportunities", "IntrestedModel", 2);
	String VehicleOptions = reader.getCellData("Sheet2Opportunities", "VehicleOptions", 2);
	String IntrestedProduct = reader.getCellData("Sheet2Opportunities", "IntrestedProduct", 2);
	String InterestedLevel = reader.getCellData("Sheet2Opportunities", "InterestedLevel", 2);
	String VehicleTrim = reader.getCellData("Sheet2Opportunities", "VehicleTrim", 2);
	String BuyingHorizon = reader.getCellData("Sheet2Opportunities", "BuyingHorizon", 2);
	String VehicleEngine = reader.getCellData("Sheet2Opportunities", "VehicleEngine", 2);
	String PaymentDetails = reader.getCellData("Sheet2Opportunities", "PaymentDetails", 2);
	String Transmission = reader.getCellData("Sheet2Opportunities", "Transmission", 2);
	String VehiclePricing = reader.getCellData("Sheet2Opportunities", "VehiclePricing", 2);
	String InterestedStock = reader.getCellData("Sheet2Opportunities", "InterestedStock", 2);
	String VehicleComments = reader.getCellData("Sheet2Opportunities", "VehicleComments", 2);
	String IntrestedID = reader.getCellData("Sheet2Opportunities", "IntrestedID", 2);
	String webpage = reader.getCellData("Sheet2Opportunities", "webpage", 2);
	String TowVehicleYear = reader.getCellData("Sheet2Opportunities", "TowVehicleYear", 2);
	String MaxTowingCapacity = reader.getCellData("Sheet2Opportunities", "MaxTowingCapacity", 2);
	String TowVehicleMake = reader.getCellData("Sheet2Opportunities", "TowVehicleMake", 2);
	String TowVehicleModel = reader.getCellData("Sheet2Opportunities", "TowVehicleModel", 2);
	String TowVehicleVIN = reader.getCellData("Sheet2Opportunities", "TowVehicleVIN", 2);
	String TowVehicleTrim = reader.getCellData("Sheet2Opportunities", "TowVehicleTrim", 2);
	String TowVehicleStyle = reader.getCellData("Sheet2Opportunities", "TowVehicleStyle", 2);
	String CurrentOwnerCategory = reader.getCellData("Sheet2Opportunities", "CurrentOwnerCategory", 2);
	String CurrentOwnedMileage = reader.getCellData("Sheet2Opportunities", "CurrentOwnedMileage", 2);
	String CurrentOwnedYear = reader.getCellData("Sheet2Opportunities", "CurrentOwnedYear", 2);
	String CurrentOwnedPayoff = reader.getCellData("Sheet2Opportunities", "CurrentOwnedPayoff", 2);
	String CurrentOwnedMake = reader.getCellData("Sheet2Opportunities", "CurrentOwnedMake", 2);
	String CurrentOwnedQuoteLow = reader.getCellData("Sheet2Opportunities", "CurrentOwnedQuoteLow", 2);
	String CurrentOwnedProduct = reader.getCellData("Sheet2Opportunities", "CurrentOwnedProduct", 2);
	String CurrentOwnedQuoteHigh = reader.getCellData("Sheet2Opportunities", "CurrentOwnedQuoteHigh", 2);
	String CurrentOwnedModel = reader.getCellData("Sheet2Opportunities", "CurrentOwnedModel", 2);
	String CurrentOwnedQuoteDetails = reader.getCellData("Sheet2Opportunities", "CurrentOwnedQuoteDetails", 2);
	String CurrentOwnedTrim = reader.getCellData("Sheet2Opportunities", "CurrentOwnedTrim", 2);
	String CurrentOwnedComments = reader.getCellData("Sheet2Opportunities", "CurrentOwnedComments", 2);
	String CurrentOwnedLength = reader.getCellData("Sheet2Opportunities", "CurrentOwnedLength", 2);
	String CurrentOwnedCondition = reader.getCellData("Sheet2Opportunities", "CurrentOwnedCondition", 2);
	String CurrentOwnedEngine = reader.getCellData("Sheet2Opportunities", "CurrentOwnedEngine", 2);
	String CurrentOwnedID = reader.getCellData("Sheet2Opportunities", "CurrentOwnedID", 2);
	String CurrentOwnedOptions = reader.getCellData("Sheet2Opportunities", "CurrentOwnedOptions", 2);
	String LeadPhone = reader.getCellData("Sheet2Opportunities", "LeadPhone", 2);
	String LeadEmail = reader.getCellData("Sheet2Opportunities", "LeadEmail", 2);
	String LeadMobilePhone = reader.getCellData("Sheet2Opportunities", "LeadMobilePhone", 2);
	String LeadScore = reader.getCellData("Sheet2Opportunities", "LeadScore", 2);
	String LeadOtherPhone = reader.getCellData("Sheet2Opportunities", "LeadOtherPhone", 2);
	String LeadWorkPhone = reader.getCellData("Sheet2Opportunities", "LeadWorkPhone", 2);
	String LeadMessage = reader.getCellData("Sheet2Opportunities", "LeadMessage", 2);
	String EndViditNotes = reader.getCellData("Sheet2Opportunities", "EndViditNotes", 2);
	String Source = reader.getCellData("Sheet2Opportunities", "Source", 2);
	String FormName = reader.getCellData("Sheet2Opportunities", "FormName", 2);
	String TrackingMedium = reader.getCellData("Sheet2Opportunities", "TrackingMedium", 2);
	String TrackingSCPC = reader.getCellData("Sheet2Opportunities", "TrackingSCPC", 2);
	String WebLeadSourceName = reader.getCellData("Sheet2Opportunities", "WebLeadSourceName", 2);
	String Discription = reader.getCellData("Sheet2Opportunities", "Discription", 2);
	String PrimaryEmail = reader.getCellData("Sheet2Opportunities", "PrimaryEmail", 2);
	String PrimaryPhone = reader.getCellData("Sheet2Opportunities", "PrimaryPhone", 2);
	String LeadIPAddress = reader.getCellData("Sheet2Opportunities", "LeadIPAddress", 2);
	String LeadSystemData = reader.getCellData("Sheet2Opportunities", "LeadSystemData", 2);
	String TrackingID = reader.getCellData("Sheet2Opportunities", "TrackingID", 2);
	String TrackingLandingPageURL = reader.getCellData("Sheet2Opportunities", "TrackingLandingPageURL", 2);
	String TrackingReferralURL = reader.getCellData("Sheet2Opportunities", "TrackingReferralURL", 2);
	String TrackingPromoCode = reader.getCellData("Sheet2Opportunities", "TrackingPromoCode", 2);
	String NextStep = reader.getCellData("Sheet2Opportunities", "NextStep", 2);
	String TrackingCampaign = reader.getCellData("Sheet2Opportunities", "TrackingCampaign", 2);
	String TrackingSource = reader.getCellData("Sheet2Opportunities", "TrackingSource", 2);
	String TrackingContent = reader.getCellData("Sheet2Opportunities", "TrackingContent", 2);
	String TrackingKeywords = reader.getCellData("Sheet2Opportunities", "TrackingKeywords", 2);
	String BackendGP = reader.getCellData("Sheet2Opportunities", "BackendGP", 2);
	String ADCampaign = reader.getCellData("Sheet2Opportunities", "ADCampaign", 2);
	String ADGroup = reader.getCellData("Sheet2Opportunities", "ADGroup", 2);
	String ADKeyword = reader.getCellData("Sheet2Opportunities", "ADKeyword", 2);
	String ADSlot = reader.getCellData("Sheet2Opportunities", "ADSlot", 2);
	String ADSlotPosition = reader.getCellData("Sheet2Opportunities", "ADSlotPosition", 2);
	String ADContent = reader.getCellData("Sheet2Opportunities", "ADContent", 2);
	By InterestedIdField = By.cssSelector("*[id^='3423:'][id$='a']");

	OpportunitiesPage op = new OpportunitiesPage();

	@Given("^Open the Salesforce Website$")
	public void open_the_Salesforce_Website() throws Throwable {
		op.setup();

	}

	@When("^verify the Salesforce page title as \"([^\"]*)\"$")
	public void verify_the_Salesforce_page_title_as(String saleforceTitle) throws Throwable {
		String title = op.getTitle();
		System.out.println(title);
		Assert.assertEquals(saleforceTitle, title);

	}

	@Then("^Login with valid username and password \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_valid_username_and_password_and(String username, String password) {
		op.userNamefield(username);
		op.passwordField(password);

	}

	@Then("^Click login button$")
	public void click_login_button() throws Throwable {
		op.LogInToSandboxBtn();

	}

	@Then("^Verify Salesforce Home page title as \"([^\"]*)\"$")
	public void verify_Salesforce_Home_page_title_as(String SalseforceHomePageTitle) throws InterruptedException {
		Thread.sleep(12000);
		String HomepageTitle = op.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals(SalseforceHomePageTitle, HomepageTitle);

	}

	@Then("^Click on the Opportunities tab$")
	public void click_on_the_Opportunities_tab() {
		op.clickOnOpportunityTab();

	}

	@Then("^Click on the New button$")
	public void click_on_the_New_button() {
		op.clickOnNewBtn();

	}

	@Then("^Select a record type and click Next$")
	public void select_a_record_type_and_click_Next() {
		op.clickOnNextBtn();

	}

	@Then("^Save button$")
	public void Save_button() {
		op.clicktheSavebutton1();
	}

	@Then("^Verify Required fields message$")
	public void verify_Required_fields_message() {
		op.requiredFieldMessage();

	}

	@Then("^Populate System Admin Layout fields$")
	public void populate_System_Admin_Layout_fields() {

		// Worksheet ID field
		op.workSheetIDInputField(WorksheetID);

		// Date and Time
		op.dateAndTimeCalender1();
		op.dateAndTimeCalender2();

		// Promo Message
		op.promoMessageInputField(PromoMessage);

		// Customer Number field
		op.customerNumberInputField(CustomerNumber);

		// Quote Number field
		op.quoteNumberInputField(QuoteNumber);

		// Expiration Date
//        op.expirationDate1();
//        op.expirationDate2();

		// eLead Cheat checkbox
		// op.eLeadCheatCheckBox();

	}

	@Then("^Opportunity Information$")
	public void Opportunity_Information() throws Throwable {

		// Opportunities Name field
		op.opportunityName(OpportunityName);

		// Amount field
		op.amountInputField(Amount);

		// Account Name field
		op.accountNameSearchField();
		op.accountNameSearchFieldPopulated();

		// Close Date
		op.closeDateClick();
		op.closeDate();

		// Stage field
		op.stageClick();
		op.stageSelect();

		// Nick Name field
		op.nickNameInputField(Nickname);

		// Probability % field
		op.probabilityInputField(Probability);

		// Opportunity Selling Owner Name field
		op.opportunitySellingOwnerName(OpportunitySellingOwnerName);

		// Dropped Dealership field
		op.droppedDealershipfield(DroppedDealership);

		// IDS Customer# field
		op.idsCustomerNumberfield(IDSCustomerNum);

		// IDS FI Quote # field
		op.iDSFIQuoteNumberField(IDSFIQuoteNum);

		// Review Requested Date field
		op.reviewRequestedClick();
		op.ReviewRequestedDatePopulated();

		// First Survey Attempt Date field
		op.firstSurveyAttemptDate();
		op.firstSurveyAttemptDatePopulate();

		// Write-Up Amount field
		op.writeUpAmountField(WriteUpAmount);

		// County field
		op.countryField(Country);

		// eLead Create Date
		op.eLeadCreateDateClick();
		op.ELeadCreateDatePopulate();

		// Dealership field
		op.dealershipSearchFieldclick();
		op.dealershipSearchFieldPopulated();

		// Customer appointment Date and Time
		op.customerAppointmentDateAndTimeField();
		op.customerAppointmentDateAndTimeCalender();

		// Type dropdown field
		op.typeDropDownField();
		op.typeDropDownFieldPopulate();

		// Appointment completed Date
		op.AppointmentCompletedDateField();
		op.appointmentCompletedDateFieldCalender();

		// CustomerDelivery Date and Time
		op.customerDeliveryDateAndTime();
		op.customerDeliveryDateAndTimeCalender();

		// Appointment Set checkbox
//		op.appointmentSetCheckbox();

		// Delivery Set checkbox
//		op.deliverySetCheckbox();

		// Contacted
//		op.contactedCheckBox();

		// Up Assigned checkbox

//		op.upAssignedCheckbox();

		// Replied
//		op.repliedCheckBox();

//        // FirstResponseTime
//        op.firstResponseTimeField();
//        op.FirstResponseTimeFieldCalender();
//
//        // Replied checkbox
//
//        // PDIPrinted Date and Time
//        op.pdiPrintedDateAndTimeField();
//        op.PDIPrintedDateAndTimeCalender();
//
//        // BusinessAdjustedCreatedDate
//        op.businessAdjustedCreatedDateField();
//        op.BusinessAdjustedCreatedDateCalender();
//
//        // BusinessAdjustedCreatedDateEnd
//        op.businessAdjustedCreatedDateEndField();
//        op.BusinessAdjustedCreatedDateEndCalender();
//
//        // BusinessAdjustedCreatedDateStart
//        op.businessAdjustedCreatedDateStartField();
		// op.BusinessAdjustedCreatedDateStartCalender();

	}

	@Then("^Interested In Attributes$")
	public void populate_Interested_In_Attributes_fields() {

		// New/Used - Year To
		op.newUsedYearToClick();
		op.newUsedYearToPopulate();

		// Floorplan Style
		op.floorplanStyleClick();
		op.floorplanStylePopulate();

		// Genius Notes 1 (RV Attributes)
		op.geniusNotes1RVAttributes(GeniusNotes1);

		// Notes 2 (Meet & Greet)
		op.note2MeetAndGreet(Notes2MeetAndGreet);

		// Genius Notes 3 (Trade Notes)
		op.geniusNotes3TradeNotesInputField(GeniusNotes3TradeNotes);

		// # Sleeps
		op.numberSleep(NumSleeps);

		// Year From
		op.yearFromClick();
		op.yearFromPopulate();

		// Year To
		op.yearToClick();
		op.yearToPopulate();

		// Price From
//		op.priceFromClick();
//		op.PriceFromPopulate();

		// Price To
		op.priceToClick();
		op.PriceToPopulate();

		// Payment From
		op.paymentFromClick();
		op.paymentFromPopulate();

		// Payment To
		op.paymentToClick();
		op.paymentToPopulate();

		// Length From
		op.lengthFromClick();
		op.lengthFromPopulate();

		// Length To
		op.lengthToClick();
		op.lengthToPopulate();

		// # Slide Outs
		op.numberSlideOutsInputField();

	}

	@Then("^Interested In Details$")
	public void Interested_In_Details() {

		// Interested Type
		op.interestedTypeInputField(InterestedType);

		// Interior Color
		op.interiorColorInputField(InteriorColor);

		// Interested Category
		op.interestedCategoryInputField(IntrestedCategory);

		// Exterior Color
		op.exteriorColorInputField(ExteriorColor);

		// Interested Year
		op.interestedYear(InterestedYear);

		// # Doors
		op.numberDoors(Doors);

		// Interested Make
		op.interestedMakeInputField(InterestedMake);

		// Mileage
		op.mileageInputField(Mileage);

		// Interested Model
		op.interestedModelInputField(IntrestedModel);

		// Vehicle Options
		op.vehicleOptionsInputField(VehicleOptions);

		// Interested Product
		op.interestedProductInput(IntrestedProduct);

		// Interest Level dropdown
		op.iNterestLevelDropdownClick();
		op.iNterestLevelDropdownPopulate();

		// Vehicle Trim
		op.vehicleTrim(VehicleTrim);

		// Buying Horizon

		op.buyingHorizon(BuyingHorizon);

		// Vehicle Engine
		op.vehicleEngine(VehicleEngine);

		// Payment Method dropdown
		op.paymentMethodDropdownClick();
		op.paymentMethodDropdownPopulate();

		// Chassis dropdown
		op.chassisDropdownClick();
		op.chassisDropdownPopulate();

		// Payment Details
		op.paymentDetailsInput(PaymentDetails);

		// Transmission
		op.transmissionField(Transmission);

		// Vehicle pricing
		op.vehiclePricingField(VehiclePricing);

		// Interested Stock
		op.interestedStockField(InterestedStock);

		// Vehicle Comments
		op.vehicleCommentsField(VehicleComments);

		// Interested Id
		op.interestedIdField(IntrestedID);

		// Webpage
		op.webpageField(webpage);

		// Toy Deck drop down
		op.toyDeskDropdownClick();
		op.toyDeskDropdownPopulate();

		// Outdoor Kitchen
		op.outdoorKitchenDropdownClick();
		op.outdoorKitchenDropdownPopulate();

		// Outdoor Entertainment
		op.outdoorEntertainmentDropdownClick();
		op.outdoorEntertainmentDropdownPopulate();

		// Check boxes |Meet&Greet|Needs Analysis|Selection|Presentation|Intro to
		// Service|Write Up Stage|T.O to F&I|

		// Previouse Stage drop down
		op.previousStageDropdownClick();
		op.previousStageDropdownPopulate();

	}

	@Then("^Towing Information$")
	public void Towing_Information() {

		// Tow Vehicle Year
		op.towVehicleYearField(TowVehicleYear);

		// Max Towing Capacity
		op.maxTowingCapacityField(MaxTowingCapacity);

		// Tow Vehicle Make
		op.towVehicleMakeField(TowVehicleMake);

		// Tow Vehicle Model
		op.towVehicleModelField(TowVehicleModel);

		// Tow Vehicle VIN
		op.towVehicleVINField(TowVehicleVIN);

		// Tow Vehicle Trim
		op.towVehicleTrimField(TowVehicleTrim);

		// Tow Vehicle Style
		op.towVehicleStyleField(TowVehicleStyle);

	}

	@Then("^Currently Own Trade-InCurrently Own TradeIn from Web Lead fields$")
	public void currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields() {

		// Current Owner Category
		op.currentOwnerCategoryField(CurrentOwnerCategory);

		// Current Owned Mileage
		op.currentOwnedMileageField(CurrentOwnedMileage);

		// Current Owned Year
		op.currentOwnedYearField(CurrentOwnedYear);

		// Current Owned Payoff
		op.currentOwnedPayoffField(CurrentOwnedPayoff);

		// Current Owned Make
		op.currentOwnedMakeField(CurrentOwnedMake);

		// Current Owned Quote Low
		op.currentOwnedQuoteLowField(CurrentOwnedQuoteLow);

		// Current Owned Product
		op.currentOwnedProductField(CurrentOwnedProduct);

		// Current Owned Model
		op.currentOwnedModelField(CurrentOwnedModel);

		// Current Owned Quote High
		op.currentOwnedQuoteHighField(CurrentOwnedQuoteHigh);

		// Current Owned Trim
		op.currentOwnedTrimField(CurrentOwnedTrim);

		// Current Owned Quote Details
		op.currentOwnedQuoteDetailsField(CurrentOwnedQuoteDetails);

		// Current Owned Length
		op.currentOwnedLengthField(CurrentOwnedLength);

		// Current Owned Comments
		op.currentOwnedCommentsField(CurrentOwnedComments);

		// Current Owned Engine
		op.currentOwnedEngineField(CurrentOwnedEngine);

		// Current Owned Condition
		op.currentOwnedConditionField(CurrentOwnedCondition);

		// Current Owned ID
		op.currentOwnedIDField(CurrentOwnedID);

		// Current Owned Option
		op.currentOwnedOptionsField(CurrentOwnedOptions);

	}

	@Then("^Populate Info from lead fields$")
	public void pupulate_Info_from_lead_fields() {

		op.leadPhoneField(LeadPhone);

		// Lead Email
		op.leadEmailField(LeadEmail);

		// Lead Mobile Phone
		op.leadMobilePhoneField(LeadMobilePhone);

		// Lead Score
		op.leadScoreField(LeadScore);

		// Lead other Phone
		op.leadOtherPhoneField(LeadOtherPhone);

		// Lead Work Phone
		op.leadWorkPhoneField(LeadWorkPhone);

		// Lead Message
		op.leadMessageField(LeadMessage);

		// End Visit Notes
		op.endVisitNotesField(EndViditNotes);

	}

	@Then("^Lead Source$")
	public void Lead_Source() {
		// Source
		op.sourceField(Source);

		// Lead Source drop down
		op.leadSourceDropDownClick();
		op.leadSourceDropDownPopulate();

		// FormName
		op.FormNameField(FormName);

		// Web Lead Source Detail drop down
		op.webLeadSoureDetailDropDownClick();
		op.WebLeadSoureDetailDropDownPopulate();

		// Tracking Medium
		op.trackingMediumField(TrackingMedium);

		// Tracking SCPC
		op.trackingSCPCField(TrackingSCPC);

		// Web Lead Source Name
		op.webLeadSourceNameField(WebLeadSourceName);

		// Geo Lookup
		// Lead Queue Id
		// Original Location Account
		// Website
		// Location Primary Lead
		// Enterprise Lead

		// eLead Create Date
//        op.eLeadCreateDateCalender();
	}

	@Then("^Enter the Description Information$")
	public void enter_the_Description_Information() {
		// Description
		op.discriptionField(Discription);

//        // Price drop down
//        op.priceDropDownClick();
//        op.priceDropDownPopulate();
//
	}

	@Then("^Other data fields$")
	public void populate_Other_data_fields() {

		// Primary Email
		op.primaryEmailField(PrimaryEmail);

		// Primary Phone
		op.primaryPhoneField(PrimaryPhone);

		// Lead Ip Address
		op.leadIPAddressField(LeadIPAddress);

		// Lead System Data
		op.leadSystemDataField(LeadSystemData);

		// Category drop down
		op.categoryDropDownClick();
		op.categoryDropDownPopulate();

		// Tracking Id
		op.trackingIDField(TrackingID);

		// Tracking LandingPage URL
		op.trackingLandingPageURLField(TrackingLandingPageURL);

		// Tracking Referral URL
		op.trackingReferralURLField(TrackingReferralURL);

		// Tracking Promo Code
		op.trackingPromoCodeField(TrackingPromoCode);

		// Next Step
		op.nextStepField(NextStep);

		// Tracking Campaign
		op.trackingCampaignField(TrackingCampaign);

		// Tracking Source
		op.trackingSourceField(TrackingSource);

		// Tracking Content
		op.TrackingContentField(TrackingContent);

		// Tracking Keywords
		op.trackingKeywordsField(TrackingKeywords);

		// Backend GP
		op.BackendGPField(BackendGP);

		// Ad Campaign
		op.ADCampaignField(ADCampaign);

		// Ad Group
		op.aDGroupField(ADGroup);

		// Ad Keyword
		op.ADKeywordField(ADKeyword);

		// Ad Slot
		op.ADSlotField(ADSlot);

		// Ad Slot Position
		op.aDSlotPositionField(ADSlotPosition);

		// Ad Content
		op.ADContentField(ADContent);

		// Forecast Category
		// Manager Assisted | Manager Interaction | Manager Turn Over check boxes

	}

	@Then("^System Information fields$")
	public void System_Information_fields() {

		// LastActivityDate
		op.lastActivityDateCalender();

		// Next Activity Date
		op.nextActivityDateCalender();

		// LastStageChangeTime Date and Time
//        op.lastStageChangeTimeDateAndTimeCalender();

		// Last Sales Activity Date Time
		op.LastSalesActivityDateTimeCalender();

		// Last Lead Conversion Date Time
//        op.LastLeadConversionDateTimeCalender();

		// CRM Submission TIME DATE
		op.CRMSubmissionTIMEDATECalender();

	}

	@Then("^Click the Save button$")
	public void click_the_Save_button() {

		// Click on the Save button
//        op.clicktheSavebutton();
//
	}
}
