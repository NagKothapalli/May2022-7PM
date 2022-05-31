package mySelenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	//Locators/Selectors : id , name , class , cssSelector , linkText , partialLinkText , tagName , Xpath
	String expectedTitle = "Gmail";
	ChromeDriver driver;
	public GmailAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //it will open an empty browser
	}
	@Test
	public void launchApplication() throws InterruptedException
	{
		System.out.println("RC : Launch Application");
		//open an empty browser
		
		//Every browser window will have a unique session ID 
		//call the url
		driver.get("https://gmail.com");
		String url = driver.getCurrentUrl();
		System.out.println("My url :" + url);
		String currentTitle = driver.getTitle();
		System.out.println("my title :" + currentTitle);
		Assert.assertEquals(expectedTitle, currentTitle);
		String session = driver.getWindowHandle();
		System.out.println("my session ID :" + session);
		
	}
	//NoSuchElementException
	@Test
	public void loginToApplication() throws InterruptedException
	{
		launchApplication();
		/*
		 * WebElement emailObj = driver.findElement(By.name("identifier"));
		 * emailObj.click(); emailObj.sendKeys("dfsfdds"); Thread.sleep(1000);
		 * emailObj.clear(); Thread.sleep(1000); emailObj.sendKeys("nag022@gmail.com");
		 */
		
		driver.findElement(By.id("identifierId")).sendKeys("nag022@gmail.com");
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//elements.get(2).click();
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String txt = element.getText();  System.out.println("Text on the object :" + txt);
			if(txt.equals("Next"))
			{
				elements.get(i).click();
				break;
			}
		}
		
		/*
		 * driver.findElement(By.name("identifier")).click();
		 * driver.findElement(By.name("identifier")).sendKeys("dfdsfdsdsda");
		 * Thread.sleep(1000); driver.findElement(By.name("identifier")).clear();
		 * Thread.sleep(1000);
		 * driver.findElement(By.name("identifier")).sendKeys("nag022");
		 */
		
	}
	//WebDriver : get , getUrl , getTitle , getWindowHandle
	//WebElement : click , clear , sendkeys , getText , getAttribute [ label , value ....]
	@Test
	public void createAccount() throws InterruptedException
	{
		launchApplication();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		//elements.get(2).click();
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String txt = element.getText();  System.out.println("Text on the object :" + txt);
			if(txt.equals("Create account"))
			{
				elements.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
