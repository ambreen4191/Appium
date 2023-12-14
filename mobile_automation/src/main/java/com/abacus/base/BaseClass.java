package com.abacus.base;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileBy;

import io.appium.java_client.MobileDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;

import com.abacus.utilities.Utilities;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.abacus.listeners.ExtentListeners;
import com.abacus.utilities.ExcelReader;
import com.abacus.utilities.Waits;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BaseClass {
	public static boolean closeDriver = false;
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static String browser;
	public static String env;
	public static FileInputStream fis;
	public static ExtentTest extentReport;
	public static SoftAssert softAssert;
	public static Integer waitInSeconds = 5;

	// This is the default path to data package
	public static String excelFilePath = System.getProperty("user.dir") + "/src/test/resources/data/";

	// This is the default path to imageUpload
	public static String imagePath = System.getProperty("user.dir") + "/src/test/resources/data/Images/";

	// This is excel file name
	public static final String potentialClientExcel = "potentialClientTestData";
	// This is column name from which we need to get row
	public static final String colName = "env";
	// This is row index of environment column from which we need to get data
	public static int rowIndex = 0;
	// Excel file name
	public static final String testDataFile = "testData";
	// Excel sheetname
	public static final String testDataSheet = "TestData";
	public static final String KYC_NonAdaarReg = "KYC_NonAdaarReg";
	public static final String KYC_OtherNRI_Reg = "KYC_OtherNRI_Reg";

	// Test Suite Runner File Name
	public static final String testSuiteRunnerFileName = "SuiteTests_Android";
	// Test Suite Runner Sheet Name
	public static final String testSuiteRunnerSheetName = "Tests";

//	public static final boolean runOnLocal = true;
	public static final String api_base_url = "";
	public static final String base_url = "https://abacus.ai";
	public static final String base_url_Pre_Prod = "https://preprod.abacus.ai";
	public static final String deviceName = "Google Pixel 5";
	public static final String BuildNumber = "5.49";
	public static String browserStackJobStatus;
	public static String mobileBrowser = "";

	public static final int defaultTimeForVisibility = 30;
	public static final int defaultTimeTOBeClickable = 30;
	public static URL url;
	public static DesiredCapabilities capabilities;

//	public static AndroidDriver<WebElement> driver;

	public static boolean runOnLocal = true;

	public static void initReport() {
		extentReport = ExtentListeners.testReport.get();
		softAssert = new SoftAssert();
	}
	
	public static void initConfiguration(String browser) {

		String osName = System.getProperty("os.name");
		if (osName.contains("Windows")) {
			excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";
			imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";
		} else {
			excelFilePath = System.getProperty("user.dir") + "/src/test/resources/data/";
			imagePath = System.getProperty("user.dir") + "/src/test/resources/images/";
		}
		System.out.println("OS : " + osName);
		System.out.println("User Dir : " + System.getProperty("user.dir"));
		System.out.println("excelFilePath  : " + excelFilePath);
		System.out.println("imagePath   : " + imagePath);
		extentReport = ExtentListeners.testReport.get();
		softAssert = new SoftAssert();

		System.out.println("OS : " + System.getProperty("os.name"));
		System.out.println("User Dir : " + System.getProperty("user.dir"));
		if (System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {
			browser = System.getenv("browser");
			System.out.println("Browser: " + browser);
		} else {
			browser = PropertiesReader.getPropertyValue("browser");
		}
		if (System.getenv("env") != null && !System.getenv("env").isEmpty()) {
			env = System.getenv("env");
			System.out.println("Env: " + env);
		} else {
			env = PropertiesReader.getPropertyValue("env");
		}
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			prefs.put("useAutomationExtension", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			String agentString = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36";
			options.addArguments("window-size=352,814");
			options.addArguments("--user-agent=" + agentString);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			//options.addArguments("--headless");
			options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
			options.addArguments("--disable-gpu");
			//options.addArguments("enable-automation");
			options.addArguments("--dns-prefetch-disable");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--disable-blink-features=AutomationControlled");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			try {
				driver = new ChromeDriver(options);
//				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(9000,TimeUnit.NANOSECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

//	public static void initConfiguration() {
//		env = PropertiesReader.getPropertyValue("env");
//		try {
//
//			if (extentReport == null) {
//				initReport();
//			}
//
//			if (runOnLocal) {
//				if(mobileBrowser == "edge") {
//					
////					String buildPath = System.getProperty("user.dir")
////							+ "/src/test/resources/executables/app-staging-release.apk";
//
//					final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
//					
//					url = new URL(URL_STRING);
//					capabilities = new DesiredCapabilities();
//					capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CR90KLM5L");
//					capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
//					capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
//					capabilities.setCapability("noReset", "true");
//					capabilities.setCapability("fullReset", "false");
//					capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 12000);
////					capabilities.setCapability(MobileCapabilityType.APP, buildPath);
////					capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//					capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.microsoft.emmx");
//					capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.microsoft.ruby.Main");
//					capabilities.setCapability("ignoreUnimportantViews", true);
//					capabilities.setCapability("disableAndroidWatchers", true);
//					capabilities.setCapability("automationName", "uiautomator2");
//					capabilities.setCapability("autoGrantPermissions", "true");
//					driver = new AndroidDriver<WebElement>(url, capabilities);
//					
//				}else if(mobileBrowser == "chrome") {
////					String buildPath = System.getProperty("user.dir")
////							+ "/src/test/resources/executables/app-staging-release.apk";
//
//					final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
//					
//					url = new URL(URL_STRING);
//					capabilities = new DesiredCapabilities();
//					capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CR90KLM5L");
//					capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
//					capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
//					capabilities.setCapability("noReset", "true");
//					capabilities.setCapability("fullReset", "false");
//					capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 12000);
////					capabilities.setCapability(MobileCapabilityType.APP, buildPath);
//					capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
////					capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.microsoft.emmx");
////					capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.microsoft.ruby.Main");
//					capabilities.setCapability("ignoreUnimportantViews", true);
//					capabilities.setCapability("disableAndroidWatchers", true);
//					capabilities.setCapability("automationName", "uiautomator2");
//					capabilities.setCapability("autoGrantPermissions", "true");
//					driver = new AndroidDriver<WebElement>(url, capabilities);
//				}
//
////				
//			} else {
//				
//			}
//
//			driver.manage().timeouts().implicitlyWait(
//					Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")), TimeUnit.SECONDS);
//		} catch (Exception e) {
//			System.out.println("Cause: " + e.getCause());
//			System.out.println("Message: " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("Application Started");
//	}
//
//	public static void initConfiguration(String browser) {
//		WebDriver localD = null;
//		mobileBrowser = browser;
//		System.out.println("Running on browser: "+browser);
//		try {
//
//			if (extentReport == null) {
//				initReport();
//			}
//
//			if (runOnLocal) {
//				if(mobileBrowser.equals("edge")) {
//					
////					String buildPath = System.getProperty("user.dir")
////							+ "/src/test/resources/executables/app-staging-release.apk";
//
//					final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
//					
//					url = new URL(URL_STRING);
//					capabilities = new DesiredCapabilities();
//					capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CR90KLM5L");
//					capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
//					capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
//					capabilities.setCapability("noReset", "true");
//					capabilities.setCapability("fullReset", "false");
//					capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 12000);
////					capabilities.setCapability(MobileCapabilityType.APP, buildPath);
////					capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//					capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.microsoft.emmx");
//					capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.microsoft.ruby.Main");
//					capabilities.setCapability("ignoreUnimportantViews", true);
//					capabilities.setCapability("disableAndroidWatchers", true);
//					capabilities.setCapability("automationName", "uiautomator2");
//					capabilities.setCapability("autoGrantPermissions", "true");
//					driver = new AndroidDriver<WebElement>(url, capabilities);
//					
////				}else if(mobileBrowser.equals("chrome")) {
//////					String buildPath = System.getProperty("user.dir")
//////							+ "/src/test/resources/executables/app-staging-release.apk";
////
////					final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
////					
////					url = new URL(URL_STRING);
////					capabilities = new DesiredCapabilities();
////					capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R5CR90KLM5L");
////					capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
////					capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
//////					capabilities.setCapability("noReset", "true");
//////					capabilities.setCapability("fullReset", "false");
////					capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 12000);
//////					capabilities.setCapability(MobileCapabilityType.APP, buildPath);
////					capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//////					capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.microsoft.emmx");
//////					capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.microsoft.ruby.Main");
////					capabilities.setCapability("ignoreUnimportantViews", true);
////					capabilities.setCapability("disableAndroidWatchers", true);
////					capabilities.setCapability("automationName", "uiautomator2");
////					capabilities.setCapability("autoGrantPermissions", "true");
////					driver = new AndroidDriver<WebElement>(url, capabilities);
//				}else if (browser.equals("chrome")) {
//					//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator +"src"+ File.separator +"test"+ File.separator+ "resources" + File.separator+ "executables" + File.separator+"chromedriver.exe");
//					WebDriverManager.chromedriver().setup();
//					Map<String, Object> prefs = new HashMap<String, Object>();
//					prefs.put("profile.default_content_setting_values.notifications", 2);
//					prefs.put("credentials_enable_service", false);
//					prefs.put("profile.password_manager_enabled", false);
//					ChromeOptions options = new ChromeOptions();
//					options.setExperimentalOption("prefs", prefs);
//					String agentString = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36";
//					options.addArguments("--user-agent=" + agentString);
//					options.addArguments("window-size=1920,1080");
//					//options.addArguments("--disable-gpu");
//					//options.addArguments("--headless");
//					try {
//						localD = new ChromeDriver(options);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//					
//				} 
//				else {
//					System.out.println("Hellow from Else Browser : "+browser);
//				}
//
////				
//			} else {
//				
//			}
//
//			driver.manage().timeouts().implicitlyWait(
//					Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")), TimeUnit.SECONDS);
//		} catch (Exception e) {
//			System.out.println("Cause: " + e.getCause());
//			System.out.println("Message: " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("Application Started");
//	}
//	
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public void pressBack() {
		driver.navigate().back();
	}

//	public static AndroidDriver<WebElement> getDriver() {
//		return driver_2;
//	}
	/*
	 * MethodName : printString Description : This method will print given message
	 * on console, It'll accept String value to be printed on console. Purpose :
	 * BaseClass is accessable to every TestClass. Hence shorter way to print
	 * message. Parameters : String message (Message to be print on console)
	 */
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void printString(String message) {
		try {
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean visitBaseURL() {
		env = PropertiesReader.getPropertyValue("env");
		System.err.println(env);
		String url = PropertiesReader.getPropertyValue(env+"_AppURL");
		try {
			driver.get(url);
			driver.navigate().refresh();
			return true;
		} catch (Exception e) {
			e.getStackTrace();
			return false;
		}
	}
	 public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return text;
	 }
	
	
//	public boolean visitBaseURLPreProd() {
//		try {
//			driver.get(base_url_Pre_Prod);
//			return true;
//		} catch (Exception e) {
//			e.getStackTrace();
//			return false;
//		}
//	}
	
	public boolean scrollToElementMobileView(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    try{
		    	try{
		            js.executeScript("arguments[0].scrollIntoView(true);",element);
		            return true;
		        }catch(Exception f) {
		        	f.printStackTrace();
		        	return false;
		        }
		        
		    }catch(Exception e){
		    	int x = element.getLocation().getX();
		        int y = element.getLocation().getY();
		        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
		        return true;
		    }   

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void waitForElementToBePresent(WebElement locator, int timeOutInSeconds) {

		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void waitForElementsToBePresent(List<WebElement> locator, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElements(locator));
	}

	public void waitForElementToBeClickable(WebElement by, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public boolean isElementClickable(WebElement by, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public AndroidElement waitForElementToBePresent(By locator, int timeOutInSeconds) {

		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		return (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void clickElement(AndroidElement element, String elementLabel) {
		// ExtentTestManager.getTest().info("Clicking " + elementLabel);
		element.click();
	}

	public void clickWebElement(WebElement element) {
		element.click();
	}

	public AndroidElement findElement(By locator) {
		return (AndroidElement) getDriver().findElement(locator);

	}

	public void sendKeysToElement(AndroidElement element, String keys, String elementLabel) {
		// ExtentTestManager.getTest().info("Entering "+ elementLabel + ": " + keys);
		element.sendKeys(keys);
	}

	public void sendKeysToWebElement(WebElement element, String keys, String elementLabel) {
		// ExtentTestManager.getTest().info("Entering "+ elementLabel + ": " + keys);
		element.clear();
		element.sendKeys(keys);
		Waits.wait1s();

	}

	public void sendKeysToWebElement(WebElement element, double keys, String elementLabel) {
		// ExtentTestManager.getTest().info("Entering "+ elementLabel + ": " + keys);
		element.clear();
		element.sendKeys(String.valueOf(keys));
		Waits.wait1s();

	}
	 public String getCurrentUrl () {
		 String url = driver.getCurrentUrl();
		 return url;
	 }

	public String getElementText(WebElement element) {
		return element.getText();
	}

	public String getWebElementText(WebElement element, String elementLabel) {
		// ExtentTestManager.getTest().info("Getting "+elementLabel+ " Text" );
		return element.getText();
	}

	public boolean isElementClickable(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementSelected(WebElement element) {
		boolean isSelected = element.isSelected();
		return isSelected;
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scroll", scrollObject);
	}

	public void swipeUpSlightly() {
		new TouchAction((PerformsTouchActions) getDriver()).press(PointOption.point(550, 330)).waitAction()
				.moveTo(PointOption.point(550, 60)).release().perform();
	}

	public void swipeUpSlightlyWithUiAutomator() {
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()");
	}

	public void swipeUp() {
//		// ExtentTestManager.getTest().info("Swiping screen");
//		TouchAction action = new TouchAction(getDriver());
//		PointOption p1 = new PointOption();
//		Dimension dimensions = getDriver().manage().window().getSize();
//		Double screenHeightStart = dimensions.getHeight() * 0.55;
//		Double screenWidth = dimensions.getWidth() * .5;
//		int width = screenWidth.intValue();
//		int h1 = screenHeightStart.intValue();
//		Double screenHeightEnd = dimensions.getHeight() * 0.2;
//		int h2 = screenHeightEnd.intValue();
////		action.press(PointOption.point(width,h1))
////				.waitAction()
////				.moveTo(PointOption.point(width, h2))
////				.release()
////				.perform();
//
//		// new
//		// TouchAction((PerformsTouchActions)getDriver()).press(PointOption.point(width,h1)).waitAction().moveTo(PointOption.point(width,
//		// h2)).release().perform();
		try {
//			driver.findElementByAndroidUIAutomator(
//					"new UiScrollable(new UiSelector().scrollable(true)).flingForward()");
		} catch (Exception e) {
		}
	}

	public void scrollUp() {
//		// ExtentTestManager.getTest().info("Swiping screen");
//		TouchAction action = new TouchAction(getDriver());
//		PointOption p1 = new PointOption();
//		Dimension dimensions = getDriver().manage().window().getSize();
//		Double screenHeightStart = dimensions.getHeight() * 0.55;
//		Double screenWidth = dimensions.getWidth() * .5;
//		int width = screenWidth.intValue();
//		int h1 = screenHeightStart.intValue();
//		Double screenHeightEnd = dimensions.getHeight() * 0.2;
//		int h2 = screenHeightEnd.intValue();
//		action.press(PointOption.point(width, h1)).waitAction().moveTo(PointOption.point(width, h2)).release()
//				.perform();
	}

	public void scrollDown() {
//		// ExtentTestManager.getTest().info("Swiping screen");
//		TouchAction action = new TouchAction(getDriver());
//		PointOption p1 = new PointOption();
//		Dimension dimensions = getDriver().manage().window().getSize();
//		Double screenHeightStart = dimensions.getHeight() * 1.0;
//		Double screenWidth = dimensions.getWidth() * .5;
//		int width = screenWidth.intValue();
//		int h1 = screenHeightStart.intValue();
//		Double screenHeightEnd = dimensions.getHeight() * 0.55;
//		int h2 = screenHeightEnd.intValue();
//		action.press(PointOption.point(width, h1)).waitAction().moveTo(PointOption.point(width, h2)).release()
//				.perform();
	}

	public void scrollIntoViewSmoothly(WebElement Element) {
		Dimension dimension = getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.5);
		int scrollEnd = (int) (dimension.getHeight() * 0.2);

		new TouchAction((PerformsTouchActions) getDriver()).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}

	public void scrollIntoViewSmoothlyFullScreen() {
		Dimension dimension = getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.63);
		int scrollEnd = (int) (dimension.getHeight() * 0.2);

		new TouchAction((PerformsTouchActions) getDriver()).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}
	
	public void scrollIntoViewSmoothlyLess() {
		Dimension dimension = getDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * 0.40);
		int scrollEnd = (int) (dimension.getHeight() * 0.20);

		new TouchAction((PerformsTouchActions) getDriver()).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}
	
	
	public String randomStringAllSmall(int len) {
		String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public String randomString(int len) {
		String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public String randomNumberString(int len) {
		String AB = "123456789";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public void longPress(AndroidElement ele, String elementLabel) {
//		// ExtentTestManager.getTest().info("Long press "+elementLabel );
//		Duration d1 = Duration.between(LocalTime.MAX, LocalTime.NOON);
//		new TouchAction(getDriver())
//				.longPress(new LongPressOptions().withElement(ElementOption.element(ele)).withDuration(d1)).release()
//				.perform();
	}

	public boolean isElementPresent(WebElement element, String elementLabel) {
		// ExtentTestManager.getTest().info("Checking " + elementLabel + " is present");
		try {
			waitForElementToBePresent(element, 30);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementPresent(WebElement element, String elementLabel, int timeOutInSeconds) {
		// ExtentTestManager.getTest().info("Checking " + elementLabel + " is present");
		try {
			waitForElementToBePresent(element, timeOutInSeconds);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void appRunInBackGround() {
////		////ExtentTestManager.getTest().info("Minimizing application");
//		getDriver().runAppInBackground(Duration.ofSeconds(1));
//		// ExtentTestManager.getTest().info("Re-opening application");
	}

	public void killApplication() {
//		//ExtentTestManager.getTest().info("closing application");
//		getDriver().closeApp();
//		getDriver().quit();
	}

	public void launchApplication() {
//		getDriver().launchApp();
	}

	public void swipeScreen(String dir) {

		final int ANIMATION_TIME = 200;
		final int PRESS_TIME = 200;
		int edgeBorder = 10;

		PointOption pointOptionStart, pointOptionEnd;

		Dimension dims = getDriver().manage().window().getSize();
		pointOptionStart = point(dims.width / 2, dims.height / 2);

		switch (dir.toLowerCase()) {
		case "down":
			pointOptionEnd = point(dims.width / 2, dims.height - edgeBorder);
			break;
		case "up":
			pointOptionEnd = point(dims.width / 2, edgeBorder);
			break;
		case "left":
			pointOptionEnd = point(edgeBorder, dims.height / 2);
			break;
		case "right":
			pointOptionEnd = point(dims.width - edgeBorder, dims.height / 2);
			break;
		default:
			throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
		}

		try {
			new TouchAction((PerformsTouchActions) getDriver()).press(pointOptionStart)
					.waitAction(waitOptions(ofMillis(PRESS_TIME))).moveTo(pointOptionEnd).release().perform();
		} catch (Exception e) {
			System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
			return;
		}

		try {
			Thread.sleep(ANIMATION_TIME);
		} catch (InterruptedException e) {

		}
	}

	public void swipeByElements(AndroidElement startElement, AndroidElement endElement) {
		int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
		int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
		int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
		int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
		new TouchAction((PerformsTouchActions) getDriver()).press(point(startX, startY))
				.waitAction(waitOptions(ofMillis(1000))).moveTo(point(endX, endY)).release().perform();

	}

	public void goBack(int numberOfTimes) {

		for (int i = 0; i < numberOfTimes; i++) {

//			getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
//			Waits.wait1s();

		}
	}

	public static String getUniqueEmailId(String value) {

		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyHmm");
		Date date = new Date();
		String unique = formatter.format(date).toString();
		String uniqueEmailId = value + unique + "@codeautomation.ai";
		return uniqueEmailId;
	}

	public static String getUniquePassword() {
		SimpleDateFormat formatter = new SimpleDateFormat("mmss");
		Date date = new Date();
		String unique = formatter.format(date).toString();
		String passString = "Pass" + unique + "#";
		return passString;
	}

	public Object[][] getData(String filename, String SheetName) {

		ExcelReader excel = new ExcelReader(excelFilePath + filename + ".xlsx");
		int rows = excel.getRowCount(SheetName);
		int columns = excel.getColumnCount(SheetName);

		Object[][] data = new Object[rows - 1][columns];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < columns; colNum++) {

				data[rowNum - 2][colNum] = excel.getCellData(SheetName, colNum, rowNum);
			}
		}
		return data;
	}

	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void scrollToText(String text) {
		String str1 = "new UiScrollable(new UiSelector().scrollable(true).";
		String str2 = "instance(0)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))";
		String user_scroll = str1.concat(str2);
//		getDriver().findElementByAndroidUIAutomator(user_scroll);
//		getDriver().findElementByAndroidUIAutomator(user_scroll);
	}

	public void scrollTo(String selector) {
		String selectorString = String.format(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + selector + ")");
		getDriver().findElement(MobileBy.AndroidUIAutomator(selectorString));
	}

	public void scrollHorizontalList(String text) {
		MobileElement element = (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()"
						+ ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
	}

	public void scrollToTextContains(String text) {
		String str1 = "new UiScrollable(new UiSelector().scrollable(true).";
		String str2 = "instance(0)).scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0))";
		String user_scroll = str1.concat(str2);
//		getDriver().findElementByAndroidUIAutomator(user_scroll);
	}

	public static void waitForElementVisibility(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementInvisibility(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void click(WebElement element) {
		waitForElementVisibility(element, defaultTimeForVisibility);
		waitForElementToBeClickable(element, defaultTimeTOBeClickable);
		element.click();
	}

	public void sendKeysToWebElement(WebElement element, String keys) {
		// waitForElementVisibility(element, defaultTimeForVisibility);
		// waitForElementToBeClickable(element, defaultTimeTOBeClickable);
		element.clear();
		element.sendKeys(keys);
		Waits.wait1s();

	}
	public boolean scrollToSpecificElementExactText(String option){
		for(int i=0; i<15; i++) {
			try {
				WebElement item = driver.findElement(By.xpath("//div[contains(text(), '" + option + "')] | //android.widget.TextView[@text='" + option + "']"));
				return true;
			}
			catch (Exception e) {
				scrollIntoViewSmoothlyLess();
				// TODO: handle exception
			}
			
		}
		return false;
	}

	public static String generateRandomNumberWithGivenNumberOfDigits(int number) {
		String randomNumber = "123456789";
		StringBuilder sb = new StringBuilder(number);
		for (int i = 0; i < number; i++) {
			int index = (int) (randomNumber.length() * Math.random());
			sb.append(randomNumber.charAt(index));
		}
		return sb.toString();
	}

	public Object[][] getSuiteTests(String filename, String SheetName) {

		ExcelReader excel = new ExcelReader(
				System.getProperty("user.dir") + "/src/test/resources/data/" + filename + ".xlsm");
		int rows = excel.getRowCount(SheetName);
		int columns = excel.getColumnCount(SheetName);

		Object[][] data = new Object[rows - 1][columns];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < columns; colNum++) {

				data[rowNum - 2][colNum] = excel.getCellData(SheetName, colNum, rowNum);
			}
		}
		return data;
	}

	public void updateTestData(String filename, String sheetName, String testName, String status) {

		ExcelReader excel = new ExcelReader(
				System.getProperty("user.dir") + "/src/test/resources/data/" + filename + ".xlsm");
		Object[][] data = getSuiteTests(filename, sheetName);
		int rowNum = -1;
		for (int x = 0; x < data.length; x++) {
			if (data[x][1].toString().equals(testName)) {
				rowNum = x + 2;
			}
		}
		printString("Updated Test Result: " + excel.setCellData(sheetName, "Status", rowNum, status));
	}

	public String randomNumber(int len) {
		String AB = "0123456789";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public static String getDate(int days, String Format, String Time_Zone) throws ParseException {

		DateFormat dateFormat = new SimpleDateFormat(Format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
		Date date = new Date();
		String DF = dateFormat.format(date);

		Calendar c = Calendar.getInstance();
		c.setTime(dateFormat.parse(DF));
		c.add(Calendar.DATE, days);
		String formattedDate = dateFormat.format(c.getTime());

		printString("date : " + formattedDate);
		return formattedDate;

	}

	public static ArrayList<String> getDateList(int maxdays, String Format, String Time_Zone) throws ParseException {
		ArrayList<String> dates = new ArrayList<>();
		for (int i = 0; i <= maxdays; i++) {
			DateFormat dateFormat = new SimpleDateFormat(Format);
			dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
			Date date = new Date();
			String DF = dateFormat.format(date);
			Calendar c = Calendar.getInstance();
			c.setTime(dateFormat.parse(DF));
			c.add(Calendar.DATE, i);
			String formattedDate = dateFormat.format(c.getTime());
			dates.add(formattedDate);
		}
		return dates;
	}

	public void swipeUpLess() {
		// ExtentTestManager.getTest().info("Swiping screen");
//		TouchAction action = new TouchAction(getDriver());
//		PointOption p1 = new PointOption();
//		Dimension dimensions = getDriver().manage().window().getSize();
//		Double screenHeightStart = dimensions.getHeight() * 0.55;
//		Double screenWidth = dimensions.getWidth() * .5;
//		int width = screenWidth.intValue();
//		int h1 = screenHeightStart.intValue();
//		Double screenHeightEnd = dimensions.getHeight() * 0.2;
//		int h2 = screenHeightEnd.intValue();
//		action.press(PointOption.point(width, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(1100)))
//				.moveTo(PointOption.point(width, h2)).release().perform();
//		// new
//		// TouchAction((PerformsTouchActions)getDriver()).press(PointOption.point(width,h1)).waitAction().moveTo(PointOption.point(width,
//		// h2)).release().perform();
//		try {
//			driver.findElementByAndroidUIAutomator(
//					"new UiScrollable(new UiSelector().scrollable(true)).flingForward()");
//		} catch (Exception e) {
//		}
	}

	public void updateData(String filename, String sheetName, String status) {
		XSSFWorkbook wb = null;
		XSSFSheet sh = null;
		File file = new File(System.getProperty("user.dir") + "/src/test/resources/data/" + filename + ".xlsx");
		try {

//			ExcelReader excel = new ExcelReader(
//					System.getProperty("user.dir") + "/src/test/resources/data/" + filename +".xlsx");
////			Object[][] data = getSuiteTests(filename, sheetName);
////			int rowNum = -1;
//			printString("Updated Test Result: " + excel.setCellData(sheetName, "NewUserPassword", 0, status));

			FileInputStream file_2 = new FileInputStream(file);
			wb = new XSSFWorkbook(file_2);
			sh = wb.getSheetAt(0);
			sh.getRow(1).createCell(26).setCellValue(status);

			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getSortedList(ArrayList<String> symbol) {
		Collections.sort(symbol);
		return symbol;
	}

	public ArrayList<Double> getSortedDoubleList(ArrayList<Double> symbol) {
		Collections.sort(symbol);
		return symbol;
	}

	public void scrollToTop() {
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward()");
	}

	public void waitfor3Sec() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void swipeDown() {
//        ExtentTestManager.getTest().info("Swiping screen");
//		TouchAction action = new TouchAction(getDriver());
//		PointOption p1 = new PointOption();
//		Dimension dimensions = getDriver().manage().window().getSize();
//		Double screenHeightStart = dimensions.getHeight() * 0.5;
//		Double screenWidth = dimensions.getWidth() * .5;
//		int width = screenWidth.intValue();
//		int h1 = screenHeightStart.intValue();
//		Double screenHeightEnd = dimensions.getHeight() * 0.99;
//		int h2 = screenHeightEnd.intValue();
//		action.press(PointOption.point(width, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
//				.moveTo(PointOption.point(width, h2)).release().perform();

	}
	
	public void swipeDownCount(int num) {
//		for(int i=0;i<num;i++) {
//      ExtentTestManager.getTest().info("Swiping screen");
//		TouchAction action = new TouchAction(getDriver());
//		PointOption p1 = new PointOption();
//		Dimension dimensions = getDriver().manage().window().getSize();
//		Double screenHeightStart = dimensions.getHeight() * 0.5;
//		Double screenWidth = dimensions.getWidth() * .5;
//		int width = screenWidth.intValue();
//		int h1 = screenHeightStart.intValue();
//		Double screenHeightEnd = dimensions.getHeight() * 0.99;
//		int h2 = screenHeightEnd.intValue();
//		action.press(PointOption.point(width, h1)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
//				.moveTo(PointOption.point(width, h2)).release().perform();
//		}

	}
	
    public void scrollIntoElement(WebElement elementValue) {
		boolean element;
		int count=0;
		swipeDown();
		swipeDown();
		swipeDown();
		swipeDown();
		swipeDown();
		while (true) {
			scrollIntoViewSmoothlyFullScreen();
			element = isElementDisplayed(elementValue);
			count++;
			if(count == 8){
				element = true;
			}
			if (element == true) {
				scrollIntoViewSmoothlyFullScreen();
				break;
			}
		}
	}
    
	public static String removeDollarandSpaces(String amount) {
		printString("Amount :  " + amount);
		if(amount.contains("$")) {
			amount = amount.replace("$", "").trim();
			printString("Remove Dollar :  " + amount);			
		}
		if(amount.contains(",")) {
			amount = amount.replace(",", "").trim();
			printString("Remove Dollar :  " + amount);						
		}
		
		return amount.trim();
	}
	
	public static String removeSpecialCharacters(String value) {
		return value.replaceAll("[^\\x00-\\x7F]", "");
	}

}
