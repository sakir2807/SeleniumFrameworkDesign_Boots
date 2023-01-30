package com.boots.TestComponents;

import com.boots.AbstractComponents.AbstractComponent;
import com.boots.pageobjects.LandingPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import java.lang.reflect.Method;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

import static java.lang.System.out;
import static org.testng.AssertJUnit.assertTrue;

public class BaseTest {

	public WebDriver driver;
	//public WebDriverWait wait;
	public LandingPage landingPage;
	private static long DRIVER_WAIT_TIME = 10;
	protected static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);

	private static Properties properties;

	static {
		try {
			loadRunConfigProps("src/main/java/com/boots/resources/data.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebDriver initializeDriver() throws IOException

	{

		/*if (browserName.contains("chrome")) {*/
			ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			/*if(browserName.contains("headless")){
			options.addArguments("headless");
			}	*/
			driver = new ChromeDriver(options);
			//driver.manage().window().setSize(new Dimension(1440,900));//full screen

		/*} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/rahulshetty//documents//geckodriver");
			driver = new FirefoxDriver();
			// Firefox
		} else if (browserName.equalsIgnoreCase("edge")) {
			// Edge
			System.setProperty("webdriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
		}
*/

		driver.manage().window().maximize();
		return driver;

	}



	public static void loadRunConfigProps(String configPropertyFileLocation) throws IOException {
		properties = new Properties();
		try (FileInputStream inputStream = new FileInputStream(configPropertyFileLocation)) {
			properties.load(inputStream);
			properties.list(out);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
	}


	public static String getProp(String key) {
		if ((key == null) || key.isEmpty()) {
			return "";
		} else {
			return properties.getProperty(key);

		}
	}
	
	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException
	{
		//read json to string
	String jsonContent = 	FileUtils.readFileToString(new File(filePath), 
			StandardCharsets.UTF_8);
	
	//String to HashMap- Jackson Databind
	
	ObjectMapper mapper = new ObjectMapper();
	  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
      });
	  return data;


	}
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}

	public LandingPage launchApplication() throws IOException
	{
		driver = initializeDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	
		
	}

	


	//MyCode

	public WebElement waitForExpectedElement(final By by, long waitTimeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, waitTimeInSeconds);
		try {
			return wait.until(visibilityOfElementLocated(by));
		} catch (NoSuchElementException | TimeoutException e) {
			LOG.info(e.getMessage());
			return null;
		} catch (StaleElementReferenceException e) {
			LOG.info(e.getMessage());
			return wait.until(visibilityOfElementLocated(by));
		}
	}

	private ExpectedCondition<WebElement> visibilityOfElementLocated(final By by) throws NoSuchElementException {
		return driver -> {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				LOG.error("Error Message : " + e.getMessage());
			}
			WebElement element = driver.findElement(by);
			return element.isDisplayed() ? element : null;
		};
	}

	public WebElement waitForExpectedElement(final By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			return wait.until(visibilityOfElementLocated(by));
		} catch (StaleElementReferenceException e) {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			return wait.until(visibilityOfElementLocated(by));
		}
	}

	public void clickByElementByQueryJSExecutor(final By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", waitForExpectedElement(by));
		jse.executeScript("arguments[0].click()",waitForExpectedElement(by));
	}

	public boolean invisibilityOfElementLocated(By by, Duration duration) {
		return (new WebDriverWait(driver, DRIVER_WAIT_TIME)).until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public boolean isElementDisplayedBySeconds(final By by,int seconds) {
		try {
			new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (TimeoutException exception) {
			LOG.info(exception.getMessage());
			return false;
		}
		return true;
	}

	public void enterDataAndWait(By by,String strEnterData){
		try {
			waitForExpectedElement(by,20).clear();
			waitForExpectedElement(by,10).sendKeys(strEnterData);
			Thread.sleep(2000);
		} catch(Exception ex) {
			LOG.info("Failed to enter data in text-field due to error: "+ex.getMessage());
		}
	}

	public void waitForAjaxElementNotToBePresent(WebDriver driver, Integer waitTime){
		try {
			if (waitForExpectedElement(By.cssSelector(".loading-mask"),waitTime).isDisplayed()) {
				LOG.info("Waiting for ajax LOADER to not be present");
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-mask")));
			} }catch (Exception e) {
			LOG.info("Ajax loading class no longer present");
		}
	}

	public void waitForPage() {
		new WebDriverWait(driver, 10).until(webDriver ->
				((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	}

	public void scrollToElement(By byCss) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(byCss);
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void hoverOnElement(By by) {
		Actions action = new Actions(driver);
		try {
		action.moveToElement(driver.findElement(by)).perform();
		}catch (MoveTargetOutOfBoundsException moveTargetOutOfBoundsException){
			            moveTargetOutOfBoundsException.printStackTrace();
		}

	}

	public void urlContainsText(String urlContains) {
		waitForAjaxElementNotToBePresent(driver,4);
		assertTrue(driver.getCurrentUrl().contains(getProp(urlContains)));
	}


	public static String getMessage(String key) {
		String text = "";
		if ((key == null) || key.isEmpty()) {
			return "";
		} else {
			text = ResourceBundle.getBundle("locale/data_in").getString(key).trim();
		}
		return text;
	}

	public void scrollToPageBottom() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public boolean isSelected(By by){
		return waitForExpectedElement(by).isSelected();
	}

	/**
	 * Returns the current page title from page
	 */
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

	public String getTextFor(By by) {
		return waitForExpectedElement(by).getText();
	}

	public String getTrimTextFor(By by) {
		return waitForExpectedElement(by).getText().trim();
	}

	public String getValue(By by){
		return waitForExpectedElement(by).getAttribute("value");
	}

	public String getAttribute(By by, String attributeValue) {
		return waitForExpectedElement(by).getAttribute(attributeValue);
	}


		public void selectValueFromDropDownByIndex(int index, By by) {
		Select ProductDropDown;
		try {
			ProductDropDown = new Select(waitForExpectedElement(by, 20));
		}
		catch(WebDriverException e){
			ProductDropDown = new Select(driver.findElement(by));
		}
		ProductDropDown.selectByIndex(index);
	}



	public boolean checkPageTitle(String title) {
		return new WebDriverWait(driver, DRIVER_WAIT_TIME).until(ExpectedConditions.titleIs(title));
	}

	public void waitForTextToBe(WebDriver driver, Integer waitTime, By by, String expectedText){
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.textToBe(by, expectedText));
	}

	public void waitForItemToBeClickableAndClick(By by,Integer waitTime){
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(by));
		waitForExpectedElement(by).click();
	}

	public void switchBetweenWindowTabs(int tabNum) {
		LOG.info("Running : switchBetweenWindowTabs");
		ArrayList<String> windowTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(tabNum));
	}

	public void refreshBrowser(){
		LOG.info("Running : refreshBrowser");
		driver.navigate().refresh();}

	public void waitClearAndEnterText(final By by, String textToEnter) {
		waitForExpectedElement(by).clear();
		waitForExpectedElement(by).sendKeys(textToEnter);
	}

	public void getAllLists(){
		List<WebElement> lists = driver.findElements(By.tagName("ul"));
		LOG.info("Total number of lists : " + lists.size());
		for (WebElement list : lists){
			if(list.getAttribute("class").length() > 0){
			}
		}
		LOG.info("Total number of LISTS found : " + lists.size());
	}

	public void getAllImages(){
		LOG.info("Running : getAllImages");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		LOG.info("Total number of images found : " + images.size());
		for (WebElement image : images){
			if (image.getAttribute("class").equals("desktop")){
				LOG.info("IMAGE : " + image.getAttribute("alt"));
			}
		}
	}

	protected boolean isElementClickable(By by) {
		try {
			new WebDriverWait(driver, DRIVER_WAIT_TIME).until(ExpectedConditions.elementToBeClickable(by));
		} catch (TimeoutException exception) {
			return false;
		}
		return true;
	}
}
