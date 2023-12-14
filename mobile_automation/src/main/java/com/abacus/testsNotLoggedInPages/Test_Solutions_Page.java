package com.abacus.testsNotLoggedInPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abacus.base.BaseClass;

public class Test_Solutions_Page extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(), 'SOLUTIONS')] | //android.view.View[@content-desc='SOLUTIONS']")
	public WebElement solutionsNavBar;
	
	
	public Test_Solutions_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void openSolutionsFromNavBar () {
		waitForElementVisibility(solutionsNavBar, defaultTimeForVisibility);
		click(solutionsNavBar);
			 
	}
	
	
	public void clickonItemFromSoutionSection(String option) {
		scrollToSpecificElementExactText(option);
		WebElement item = driver.findElement(By.xpath("//div[contains(text(), '" + option + "')] | //android.widget.TextView[@text='" + option + "']"));
		waitForElementVisibility(item, defaultTimeForVisibility);
		click(item);
	}
	

}
