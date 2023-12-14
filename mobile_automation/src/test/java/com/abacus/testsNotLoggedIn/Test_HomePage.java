package com.abacus.testsNotLoggedIn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abacus.base.BaseClass;
import com.abacus.errorCollectors.ErrorCollector;
import com.abacus.testsNotLoggedInPages.Test_HomePage_Pages;
import com.abacus.testsNotLoggedInPages.abacusForms;

public class Test_HomePage extends BaseClass {
	
	public String scrolledDowntoRequestAccess = "With Abacus.ai you can access";
	
	
//	@Parameters("browser")
//	@Test(priority = 6)
//	public void requestAccessByFillingForm(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		abacusForms form = new abacusForms();
//
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Request Access Button is Visible.");
//		ErrorCollector.verifyTrue(homePage.verifyRequestAccessButtonIsVisible(),
//				"Verified Request Access Button is Visible.");
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
//		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");
//		
//		
//		step++;
//		form.enterNameInForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");
//
//		step++;
//		form.enterOrganizationInForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
//
//		
//		step++;
//		form.clickContinueButtonInRequestForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
//				"Verified Success Message is visible");
//
//	}
	
	@Parameters("browser")
	@Test(priority = 1)
	public void VerifyLogo(String browser) throws InterruptedException {

		initReport();
		initConfiguration(browser);
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Logo is Displayig.");
		ErrorCollector.verifyTrue(homePage.verifyAbacusLogoIsDisplayed(), "Verified Abacus Logo is displaying.");
	}

	@Parameters("browser")
	@Test()
	public void verifyNavigationBarIsClickable(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify NavigationBar is Visible.");
		ErrorCollector.verifyTrue(homePage.verifyNavigationBarIsVisible(), "Verified NavigationBar is Visible.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify NavigationBar is Clickable.");
		ErrorCollector.verifyTrue(homePage.verifyNavigationBarIsClickable(), "Verified NavigationBar is Clickable.");
	}
	
	@Parameters("browser")
	@Test
	public void verifyRequestAccessButtonIsCickable(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Request Access Button is Visible.");
		ErrorCollector.verifyTrue(homePage.verifyRequestAccessButtonIsVisible(),
				"Verified Request Access Button is Visible.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Request Access Button is Clickable.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(),
				"Verified Request Access Button is Clickable.");
	}

	@Parameters("browser")
	@Test
	public void verifyBookADemoButtonIsClickable(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Book A Demo Button is Visible.");
		ErrorCollector.verifyTrue(homePage.verifyBookADemonIsVisible(),
				"Verified Request Consultation Button is Visible.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Book A Demon Button is Clickable.");
		ErrorCollector.verifyTrue(homePage.clickBookADemo(),
				"Verified Book A Demo Button is Clickable.");
	}

	@Parameters("browser")
	@Test
	public void verifyBookADemoByFillingForm(String browser) throws InterruptedException  {
		initReport();
		initConfiguration(browser);
		
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Click on Book A Demo Button.");
		ErrorCollector.verifyTrue(homePage.clickBookADemo(), "Clicked on Book A Demo Button.");

		step++;
		waitTime(3000);
		form.enterEmailInForm("test@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Book A Demo form: test@abacus.ai.");

		step++;
		form.enterNameInConsultationForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");

		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Book A Demo Form.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible.");
	}

	@Parameters("browser")
	@Test(priority = 8)
	public void requestAccessFormFromNavigationBar(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify NavigationBar is Visible.");
		ErrorCollector.verifyTrue(homePage.verifyNavigationBarIsVisible(), "Verified NavigationBar is Visible.");

		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");

		step++;
		homePage.clickRequestAccessButtonInNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");

		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
		waitTime(5000);

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");

	}
	@Parameters("browser")
	@Test
	public void solutionsVisibleOnHomePage(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify NavigationBar is Visible.");
		ErrorCollector.verifyTrue(homePage.verifySolutionSectionIsVisible(), "Verified NavigationBar is Visible.");
		waitTime(5000);

	}
	
	@Parameters("browser")
	@Test(priority = 9)
	public void verifyNonProfessionalOrAcademicEmailGivesError(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View in "+browser+".");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Request Access Button is Visible.");
		ErrorCollector.verifyTrue(homePage.verifyRequestAccessButtonIsVisible(),
				"Verified Request Access Button is Visible.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@gmail.com.");

		step++;
		form.enterNameInForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");

		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
		
		waitTime(5000);
		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnAlert(), "Error: Email must be from a corporate email account.");

	}
	
}
