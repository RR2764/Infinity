package com.qa.pageobject;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Base;

public class qa_crm_createLead extends Base {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	Login qaInfinityLoginPage;

	By leadsTab = By.xpath("//one-app-nav-bar-item-root[2]");
	By newButton = By.xpath("//li[1]/a/div[@title='New']");
	By loanRadioButton = By.xpath("//fieldset/div/span[1]/label/span[2]");
	By First_Name = By.xpath(
			"//lightning-layout-item[1]/slot/lightning-input-field/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	By Middle_Name = By.xpath(
			"//lightning-layout-item[2]/slot/lightning-input-field/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	By Last_Name = By.xpath(
			"//lightning-layout-item[3]/slot/lightning-input-field/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	By Email = By.xpath(
			"//lightning-layout-item[4]/slot/lightning-input-field/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	By Mobile = By.xpath(
			"//lightning-layout-item[5]/slot/lightning-input-field/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	By Product_Name = By.xpath("//button[@aria-label = 'Product Name']");
	By productname_dropdown1 = By.xpath("//div[@aria-label = 'Product Name']");
	By productname_dropdown2 = By.xpath("//div[@aria-label = 'Product Name']/lightning-base-combobox-item");
	By productname_dropdown3 = By
			.xpath("//div[@aria-label = 'Product Name']/lightning-base-combobox-item/span[2]/span");
	By Purpose_of_Loan = By.xpath("//button[@aria-label = 'Purpose of Loan']");
	By Purpose_of_Loan_dd1 = By.xpath("//div[@aria-label = 'Purpose of Loan']");
	By Purpose_of_Loan_dd2 = By.xpath("//div[@aria-label = 'Purpose of Loan']/lightning-base-combobox-item");
	By Purpose_of_Loan_dd3 = By
			.xpath("//div[@aria-label = 'Purpose of Loan']/lightning-base-combobox-item/span[2]/span");
	By nature_Of_Loan = By.xpath("//button[@aria-label = 'Nature of Loan']");
	By nature_of_loan_dd1 = By.xpath("//div[@aria-label = 'Nature of Loan']");
	By nature_of_loan_dd2 = By.xpath("//div[@aria-label = 'Nature of Loan']/lightning-base-combobox-item");
	By nature_of_loan_dd3 = By.xpath("//div[@aria-label = 'Nature of Loan']/lightning-base-combobox-item/span[2]/span");
	By lead_Source = By.xpath("//button[@aria-label = 'Lead Source']");
	By lead_source_dd1 = By.xpath("//div[@aria-label = 'Lead Source']");
	By lead_source_dd2 = By.xpath("//div[@aria-label = 'Lead Source']/lightning-base-combobox-item");
	By lead_source_dd3 = By.xpath("//div[@aria-label = 'Lead Source']/lightning-base-combobox-item/span[2]/span");

	By City_where_PropertyIsLocated = By.xpath("//button[@aria-label = 'City where Property is Located']");
	By City_where_PropertyIsLocateddd1 = By.xpath("//div[@aria-label = 'City where Property is Located']");
	By City_where_PropertyIsLocateddd2 = By
			.xpath("//div[@aria-label = 'City where Property is Located']/lightning-base-combobox-item");
	By City_where_PropertyIsLocateddd3 = By
			.xpath("//div[@aria-label = 'City where Property is Located']/lightning-base-combobox-item/span[2]/span");
	By Lead_Source = By.xpath(
			"//lightning-layout-item[]/slot/lighting-input-field/lighting-input/lighting-primitive-input-simple/div[1]/div/input");
	By Lead_Sub_Source = By.xpath(
			"//lightning-layout-item[]/slot/lighting-input-field/lighting-input/lighting-primitive-input-simple/div[1]/div/input");
	By Loan_amount_Requested = By.xpath(
			"//lightning-layout-item[11]/slot/lightning-input-field/lightning-input/lightning-primitive-input-simple/div[1]/div/input");
	By City_where_Property_is_Located = By.xpath(
			"//lightning-layout-item[]/slot/lighting-input-field/lighting-input/lighting-primitive-input-simple/div[1]/div/input");
	By saveButton = By.xpath("//lightning-layout-item[13]/slot/lightning-button[2]/button");
	By crmUserName = By.xpath("//input[@name='FirstName']");
	By crmPassword = By.id("password");
	By crmSignIn = By.id("Login");
	By clickOnLeadNumber = By.xpath("//th/span/a[@data-refid = 'recordId']");
	By moreOption = By.xpath("//tr/td[11]/span/div/a");
	By LeadTable = By.xpath("//table[@role='grid' and @aria-label= 'Recently Viewed' and @data-num-rows ]/tbody");
	By LeadList = By.xpath("//table[@role='grid' and @aria-label= 'Recently Viewed' and @data-num-rows ]/tbody/tr");
	By LeadNumberColumn = By.xpath(
			"//table[@role='grid' and @aria-label= 'Recently Viewed' and @data-num-rows ]/tbody/tr/td[@data-label='Lead Number']");

	By gobalSearch = By.xpath(
			"//button[@class= 'slds-button slds-button_neutral search-button slds-truncate' and @aria-label = 'Search']");

	By enterLeadNumField = By.xpath(
			"//lightning-input[@class='saInput slds-grow slds-form-element']//input[@class = 'slds-input' and @type ='search']");

	By listAction = By.xpath(
			"//table[@role='grid' and @aria-label= 'Recently Viewed' and @data-num-rows ]/tbody/tr/td[@data-label='']");
	By changeOwnerOption = By.xpath("/html/body/div[8]/div/ul/li[2]");
	By assignExe = By.xpath(("//input[@title = 'Search Users']"));
	By clickOption = By.xpath("//div/div[2]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[1]/div/div[2]");
	By clickSubmitBtn = By.xpath("//span[contains(text(),'Submit')]");

	By clickOnLeadNumbers = By.xpath("//div/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[2]");
	By editBtn = By.xpath("//button[@title = 'Edit Category']");
	By logOut = By.xpath("//div[@aria-live='polite' and @data-index='0']/a");
	By business_Categories = By.xpath("//button[@aria-label = 'Category']");
	By business_Categories_dd1 = By.xpath("//div[@aria-label = 'Category']");
	By business_Categories_dd2 = By.xpath("//div[@aria-label = 'Category']/lightning-base-combobox-item");
	By business_Categories_dd3 = By.xpath("//div[@aria-label = 'Category']/lightning-base-combobox-item/span[2]/span");
	By property_Pincode = By.name("Property_Pin_Code__c");
	By property_Identified = By.xpath("//button[@aria-label = 'Property Identified']");
	By property_Identified_dd1 = By.xpath("//div[@aria-label = 'Property Identified']");
	By property_Identified_dd2 = By.xpath("//div[@aria-label = 'Property Identified']/lightning-base-combobox-item");
	By property_Identified_dd3 = By
			.xpath("//div[@aria-label = 'Property Identified']/lightning-base-combobox-item/span[2]/span");
	By costOfProperty = By.name("Cost_of_Property__c");
	By apf = By.xpath("//button[@aria-label = 'apf']");
	By apf_dd1 = By.xpath("//div[@aria-label = 'apf']");
	By apf_dd2 = By.xpath("//div[@aria-label = 'apf']/lightning-base-combobox-item");
	By apf_dd3 = By.xpath("//div[@aria-label = 'apf']/lightning-base-combobox-item/span[2]/span");
	By project_Name = By.name("Builder_Name_Project__c");
	By loan_Tenure = By.name("Loan_Tenure__c");
	By resident_State = By.name("Resident_State__c");
	By builder_Name = By.name("Builder_s_Name__c");
	By property_Details = By.name("Property_Details__c");
	By age = By.name("Age__c");
	By pan_Number = By.name("PAN_Number__c");
	By emp_Name = By.name("Employer_Name__c");
	By gender = By.name("Gender__c");
	By resident_Type = By.name("Resident_Type__c");
	By profession = By.name("Profession__c");
	By total_Experience_Years = By.name("Total_Experience_Years__c");
	By total_EMIs = By.name("Total_EMIs_you_pay_per_Month__c");
	By retirement_Age = By.name("Retirement_Age__c");
	By coApplicantName = By.name("Co_Applicant_Name__c");
	By relationship	= By.name("Relationship__c");
	By coApplicantDOB = By.name("Co_Applicant_Date_Of_Birth__c");
	By coApplicantTypeEmployment= By.name("Co_Applicant_Type_of_Employment__c");
	By coApplicantAge = By.name("Co_Applicant_Age__c");
	By coapplicantRetirementAge= By.name("Co_applicant_Retirement_Age__c");
	By totalEMICoapplicant= By.name("Total_EMI_the_Co_applicant_currently_pay__c");
	By coapplicantEmployerName= By.name("Co_applicant_Employer_Name__c");
	By alternateNumber1	= By.name("Alternate_Number__c");
	By alternateNumber2	= By.name("Alternate_Number_2__c");

	public qa_crm_createLead() {
		PageFactory.initElements(driver, this);

	}

	public void clickLeadTab() {
		wait.until(ExpectedConditions.elementToBeClickable(leadsTab)).click();
	}

	public void clickNewbutton() {
		wait.until(ExpectedConditions.elementToBeClickable(newButton)).click();
	}

	public void clickLoanOption() {
		wait.until(ExpectedConditions.elementToBeClickable(loanRadioButton)).click();
	}

	public void fName(String fname) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(First_Name)).sendKeys(fname);
	}

	public void mName(String mname) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Middle_Name)).sendKeys(mname);
	}

	public void lName(String lname) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Last_Name)).sendKeys(lname);
	}

	public void email(String eml) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Email)).sendKeys(eml);
	}

	public void mobile(String mob) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Mobile)).sendKeys(mob);
	}

	public void clickProductName() {
		wait.until(ExpectedConditions.elementToBeClickable(Product_Name)).click();
	}

	public void clickPurposeOfLoan() {
		wait.until(ExpectedConditions.elementToBeClickable(Purpose_of_Loan)).click();
	}

	public void clickNatureOfLoan() {
		wait.until(ExpectedConditions.elementToBeClickable(nature_Of_Loan)).click();
	}

	public void clickleadSource() {
		wait.until(ExpectedConditions.elementToBeClickable(lead_Source)).click();
	}

	public void clickOnleadNumberAfterSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(clickOnLeadNumbers)).click();
	}

	public void clickPropertyCity() {
		wait.until(ExpectedConditions.elementToBeClickable(City_where_PropertyIsLocated)).click();
	}

	public void lead_Sub_Source(String leadSubSource) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Lead_Sub_Source)).sendKeys(leadSubSource);
	}

	public void loan_amount_Requested(String loanamountrequested) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Loan_amount_Requested)).sendKeys(loanamountrequested);
	}

	public void clickOnEdit() {
		wait.until(ExpectedConditions.elementToBeClickable(editBtn)).click();
	}

	public void clickOnLogout() {
		wait.until(ExpectedConditions.elementToBeClickable(logOut)).click();
	}

	public void clickOnBusinessCategories() {
		wait.until(ExpectedConditions.elementToBeClickable(business_Categories)).click();

	}

	public void city_where_Property_is_Located(String propertyislocated) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(City_where_Property_is_Located))
				.sendKeys(propertyislocated);
	}

	public void projectName(String Project_Name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(project_Name)).sendKeys(Project_Name);
	}

	public void loanTenure(String Loan_Tenure) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loan_Tenure)).sendKeys(Loan_Tenure);
	}

	public void residentState(String Resident_State) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(resident_State)).sendKeys(Resident_State);
	}

	public void builderName(String Builder_Name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(builder_Name)).sendKeys(Builder_Name);
	}

	public void propertyDetails(String Property_Details) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(property_Details)).sendKeys(Property_Details);
	}

	public void age_c(String Age) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(age)).sendKeys(Age);
	}

	public void panNumber(String Pan_Number) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(pan_Number)).sendKeys(Pan_Number);
	}

	public void EmpName(String Emp_Name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(emp_Name)).sendKeys(Emp_Name);
	}

	public void gender_c(String Gender) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).sendKeys(Gender);
	}

	public void residentType(String Resident_Type) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(resident_Type)).sendKeys(Resident_Type);
	}

	public void profession_c(String Profession) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(profession)).sendKeys(Profession);
	}

	public void totalExperienceYears(String Total_Experience_Years) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(total_Experience_Years))
				.sendKeys(Total_Experience_Years);
	}

	public void totalEMIs(String Total_EMIs) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(total_EMIs)).sendKeys(Total_EMIs);
	}

	public void retirementAge(String Retirement_Age) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(retirement_Age)).sendKeys(Retirement_Age);
	}

	public void assignExecutive() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(assignExe)).sendKeys("Akansha Wellington");
		wait.until(ExpectedConditions.visibilityOfElementLocated(assignExe)).sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(clickOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clickSubmitBtn)).click();
	}

	public void savebtn() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void clickOnSearchField() {
		wait.until(ExpectedConditions.elementToBeClickable(gobalSearch)).click();
	}

	public class TestDataStore {
		private static Map<String, String> dataMap = new HashMap<>();

		public static void set(String key, String value) {
			dataMap.put(key, value);
		}

		public static String get(String key) {
			return dataMap.get(key);
		}
	}

	public void setLeadNumber() {
		String LeadNumber = driver
				.findElement(By.xpath("//flexipage-field[@data-field-id = 'RecordLead_Number_cField']//dd//span"))
				.getText();
		TestDataStore.set("Lead Number", LeadNumber);

	}

	public String getLeadNumber() {
		// getLeadNumber();
		String LeadNumber = TestDataStore.get("Lead Number");
		System.out.println("Lead Number :: " + LeadNumber);
		return LeadNumber;
	}

	public void enterLeadNumber() {
		WebElement inputLan = wait.until(ExpectedConditions.visibilityOfElementLocated(enterLeadNumField));
		inputLan.sendKeys(getLeadNumber());
		inputLan.sendKeys(Keys.RETURN);

	}

	public void clickOnLeadNumber() {
		wait.until(ExpectedConditions.elementToBeClickable(clickOnLeadNumber)).click();
	}

	public void productName(String product_name) {
		clickProductName();
		WebElement baseTableList = driver.findElement(productname_dropdown1);
		List<WebElement> listproductName = baseTableList.findElements(productname_dropdown2);
		for (WebElement row : listproductName) {
			List<WebElement> columbProductName = row.findElements(productname_dropdown3);
			for (WebElement cell : columbProductName) {
				String prodnam = cell.getText();
				System.out.println(prodnam);
				if ("Housing Loan".equalsIgnoreCase(prodnam) && "Housing Loan".equalsIgnoreCase(product_name)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Non - Housing Loan".equals(prodnam)
						&& "Non - Housing Loan".equalsIgnoreCase(product_name)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Others".equalsIgnoreCase(prodnam) && "Others".equalsIgnoreCase(product_name)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				}
			}
		}
	}

	public void purposeOfLoan(String purpose_Of_Loan) {
		clickPurposeOfLoan();
		WebElement baseTableList = driver.findElement(Purpose_of_Loan);
		List<WebElement> listPurposeLoan = baseTableList.findElements(Purpose_of_Loan_dd1);
		for (WebElement row : listPurposeLoan) {
			List<WebElement> columbPurposeOfLoan = row.findElements(Purpose_of_Loan_dd2);
			for (WebElement cell : columbPurposeOfLoan) {
				String purposeOfLoanName = cell.getText();
				System.out.println(purposeOfLoanName);
				if ("Home Extension Loan-Non Individual".equalsIgnoreCase(purposeOfLoanName)
						&& "Home Extension Loan-Non Individual".equalsIgnoreCase(purpose_Of_Loan)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Home Extention Loan".equals(purposeOfLoanName)
						&& "Home Extention Loan".equalsIgnoreCase(purpose_Of_Loan)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Others".equalsIgnoreCase(purposeOfLoanName) && "Others".equalsIgnoreCase(purpose_Of_Loan)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				}
			}
		}
	}

	public void natureOfLoan(String nature_of_loan) {
		clickNatureOfLoan();
		WebElement baseTableList = driver.findElement(nature_Of_Loan);
		List<WebElement> listNatureOfLoan = baseTableList.findElements(nature_of_loan_dd1);
		for (WebElement row : listNatureOfLoan) {
			List<WebElement> columnNatureOfLoan = row.findElements(nature_of_loan_dd2);
			for (WebElement cell : columnNatureOfLoan) {
				String natureOfLoan = cell.getText();
				System.out.println(natureOfLoan);
				if ("Top Up- BT".equalsIgnoreCase(natureOfLoan) && "Top Up- BT".equalsIgnoreCase(nature_of_loan)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Seller BT".equalsIgnoreCase(nature_of_loan)
						&& "Seller BT".equalsIgnoreCase(nature_of_loan)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				}
			}
		}

	}

	public void leadSource(String lead_source) {
		clickleadSource();
		WebElement baseTableList = driver.findElement(lead_Source);
		List<WebElement> listLeadSource = baseTableList.findElements(lead_source_dd1);
		for (WebElement row : listLeadSource) {
			List<WebElement> columnLeadSource = row.findElements(lead_source_dd2);
			for (WebElement cell : columnLeadSource) {
				String LeadSource = cell.getText();
				System.out.println(LeadSource);
				if ("Website".equalsIgnoreCase(LeadSource) && "Website".equalsIgnoreCase(lead_source)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Missed Call".equalsIgnoreCase(LeadSource) && "Missed Call".equalsIgnoreCase(lead_source)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				}
			}
		}

	}

	public void cityPropertyLocated(String property_Located) {
		clickPropertyCity();
		WebElement baseTableList = driver.findElement(City_where_PropertyIsLocateddd1);
		List<WebElement> listPropertyLocated = baseTableList.findElements(City_where_PropertyIsLocateddd2);
		for (WebElement row : listPropertyLocated) {
			List<WebElement> columnPropertyLocated = row.findElements(City_where_PropertyIsLocateddd3);
			for (WebElement cell : columnPropertyLocated) {
				String propLoct = cell.getText();
				System.out.println(propLoct);
				if ("Agra".equalsIgnoreCase(propLoct) && "Agra".equalsIgnoreCase(property_Located)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Ahmedabad".equalsIgnoreCase(propLoct) && "Ahmedabad".equalsIgnoreCase(property_Located)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				}
			}
		}

	}

	public void navigateLoanPage() {
		clickLeadTab();
		clickNewbutton();
		clickLoanOption();
	}

	public void searchLeadfromListingPage() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("location.reload()");
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));
		clickLeadTab();
		changeOwner();

		/*
		 * clickLeadTab(); clickOnSearchField(); enterLeadNumber(); //
		 * ((JavascriptExecutor) driver).executeScript("location.reload()"); //
		 * wait.until(webDriver -> ((JavascriptExecutor)
		 * webDriver).executeScript("return document.readyState").equals("complete"));
		 * 
		 * //((JavascriptExecutor) driver).executeScript("location.reload()");
		 * //((JavascriptExecutor) driver).executeScript("location.reload()");
		 * changeOwner(); //clickOnLeadNumber();
		 */

	}

	public void changeOwner() {
		WebElement tableLeadGrid = driver.findElement(LeadTable);
		List<WebElement> leadList = tableLeadGrid.findElements(LeadList);
		for (WebElement row : leadList) {
			List<WebElement> columnLeadNumber = row.findElements(LeadNumberColumn);
			for (WebElement cell : columnLeadNumber) {
				String leadNumber = cell.getText();
				System.out.println("Pick FROM GRID" + " " + leadNumber);
				String leadnum = TestDataStore.get("Lead Number");
				System.out.println("Pick FROM LeadDetail" + " " + leadnum);
				if (leadNumber.equalsIgnoreCase(leadnum)) {
					wait.until(ExpectedConditions.elementToBeClickable(listAction)).click();
					wait.until(ExpectedConditions.elementToBeClickable(changeOwnerOption)).click();
					assignExecutive();
					return;

				}
			}
		}

	}

	public void create_crm_Lead(String fname, String mname, String lname, String eml, String mob, String product_name,
			String purpose_Of_Loan, String nature_of_loan, String loanamountrequested, String lead_source,
			String property_Located, String Tele_username, String Tele_pwd) throws InterruptedException {
		fName(fname);
		mName(mname);
		lName(lname);
		email(eml);
		mobile(mob);
		productName(product_name);
		purposeOfLoan(purpose_Of_Loan);
		natureOfLoan(nature_of_loan);
		leadSource(lead_source);
		cityPropertyLocated(property_Located);
		loan_amount_Requested(loanamountrequested);
		savebtn();
		setLeadNumber();
		searchLeadfromListingPage();

	}

	public void businessCategories(String businessCategories) throws InterruptedException {
		clickOnBusinessCategories();
		WebElement baseTableList = driver.findElement(business_Categories_dd1);
		List<WebElement> listBusinessCategoriesStatus = baseTableList.findElements(business_Categories_dd2);
		for (WebElement row : listBusinessCategoriesStatus) {
			List<WebElement> columbMaritalStatus = row.findElements(business_Categories_dd3);
			for (WebElement cell : columbMaritalStatus) {
				String maritalStatusText = cell.getText();
				System.out.println(maritalStatusText);
				if ("Prime".equalsIgnoreCase(maritalStatusText) && "Prime".equalsIgnoreCase(businessCategories)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Affordable".equals(maritalStatusText)
						&& "Affordable".equalsIgnoreCase(businessCategories)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				} else if ("Emerging".equalsIgnoreCase(maritalStatusText)
						&& "Emerging".equalsIgnoreCase(businessCategories)) {
					wait.until(ExpectedConditions.elementToBeClickable(cell)).click();
					return;
				}
			}
		}
	}

	public void selectLeadFromGrid() {
		WebElement tableLeadGrid = driver.findElement(LeadTable);
		List<WebElement> leadList = tableLeadGrid.findElements(LeadList);
		for (WebElement row : leadList) {
			List<WebElement> columnLeadNumber = row.findElements(LeadNumberColumn);
			for (WebElement cell : columnLeadNumber) {
				String leadNumber = cell.getText();
				System.out.println("Pick FROM GRID" + " " + leadNumber);
				String leadnum = TestDataStore.get("Lead Number");
				System.out.println("Pick FROM LeadDetail" + " " + leadnum);
			}
		}

	}

	public void roAssignment(String businessCategories) throws InterruptedException {

		clickLeadTab();
		Thread.sleep(20000);
		clickOnSearchField();
		enterLeadNumber();
		clickOnleadNumberAfterSearch();
		clickOnEdit();
		businessCategories(businessCategories);
		/*
		 * businessCategory(business_Category); propertyPincode(property_pincode);
		 * Property Identified
		 */

	}

}
