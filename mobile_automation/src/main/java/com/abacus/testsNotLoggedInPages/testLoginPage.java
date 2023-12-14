package com.abacus.testsNotLoggedInPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abacus.base.BaseClass;
import com.abacus.utilities.Waits;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class testLoginPage extends BaseClass {

	@FindBy(xpath = "//android.widget.Image[@text='hamb']")
	WebElement hambIcon;


	public testLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnHambIcon() {
		click(hambIcon);
	}


}
