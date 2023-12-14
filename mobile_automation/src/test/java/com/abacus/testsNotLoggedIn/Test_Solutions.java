package com.abacus.testsNotLoggedIn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abacus.base.BaseClass;
import com.abacus.errorCollectors.ErrorCollector;
import com.abacus.testsNotLoggedInPages.Test_HomePage_Pages;
import com.abacus.testsNotLoggedInPages.Test_Solutions_Page;
import com.abacus.testsNotLoggedInPages.abacusForms;

public class Test_Solutions extends BaseClass{
	public String aIforItOpertions = "AI Agents";
	public String anomalyDetction = "Anomaly Detection";
	public String discreteOptimization = "Discrete Optimization";
	public String forcastingAndPlanning = "Forecasting and Planning";
	public String foundationModels = "Foundation Models";
	public String fraudAndSecurity = "Fraud and Security";
	public String marketingAndSales = "Marketing and Sales AI";
	public String naturalLanguaeProcessing = "Language AI";
	public String personalizationAi = "Personalization AI";
	public String predictiveModeling = "Predictive Modeling";
	public String visionAi = "Vision AI";
	public String chatllm = "Chat LLM";
	
	
	@Parameters("browser")
	@Test
	public void verifyUserIsAbleToOpenSolutionsFromNavBar(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		
		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");
		
		}
	
	
	@Parameters("browser")
	@Test (priority = 1)
	public void verifyUserIsAbleToSubmitRequestAccessFormInAnomalyDetctionWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(anomalyDetction);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Anomaly Detection.");


		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	
	@Parameters("browser")
	@Test(priority = 2)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInAnomalyDetction_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(anomalyDetction);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Anomaly Detection.");


		step++;
		waitTime(5000);
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
	
	
	
	@Parameters("browser")
	@Test (priority = 3)
	public void verifyUserIsAbleToSubmitRequestAccessFormInAIFotItOperationsWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(aIforItOpertions);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on AI Agents.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test(priority = 4)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInAIFotItOperations_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(aIforItOpertions);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on AI Agents.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test (priority = 5)
	public void verifyUserIsAbleToSubmitRequestAccessFormInDiscreteOptimizationWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(discreteOptimization);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Discrete Optimization.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test(priority = 6)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInDiscreteOptimization_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(discreteOptimization);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Discrete Optimization.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test (priority = 7)
	public void verifyUserIsAbleToSubmitRequestAccessFormInForcastingAndPlanningWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(forcastingAndPlanning);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Forcasting And Planning.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test(priority = 8)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInForcastingAndPlanning_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(forcastingAndPlanning);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Forcasting And Planning.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test
	public void verifyUserIsAbleToSubmitRequestAccessFormInFoundationModelsWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(foundationModels);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Foundation Models.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInFoundationModels_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(foundationModels);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Foundation Models.");


		step++;
		waitTime(5000);
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
	
	
	
	@Parameters("browser")
	@Test
	public void verifyUserIsAbleToSubmitRequestAccessFormInFraudAndSecurityWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(fraudAndSecurity);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Fraud And Security.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInFraudAndSecurity_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(fraudAndSecurity);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Fraud And Security.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test
	public void verifyUserIsAbleToSubmitRequestAccessFormInMarketingAndSalesWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(marketingAndSales);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Marketing And Sales.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInMarketingAndSales_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(marketingAndSales);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Marketing And Sales.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test
	public void verifyUserIsAbleToSubmitRequestAccessFormInNaturalLanguaeProcessingWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(naturalLanguaeProcessing);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Language AI.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInNaturalLanguaeProcessing_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(naturalLanguaeProcessing);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Languae AI.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test (priority = 17)
	public void verifyUserIsAbleToSubmitRequestAccessFormInPersonalizationAiWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(personalizationAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Personalization AI.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

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

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test(priority = 18)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInPersonalizationAi_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(personalizationAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Personalization AI.");


		step++;
		waitTime(5000);
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
	
	
	@Parameters("browser")
	@Test (priority = 19)
	public void verifyUserIsAbleToSubmitRequestAccessFormInPredictiveModelingWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(predictiveModeling);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Predictive Modeling.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
//		homePage.clickRequestAccessButton();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");

		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");

		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");

		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");

		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test(priority = 20)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInPredictiveModeling_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(predictiveModeling);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Predictive Modeling.");


		step++;
		waitTime(5000);
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
	
	
	
	
	@Parameters("browser")
	@Test (priority = 21)
	public void verifyUserIsAbleToSubmitRequestAccessFormInvisionAiWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
	
		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");
	
	
		step++;
		solutions.clickonItemFromSoutionSection(visionAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Vision AI.");
	
		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
	//		homePage.clickRequestAccessButton();
	//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");
	
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in Request Access form: test"+email+"@abacus.ai.");
	
		step++;
		form.enterNameInForm("Test");
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered.");
	
		step++;
		form.enterOrganizationInForm("Abacus");
		;
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
		
		step++;
		form.clickContinueButtonInRequestForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
	
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test(priority = 22)
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInvisionAi_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(visionAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Vision AI.");


		step++;
		waitTime(5000);
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
	@Parameters("browser")
	@Test
	public void verifyUserIsAbleToSubmitRequestAccessFormChatLLMWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
	
		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");
	
	
		step++;
		solutions.clickonItemFromSoutionSection(chatllm);
		ErrorCollector.extentLogInfo("Step " + step + " : Chat LLM .");
	
		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button.");
		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button.");
	//		homePage.clickRequestAccessButton();
	//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button.");
	
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
	
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test
	public void verifyNonProfessionalOrAcademicEmailGivesErrorInchatllm_RequestAccess(String browser) throws InterruptedException{
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");

		step++;
		solutions.clickonItemFromSoutionSection(chatllm);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on ChaT LLM.");

		step++;
		waitTime(5000);
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
	
	
	
	@Parameters("browser")
	@Test (priority = 23)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_AnomalyDetction_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(anomalyDetction);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Anomaly Detection.");


		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
		
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_AnomalyDetction_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(anomalyDetction);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Anomaly Detection.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 24)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_AIAgents_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(aIforItOpertions);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on AI Agents.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");	

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_AIAgents_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(aIforItOpertions);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on AI Agents.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 25)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_DiscreteOptimization_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(discreteOptimization);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Discrete Optimization.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_DiscreteOptimization_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(discreteOptimization);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Discrete Optimization.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 26)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_ForcastingAndPlanning_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(forcastingAndPlanning);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Forcasting And Planning.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_ForcastingAndPlanning_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(forcastingAndPlanning);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Forcasting And Planning.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 27)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_FoundationModels_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(foundationModels);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Foundation Models.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_FoundationModels_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(foundationModels);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Foundation Models.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 28)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_FraudAndSecurity_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(fraudAndSecurity);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Fraud And Security.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_FraudAndSecurity_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(fraudAndSecurity);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Fraud And Security.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 29)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_MarketingAndSales_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(marketingAndSales);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Marketing And Sales.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_MarketingAndSales_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(marketingAndSales);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Marketing And Sales.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 30)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_NaturalLanguaeProcessing_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(naturalLanguaeProcessing);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Natural Language Processing.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_NaturalLanguaeProcessing_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(naturalLanguaeProcessing);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Natural Language Processing.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}

	@Parameters("browser")
	@Test (priority = 31)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_PersonalizationAi_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(personalizationAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Personalization AI.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_PersonalizationAi_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(personalizationAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Personalization AI.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 32)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_PredictiveModeling_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(predictiveModeling);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Predictive Modeling.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_PredictiveModeling_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(predictiveModeling);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Predictive Modeling.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test (priority = 33)
	public void verifyUserIsAbleToSubmitRequestConsultationFormIn_visionAi_WithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(visionAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Vision AI.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");


		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");
		

	}
	
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormIn_visionAi_WithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(visionAi);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Vision AI.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsAbleToSubmitRequestConsultationFormInChatLLMWithCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(chatllm);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Chat LLM.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@abacus.ai");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");


		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
				"Verified Success Message is visible");

	}
	@Parameters("browser")
	@Test 
	public void verifyUserIsNotAbleToSubmitRequestConsultationFormInChatLLMWithNonCorporateEmail(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_Solutions_Page solutions = new Test_Solutions_Page();
		abacusForms form = new abacusForms();
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();

		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Navigation Bar to expand menu.");
		
		step++;
		solutions.openSolutionsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Solutions to open.");


		step++;
		solutions.clickonItemFromSoutionSection(chatllm);
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Chat LLM.");

		step++;
		waitTime(5000);
		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
		
		
		step++;
		String email = randomStringAllSmall(5);
		form.enterEmailInForm("test"+email+"@gmail.com");
		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@gmail.com");

		
		step++;
		form.enterNameInConsultationForm("Test "+email);
		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");

		step++;
		form.enterOrganizationInConsultationForm("Abacus");
		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
		
		step++;
		form.enterRoleInConsultationForm("Software Engineer");
		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");

		step++;
		form.clickFinishInForm();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");

		waitTime(2000);		
		step++;
		ErrorCollector.extentLogInfo("Step " + step + " : Verify Error Message.");
		ErrorCollector.verifyEquals(form.getErrorMsgOnRequestConsultaionAlert(), "Please use a professional or academic email address.");


	}

}
