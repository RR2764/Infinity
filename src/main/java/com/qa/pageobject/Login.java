package com.qa.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.base.Base;
import java.time.Duration;

public class Login extends Base{
	
	

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		By userName = By.name("LoginId");
		By Password = By.name("UserPassword");
		By signIn = By.xpath("//button[contains(text(),Sign)]");
		By crmUserName = By.id("username");
		By crmPassword = By.id("password");
		By crmSignIn = By.id("Login");

		public Login() {
			PageFactory.initElements(driver, this);
		
		}

		public void infinityUserName(String username) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(username);
		}

		public void infinityPassword(String password) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Password)).sendKeys(password);
		}

		public void infinitySignIn() {
			wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
		}

		public void openCrmTab() {
			driver.navigate().to("https://test.salesforce.com/");
		}

		public void crmUserName(String username) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(crmUserName)).sendKeys(username);
		}

		public void crmPassword(String password) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(crmPassword)).sendKeys(password);
		}

		public void crmSignIn() {
			wait.until(ExpectedConditions.elementToBeClickable(crmSignIn)).click();
		}

		public void infinityLogin(String crm_admin_username, String crm_admin_pwd) {
			driver.get("https://onepointuatapps.pnbhousing.com/LeadSystem/Home/Index");
			infinityUserName(crm_admin_username);
			infinityPassword(crm_admin_pwd);
			infinitySignIn();

		}

		public void crm_admin_Login(String crm_admin_username, String crm_admin_pwd) {
			driver.get("https://test.salesforce.com/");
			crmUserName(crm_admin_username);
			crmPassword(crm_admin_pwd);
			crmSignIn();
			
		}
		public void crm_Login(String crm_admin_username, String crm_admin_pwd) {
			crmUserName(crm_admin_username);
			crmPassword(crm_admin_pwd);
			crmSignIn();
			
		}

		public String ValidateLoginPageTitle() {
			return driver.getTitle();
		}

	}

