package com.abacus.testsNotLoggedIn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abacus.base.BaseClass;
import com.abacus.errorCollectors.ErrorCollector;
import com.abacus.testsNotLoggedInPages.Test_HomePage_Pages;
import com.abacus.testsNotLoggedInPages.Test_MLOps_Page;
import com.abacus.testsNotLoggedInPages.abacusForms;

public class Test_MLOps extends BaseClass {
	public String realTimeMLFeatureStore = "Real Time ML Feature Store";
	public String vectorMatchingEngine = "Vector Matching Engine";
	public String driftObservabilityAndExplainability = "Drift, Observability and Explainability";
	public String modelHostingAndDataPipelines = "Model Hosting and Data Pipelines";
	public String humanAIChampionChallenger = "Human-AI Champion-Challenger";
	
	@Parameters("browser")
	@Test 
	
	public void verifyUserIsAbleToOpenMLOpsFromNavBar(String browser) throws InterruptedException {
		initReport();
		initConfiguration(browser);
		
		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
		Test_MLOps_Page Mlops = new Test_MLOps_Page();
		
		int step = 0;
		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
		
		step++;
		homePage.clickOnNavigationBarToExpand();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
		
		step++;
		Mlops.openMLOpsFromNavBar();
		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
		
		}
//	
//	@Parameters("browser")
//	@Test 
//	
//	public void verifyRequestAccessButtonIsVisibleOnMLOpsHomePage(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.verifyRequestAccessButtonVisible("Request Access");
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Request Access button is Visible.");
//		
//		
//		}
//	@Parameters("browser")
//	@Test 
//	
//	public void verifyScheduleFreeConsultaionButtonIsVisibleOnMLOpsHomePage(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.verifyScheduleFreeConsultaionVisible("Schedule Free Consultation");
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Schedule Free Consultation button is Visible.");
//		
//		}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestAccessFormInRealTimeMLFeatureStoreFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View in "+browser+".");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(realTimeMLFeatureStore);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Real Time Feature Store In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button In Real Time ML Features Store.");
//		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button In Real Time ML Features Store.");
//		//ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button In Real Time ML Features Store.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
//		
//		step++;
//		form.clickContinueButtonInRequestForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
//		waitTime(5000);
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
//				"Verified Success Message is visible");
////		
//	}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestAccessFormInVectorMachingEngineFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(vectorMatchingEngine);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Vector Machine Engine Store In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button In Vector Machine Engine.");
//		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button In Vector Machine Engine.");
//		//homePage.clickRequestAccessButton();
//		//ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button In Vector Machine Engine.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
//		
//		step++;
//		form.clickContinueButtonInRequestForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
//				"Verified Success Message is visible");
//		
//	}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestAccessFormInDriftObservabilityAndExplainabilityFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(driftObservabilityAndExplainability);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Drift Observability And Explainability In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button In Drift Observability And Explainability.");
//		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button In Drift Observability And Explainability.");
////		homePage.clickRequestAccessButton();
////		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button In Drift Observability And Explainability.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
//		
//		step++;
//		form.clickContinueButtonInRequestForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
//				"Verified Success Message is visible");
//		
//	}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestAccessFormInModelHostingAndDataPipelinesFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(modelHostingAndDataPipelines);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Model Hosting And Data Pipelines In MLOps.");
//		
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button In Model Hosting And Data Pipelines.");
//		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button In Model Hosting And Data Pipelines.");
////		homePage.clickRequestAccessButton();
////		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button Model Hosting And Data Pipelines.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//		step++;
//		form.enterNameInForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
//		
//		step++;
//		form.clickContinueButtonInRequestForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
//				"Verified Success Message is visible");
//		
//	}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestAccessFormInHumanAIChampionChallengerFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(humanAIChampionChallenger);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Human-AI Champion Challenger In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button In Human-AI Champion Challenger.");
//		ErrorCollector.verifyTrue(homePage.clickRequestAccessButton(), " Clicked on Request Access Button In Human-AI Champion Challenger.");
////		homePage.clickRequestAccessButton();
////		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button Human-AI Champion Challenger.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered.");
//		
//		step++;
//		form.clickContinueButtonInRequestForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Continue Button.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestAccessForm(),
//				"Verified Success Message is visible");
//		
//	}
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestConsultationFormInRealTimeMLFeatureStoreFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(realTimeMLFeatureStore);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Real Time Feature Store In MLOps.");
//		
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Real Time ML Features Store.");
//		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Real Time ML Features Store.");
//		
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInConsultationForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInConsultationForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
//		
//		step++;
//		form.enterRoleInConsultationForm("Software Engineer");
//		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");
//
//		step++;
//		form.clickFinishInForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
//				"Verified Success Message is visible");
////		
//	}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestConsultationFormInVectorMachingEngineFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(vectorMatchingEngine);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Vector Machine Engine Store In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Access Button In Vector Machine Engine.");
//		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Access Button In Vector Machine Engine.");
//		//homePage.clickRequestAccessButton();
//		//ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button In Vector Machine Engine.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInConsultationForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInConsultationForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus");
//		
//		step++;
//		form.enterRoleInConsultationForm("Software Engineer");
//		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");
//
//		step++;
//		form.clickFinishInForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
//				"Verified Success Message is visible");
//		
//	}
//
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestConsultationFormInDriftObservabilityAndExplainabilityFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(driftObservabilityAndExplainability);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Drift Observability And Explainability In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Drift Observability And Explainability.");
//		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Drift Observability And Explainability.");
//
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInConsultationForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInConsultationForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
//		
//		step++;
//		form.enterRoleInConsultationForm("Software Engineer");
//		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer");
//
//		step++;
//		form.clickFinishInForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
//				"Verified Success Message is visible");
//		
//	}
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestConsultationFormInModelHostingAndDataPipelinesFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(modelHostingAndDataPipelines);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Model Hosting And Data Pipelines In MLOps.");
//		
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Model Hosting And Data Pipelines.");
//		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Model Hosting And Data Pipelines.");
////		homePage.clickRequestAccessButton();
////		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Request Access Button Model Hosting And Data Pipelines.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//		step++;
//		form.enterNameInConsultationForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " :: Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInConsultationForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
//		
//		step++;
//		form.enterRoleInConsultationForm("Software Engineer");
//		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered: Software Engineer.");
//
//		step++;
//		form.clickFinishInForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
//				"Verified Success Message is visible");
//		
//	}
//	
//	
//	
//		@Parameters("browser")
//		@Test 
//		public void verifyBySubmittingRequestConsultationFormInHumanAIChampionChallengerFromMLOps(String browser) throws InterruptedException {
//		initReport();
//		initConfiguration(browser);
//		
//		abacusForms form = new abacusForms();
//		Test_HomePage_Pages homePage = new Test_HomePage_Pages();
//		Test_MLOps_Page Mlops = new Test_MLOps_Page();
//		
//		int step = 0;
//		ErrorCollector.extentLogInfo("Step " + step + " : Visit App in Mobile View.");
//		ErrorCollector.verifyTrue(visitBaseURL(), "Visited App in Mobile View.");
//		
//		step++;
//		homePage.clickOnNavigationBarToExpand();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on navigationBar to expand menu.");
//		
//		step++;
//		Mlops.openMLOpsFromNavBar();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on MLOps to open.");
//		
//		step++;
//		Mlops.clickonItemFromMLOpsSection(humanAIChampionChallenger);
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked on Human-AI Champion Challenger In MLOps.");
//		
//		step++;
//		waitTime(5000);
//		ErrorCollector.extentLogInfo("Step " + step + " : click on Request Consultation Button In Human-AI Champion Challenger.");
//		ErrorCollector.verifyTrue(homePage.clickRequestConsultationButton(), " Clicked on Request Consultation Button In Human-AI Champion Challenger.");
//		
//		step++;
//		String email = randomStringAllSmall(5);
//		form.enterEmailInForm("test"+email+"@abacus.ai");
//		ErrorCollector.extentLogInfo("Step " + step + " : Entered email in form: test"+email+"@abacus.ai.");
//
//
//		step++;
//		form.enterNameInConsultationForm("Test "+email);
//		ErrorCollector.extentLogInfo("Step " + step + " : Name Entered: Test "+email+".");
//
//		step++;
//		form.enterOrganizationInConsultationForm("Abacus");
//		ErrorCollector.extentLogInfo("Step " + step + " : Organization Entered: Abacus.");
//		
//		step++;
//		form.enterRoleInConsultationForm("Software Engineer");
//		ErrorCollector.extentLogInfo("Step " + step + " : Role Entered.");
//
//		step++;
//		form.clickFinishInForm();
//		ErrorCollector.extentLogInfo("Step " + step + " : Clicked Finish in Form.");
//
//
//		step++;
//		ErrorCollector.extentLogInfo("Step " + step + " : Verify Success Message is visible.");
//		ErrorCollector.verifyTrue(form.succesMessageVisibleInRequestConsultationForm(),
//				"Verified Success Message is visible");
//		
//	}

}
