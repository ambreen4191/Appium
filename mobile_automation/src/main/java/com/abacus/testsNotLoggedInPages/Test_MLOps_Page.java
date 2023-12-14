package com.abacus.testsNotLoggedInPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abacus.base.BaseClass;

public class Test_MLOps_Page extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(), 'MLO')] | //android.view.View[@content-desc='MLOps']")
	public WebElement mlopsNavBar;
	
	
	
	public void clickonItemFromMLOpsSection(String option) {
		scrollToSpecificElementExactText(option);
		WebElement item = driver.findElement(By.xpath("//div[contains(text(), '" + option + "')] | //android.widget.TextView[@text='" + option + "']"));
		waitForElementVisibility(item, defaultTimeForVisibility);
		click(item);
	}
	
	public Test_MLOps_Page() {
		PageFactory.initElements(driver, this);
	}
		
	public void openMLOpsFromNavBar () {
		waitForElementVisibility(mlopsNavBar, 5);
		click(mlopsNavBar);
			 
	}	
	public void verifyRequestAccessButtonVisible(String option) {
		scrollToSpecificElementExactText(option);
		WebElement item = driver.findElement(By.xpath("(//span[contains(text(), '" + option + "')])[1] | //android.widget.TextView[@text='" + option + "']"));
		waitForElementVisibility(item, defaultTimeForVisibility);
	
}
	public void verifyScheduleFreeConsultaionVisible(String option) {
		scrollToSpecificElementExactText(option);
		WebElement item = driver.findElement(By.xpath("(//span[contains(text(), '" + option + "')])[1] | //android.widget.TextView[@text='" + option + "']"));
		waitForElementVisibility(item, defaultTimeForVisibility);
//		click(item);
	}
}
