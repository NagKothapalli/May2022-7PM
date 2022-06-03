package mySelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ApsrtcAutomation
{

	String expectedTitle = "APSRTC Official Website for Online Bus Ticket Booking - APSRTConline.in";
	ChromeDriver driver;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //it will open an empty browser
	}
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
	public void bookBusTicket() throws InterruptedException
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
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
