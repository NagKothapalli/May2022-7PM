package mySelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class RedBusAutomation
{
	ChromeDriver driver;
	Actions actions;
	AppUtilities appUtils;
	String expectedTitle = "Online Bus Tickets Booking, Book Volvo AC Bus Tickets, Confirmed Bus Reservation -redBus";
	public RedBusAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //it will open an empty browser  //1234
		actions = new Actions(driver);  //1234
		appUtils = new AppUtilities(driver); //1234
		driver.manage().window().maximize();
	}
	
	@Before
	public void launchApplication() throws InterruptedException
	{
		System.out.println("RC : Launch Application");
		//open an empty browser		
		//Every browser window will have a unique session ID 
		//call the url
		driver.get("https://www.redbus.in/");
		String url = driver.getCurrentUrl();
		System.out.println("My url :" + url);
		String currentTitle = driver.getTitle();
		System.out.println("my title :" + currentTitle);
		Assert.assertEquals(expectedTitle, currentTitle);
	}
	//ElementClickInterceptedException: element click intercepted: Element is not clickable at point (1180, 29)
	@Test
	public void loginToApplication()
	{
		appUtils.clickElement("//div[@id='sign-in-icon-down']");
		appUtils.clickElement("//li[@id='signInLink']");
		WebElement myfrmae = driver.findElement(By.xpath("//div[@class='modal']//iframe[@class='modalIframe']"));
		driver.switchTo().frame(myfrmae);
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9959775757");
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
