package mySelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ApsrtcAutomation
{

	String expectedTitle = "APSRTC Official Website for Online Bus Ticket Booking - APSRTConline.in";
	ChromeDriver driver;
	Actions actions;
	AppUtilities appUtils;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //it will open an empty browser  //1234
		actions = new Actions(driver);  //1234
		appUtils = new AppUtilities(driver); //1234
	}
	//*****************XPATHS*******************
	String sourceXpath = "//input[@name='source']";
	String destinationXpath = "//input[@name='destination']";
	//******************************************
	@Before
	public void launchApplication() throws InterruptedException
	{
		System.out.println("RC : Launch Application");
		//open an empty browser		
		//Every browser window will have a unique session ID 
		//call the url
		driver.get("https://www.apsrtconline.in/");
		String url = driver.getCurrentUrl();
		System.out.println("My url :" + url);
		String currentTitle = driver.getTitle();
		System.out.println("my title :" + currentTitle);
		Assert.assertEquals(expectedTitle, currentTitle);
	}
	@Test
	public void mouseAndKeyBoardActions()
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']"));
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).doubleClick().contextClick().build().perform();
	}
	
	//NoSuchSessionException: Session ID is null
	//*************************************************
	@Test
	public void workWithMultipleWindows() throws InterruptedException
	{
		//driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		appUtils.clickElement("//a[@title='TimeTable / Track']");
		appUtils.clickElement("//a[text()='All services Time Table & Tracking']");
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> mywindows = new ArrayList<String>(windows);
		for(int i=0;i<mywindows.size();i++)
		{
			System.out.println("my session IDs :"+ mywindows.get(i));
		}
		driver.switchTo().window(mywindows.get(1));
		System.out.println("Title second window : " + driver.getTitle());
		//driver.close(); // it will close the current active window
		//driver.quit(); // it will close all windows . Kill the process from task manager , and session ID will be null
		driver.switchTo().window(mywindows.get(0));
		System.out.println("Title first window : " + driver.getTitle());
		Thread.sleep(1000);
		appUtils.clickElement("//a[@title='Home']");
		driver.quit();
	}	
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		appUtils.enterText(sourceXpath,"HYDERABAD");
		Thread.sleep(1000);
		//actions.sendKeys(Keys.ENTER).build().perform();
		appUtils.clickEnter();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		appUtils.enterText(destinationXpath,"GUNTUR");
		Thread.sleep(1000);
		//actions.sendKeys(Keys.ENTER).build().perform();
		appUtils.clickEnter();
		//open calendar
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//select date of journey
		selectDate("14");
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	public void selectDate(String jDate)
	{
		//Dynamic xpath
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
