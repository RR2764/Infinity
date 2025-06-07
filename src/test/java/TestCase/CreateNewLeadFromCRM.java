package TestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pageobject.Login;
import com.qa.pageobject.qa_crm_createLead;
import com.qa.util.VideoRecorder;
import com.qa.util.qa_infinity_dataProviderutils;

import com.qa.Listener.TestAllureListener;

import java.lang.reflect.Method;
import static io.qameta.allure.SeverityLevel.BLOCKER;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import io.qameta.allure.testng.AllureTestNg;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;

public class CreateNewLeadFromCRM extends Base {

	Login qaInfinityLoginPage;
	qa_crm_createLead qa_crm_CreateLead;

	public CreateNewLeadFromCRM() {
		super();

	}

	@BeforeMethod
	@Parameters("browser")
	public void setUp(@Optional("chrome") String browser, Method method) throws IOException {
		infinity_Initialization(browser);
		qaInfinityLoginPage = new Login();
		qa_crm_CreateLead = new qa_crm_createLead();

	}

	@Test(description = "Lead Assignment ", dataProvider = "infinitycredencialtestData", dataProviderClass = qa_infinity_dataProviderutils.class)
	@Severity(CRITICAL)
	@Description("Verify that a supervisor can create and Telecaller assign to infinity")
	@Epic("Lead Management")
	@Feature("Lead Creation and Assignment")
	@Story("Lead Assignment from CRM to RO")
	public void leadAssignementToInfinity(String crm_admin_username, String crm_admin_pwd, String fname, String mname,
			String lname, String eml, String mob, String product_name, String purpose_Of_Loan, String nature_of_loan,
			String loanamountrequested, String lead_source, String property_Located, String Tele_username,
			String Tele_pwd, String businessCategories) throws InterruptedException {
		qaInfinityLoginPage.crm_admin_Login(crm_admin_username, crm_admin_pwd);
		qa_crm_CreateLead.navigateLoanPage();
		qa_crm_CreateLead.create_crm_Lead(fname, mname, lname, eml, mob, product_name, purpose_Of_Loan, nature_of_loan,loanamountrequested, lead_source, property_Located,Tele_username,Tele_pwd);
		qaInfinityLoginPage.crm_admin_Login(Tele_username, Tele_pwd);
		qa_crm_CreateLead.roAssignment(businessCategories);
	//	attachText("Generated Lead ID", qa_crm_CreateLead.enterLeadNumber());
		 //loginPage.crm_admin_Login(roUsername, roPassword);
		//    boolean isVisibleToRO = leadPage.verifyLeadVisibleToRO(generatedLeadId);
		//    Assert.assertTrue(isVisibleToRO, "Lead was not assigned correctly to RO.")
	}
	
	@Attachment(value = "Screenshot", type = "image/png")
	public byte[] saveScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	@Attachment(value = "{0}", type = "text/plain")
	public static String attachText(String name, String content) {
	    return content;
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			saveScreenshot();
		}

		if (driver != null) {
			driver.quit();
		}
	}



}

/*
 * public void tearDown(Method method) throws IOException {
 * screenRecorder.stop(); screenRecorder.attachVideoToAllure();
 */
