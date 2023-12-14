package com.abacus.testsNotLoggedInPages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abacus.base.BaseClass;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class abacusForms extends BaseClass {
	
	@FindBy (xpath = "//android.widget.Button[@text='Sign in later']")
	WebElement signInLaterEdgeButton;
	
	@FindBy (xpath = "//android.widget.Button[@text='Confirm']")
	WebElement confirmButton;
	
	@FindBy (xpath = "//android.widget.Button[@text='Not now']")
	WebElement notNowButon;
	
	@FindBy (xpath = "//input[@name='email'] | (//android.widget.TextView[@text='Your e-mail address']/../following-sibling::android.widget.EditText)[1]")
	public WebElement inputEmail;
	
	@FindBy (xpath = "//span[contains(text(),'Continue')] | //android.widget.TextView[@text='Continue']")
	public WebElement continueButton;
	
	@FindBy (xpath = "//input[@name='namePers'] | (//android.widget.TextView[@text='Title']/../following-sibling::android.widget.EditText)[1]")
	public WebElement personName;
	
	@FindBy (xpath = "//input[@name='namePers'] | (//android.widget.TextView[@text='Your Name']/../following-sibling::android.widget.EditText)[1]")
	public WebElement personNameConsultation;
	
	@FindBy (xpath = "//input[@name='nameOrg'] | (//android.widget.TextView[@text='Company']/../following-sibling::android.widget.EditText)[1]")
	public WebElement personOrg;
	
	@FindBy (xpath = "//input[@name='nameOrg'] | (//android.widget.TextView[@text='Name of Organization']/../following-sibling::android.widget.EditText)[1]")
	public WebElement personOrgConsultation;
	
	@FindBy (xpath = "//input[@name='persRole'] | (//android.widget.TextView[@text='What is your role?']/../following-sibling::android.widget.EditText)[1]")
	public WebElement personRoleConsultation;
	
	@FindBy (xpath = "//span[contains(text(),'Finish')] | //android.widget.TextView[@text='Finish']")
	public WebElement finishButton;
	
	@FindBy (xpath = "//div[contains(text(),'Thanks for requesting access to Abacus.AI, we will get back to you shortly')] | //android.widget.TextView[@text='Thanks for requesting access to Abacus.AI, we will get back to you shortly']")
	public WebElement successMsgRequestAccess;
	
	@FindBy (xpath = "//div[contains(text(), 'Please use a professional or academic email address')]")
	public WebElement errorMsg;
	
	@FindBy (xpath = "//div[contains(text(),'Thanks for booking a demo, we will get back to you shortly')] | //android.widget.TextView[@text='Thanks for booking a demo, we will get back to you shortly']")
	public WebElement successMsgRequestConsultation;
	
	@FindBy (xpath = "//span[contains(text(),'Close')]")
	public WebElement closeButton;
	
	@FindBy (xpath = "//android.widget.TextView[@text='Error: Email must be from a corporate email account.']")
	public WebElement errorMsgOnEdge;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please use a professional or academic email address.'] | //div[contains(text(),'Please use a professional')]")
	public WebElement errorMsgRequestConsultaionOnEdge;
	
	public abacusForms() {
		PageFactory.initElements(driver, this);
	}
	
	public void skipSignInProcessEdge() {
		click(signInLaterEdgeButton);
		click(confirmButton);
		click(notNowButon);
	}
	
	public void enterEmailInForm(String email) {

		waitForElementVisibility(inputEmail, defaultTimeForVisibility);
		sendKeysToWebElement(inputEmail, email);
		
	}
	
	public void clickContinueButtonInRequestForm() {
		click(continueButton);
	}

//	public void selectASingleUseCaseFromList() {
//		WebElement usecase = driver.findElement(By.xpath("(//div[@class='ui checkbox usecaseLabel'])[1]"));
//		waitTime(2000);
//		scrollToElementMobileView(usecase);
//		click(usecase);
//	}
//	public void scrollToConitnueButtonAndClick() {
//		scrollToElementMobileView(continueButton);
//		click(continueButton);
//	}

	public void enterNameInForm(String name) {
		waitForElementVisibility(personName, defaultTimeForVisibility);
		sendKeysToWebElement(personName, name);
	}
	public void enterNameInConsultationForm(String name) {
		waitForElementVisibility(personNameConsultation, defaultTimeForVisibility);
		sendKeysToWebElement(personNameConsultation, name);
	}

	public void enterOrganizationInForm(String org) {
		waitForElementVisibility(personOrg, defaultTimeForVisibility);
		sendKeysToWebElement(personOrg, org);
	}
	public void enterOrganizationInConsultationForm(String org) {
		waitForElementVisibility(personOrgConsultation, defaultTimeForVisibility);
		sendKeysToWebElement(personOrgConsultation, org);
	}

	public void enterRoleInConsultationForm(String role) {
		waitForElementVisibility(personRoleConsultation, defaultTimeForVisibility);
		sendKeysToWebElement(personRoleConsultation, role);
	}

	public void clickFinishInForm() {
		click(finishButton);
	}
	public boolean succesMessageVisibleInRequestAccessForm() {
		try {
			click(continueButton);
			waitForElementVisibility(successMsgRequestAccess, 10);
			return isElementDisplayed(successMsgRequestAccess);
		}
		catch(Exception e) {
			waitForElementVisibility(successMsgRequestAccess, 10);
			return isElementDisplayed(successMsgRequestAccess);
		}
		
	}
	
	public boolean succesMessageVisibleInRequestConsultationForm() {
		try {
			click(finishButton);
			waitTime(5000);
			waitForElementVisibility(successMsgRequestConsultation, defaultTimeForVisibility);
			return isElementDisplayed(successMsgRequestConsultation);
		}
		catch(Exception e) {
			waitForElementVisibility(successMsgRequestConsultation, defaultTimeForVisibility);
			return isElementDisplayed(successMsgRequestConsultation);
		}
		
	}
	public String getErrorMsgOnRequestConsultaionAlert() {
		try {
			click(finishButton);
			waitTime(5000);
			return errorMsgRequestConsultaionOnEdge.getText();
		}
		catch (Exception e) {
			return errorMsgRequestConsultaionOnEdge.getText();
		}
	}
	
	public String errorMessage() {
		return getElementText(errorMsg);
	}
	public void clickCloseInRequestAccessForm() {
		click(closeButton);
	}
	public String getErrorMsgOnAlert() {
		try {
			try {
			click(continueButton);
			waitTime(3000);
			return getAlertText();
			}
			catch (Exception e) {
				return getAlertText();
		} 
		
		}
		catch (Exception e) {
			return errorMsgOnEdge.getText();
		}
	}
}

