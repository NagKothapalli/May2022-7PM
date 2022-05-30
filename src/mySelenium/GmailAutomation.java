package mySelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	String expectedTitle = "Gmail";
	@Test
	public void launchApplication() throws InterruptedException
	{
		System.out.println("RC : Launch Application");
		//open an empty browser
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //it will open an empty browser
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
		driver.findElement(By.name("identifier")).click();
		driver.findElement(By.name("identifier")).sendKeys("dfdsfdsdsda");
		Thread.sleep(1000);
		driver.findElement(By.name("identifier")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("identifier")).sendKeys("nag022");
		
	}

}
