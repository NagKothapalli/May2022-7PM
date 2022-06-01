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
	//WebDriver : get , getUrl , getTitle , getWindowHandle , findElement , findElements 
	//By  : id , name , class , cssSelector , linkText , partialLinkText , tagName , Xpath
	//WebElement : click , clear , sendkeys , getText , getAttribute [ label , value ....]
	//Full  / Static / Absolute  xpath
	//Realtive xpath - just like SQL select query
	
	//tagName[@attribute = 'value']            //tagName[contains(@attribute , 'partial value')]
	
	//tagName[text()= 'value']                 //tagName[contains(text(), 'partial value')]
	
	//*[@attribute = 'value']                  //*[contains(@attribute , 'partial value')]
	
	//*[text()= 'value']                      //*[contains(text(), 'partial value')]
	
	@Test   
	public void createAccount() throws InterruptedException
	{
		launchApplication();
		//Full  / Static / Absolute  xpath
		// /html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.className("VfPpkd-vQzf8d"));
		 * //elements.get(2).click(); for(int i=0;i<elements.size();i++) { WebElement
		 * element = elements.get(i); String txt = element.getText();
		 * System.out.println("Text on the object :" + txt);
		 * if(txt.equals("Create account")) { elements.get(i).click(); break; } }
		 */
	}
	@Test
	public void forgotEmail() throws InterruptedException
	{
		launchApplication();
		//driver.findElement(By.tagName("button")).click(); //Forgot email?
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("button"));
		 * for(int i=0;i<elements.size();i++) { WebElement element = elements.get(i);
		 * String txt = element.getText(); System.out.println("Text on the object :" +
		 * txt); if(txt.equals("Forgot email?")) { elements.get(i).click(); break; } }
		 */
	}
	
	
	@Test
	public void learnMore() throws InterruptedException
	{
		launchApplication();
		//driver.findElement(By.linkText("Learn more")).click();
		//driver.findElement(By.partialLinkText("Learn")).click();
		//driver.findElement(By.tagName("button")).click(); //Forgot email?
		//driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
		//driver.findElement(By.xpath("//a[text()='Learn more']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Learn')]")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); String txt
		 * = element.getText(); System.out.println("Text on the object :" + txt);
		 * if(txt.equals("Learn more")) { elements.get(i).click(); break; } }
		 */
	}
	
	
	
	
	
	
	
	
	

}
