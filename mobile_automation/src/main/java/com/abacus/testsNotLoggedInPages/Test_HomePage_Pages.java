package com.abacus.testsNotLoggedInPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abacus.base.BaseClass;

public class Test_HomePage_Pages extends BaseClass {
	@FindBy(xpath = "(//img[contains(@src,'logo')])[1] | (//android.widget.Image[1])[1]")
	public WebElement logo;
	
	@FindBy(xpath = "//img[@id='hamb'] | //android.widget.Image[@text='hamb']")
	public WebElement navBar;
	
	
	@FindBy (xpath = "//a[contains(text(),'REQUEST ACCESS')] | //android.view.View[@content-desc='REQUEST ACCESS']")
	public WebElement  requestAccessButttonNavBar;
	
	

	public Test_HomePage_Pages() {
		
		PageFactory.initElements(driver, this);
		
	}

	public boolean verifyAbacusLogoIsDisplayed() {
		
		return isElementDisplayed(logo);
		
	}
	
	public boolean verifyNavigationBarIsVisible() {
		
		return isElementDisplayed(navBar);
		
	}
	
	
	public boolean verifyRequestAccessButtonIsVisible() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement item = driver.findElement(By.xpath("//span[contains(text(), 'Request Access')] | //android.view.View[@content-desc='Request Access'] | //android.view.View[@text='Request Access']"));
				expt = isElementDisplayed(item);
				break;
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
			}
		}
		return expt;
	}

	public boolean clickRequestAccessButton() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement button = driver.findElement(By.xpath("//span[contains(text(), 'Request Access')] | //android.view.View[@content-desc='Request Access'] | //android.view.View[@text='Request Access']"));    
	        	click(button);
	        	waitTime(2000);
				driver.findElement(By.xpath("//input[@name='email'] | (//android.widget.TextView[@text='Your e-mail address']/../following-sibling::android.widget.EditText)[1]"));
	        	expt = true;
				break;
		       
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
				expt = false;
			}
		}
		return expt;
	}

	public void clickOnNavigationBarToExpand() {
		
			click(navBar);
	}
	public boolean verifyNavigationBarIsClickable() {
		
		return isElementClickable(navBar, defaultTimeForVisibility);
}

	public void clickRequestAccessButtonInNavBar() {
		click(requestAccessButttonNavBar);
	}	
	
	public boolean verifyRequestConButtonIsVisible() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement item = driver.findElement(By.xpath("//span[contains(text(), 'Request Consultation')] | //android.widget.TextView[@text='Request Consultation']"));
				expt = isElementDisplayed(item);
				break;
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
			}
		}
		return expt;
	}
	
	public boolean verifyBookADemonIsVisible() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement item = driver.findElement(By.xpath("//span[contains(text(), 'Book a Demo')] | //android.widget.TextView[@text='Book a Demo']"));
				expt = isElementDisplayed(item);
				break;
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
			}
		}
		return expt;
	}	
	
	public boolean clickRequestConsultationButton() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement item = driver.findElement(By.xpath("//span[contains(text(), 'Request Consultation')] | //android.view.View[@text='Request Consultation']"));
				click(item);
				waitTime(2000);
				driver.findElement(By.xpath("//input[@name='email'] | (//android.widget.TextView[@text='Your e-mail address']/../following-sibling::android.widget.EditText)[1]"));
				expt = true;
				break;
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
				expt = false;
			}
		}
		return expt;
	}
	
	public boolean clickBookADemo() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement item = driver.findElement(By.xpath("//span[contains(text(), 'Book a Demo')] | //android.view.View[@text='Book a Demo']"));
				click(item);
				waitTime(2000);
				driver.findElement(By.xpath("//input[@name='email'] | (//android.widget.TextView[@text='Your e-mail address']/../following-sibling::android.widget.EditText)[1]"));
				expt = true;
				break;
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
				expt = false;
			}
		}
		return expt;
	}

	// SOLUTIONS SECTION

	public boolean verifySolutionSectionIsVisible() {
		boolean expt = false;
		for(int i =0; i < 15; i++) {
			try {	
				WebElement item = driver.findElement(By.xpath("//div[contains(text(),'Solutions')] | //android.widget.TextView[@text='Solutions']"));
				expt = isElementDisplayed(item);
				break;
			} catch (Exception e) {
				scrollIntoViewSmoothlyLess();
			}
		}
		return expt;
	}
	


}