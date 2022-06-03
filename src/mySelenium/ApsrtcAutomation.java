package mySelenium;

import java.time.Duration;

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
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //it will open an empty browser  //1234
		actions = new Actions(driver);  //1234
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
	//************************************
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	public void clickTab()
	{
		actions.sendKeys(Keys.TAB).build().perform();
	}	
	public void doubleClick(WebElement element)
	{
		actions.moveToElement(element).doubleClick().build().perform();
	}
	public void rightClick(WebElement element)
	{
		actions.moveToElement(element).contextClick().build().perform();
	}
	public void clickElement(String myxpath)
	{
		driver.findElement(By.xpath(myxpath)).click();
	}
	public void enterText(String myxpath,String txt)
	{
		driver.findElement(By.xpath(myxpath)).sendKeys(txt);
	}
	//*************************************************
	@Test
	public void workWithMultipleWindows()
	{
		//driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		clickElement("//a[@title='TimeTable / Track']");
		clickElement("//a[text()='All services Time Table & Tracking']");
	}	
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		enterText(sourceXpath,"HYDERABAD");
		Thread.sleep(1000);
		//actions.sendKeys(Keys.ENTER).build().perform();
		clickEnter();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		enterText(destinationXpath,"GUNTUR");
		Thread.sleep(1000);
		//actions.sendKeys(Keys.ENTER).build().perform();
		clickEnter();
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
