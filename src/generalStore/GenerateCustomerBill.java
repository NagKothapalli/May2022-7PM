package generalStore;

import org.junit.Test;

import myInterface.ArithemeticOperations;
import myInterface.CommercialCalculator;
import myInterface.MiniCalculator;
import myInterface.ScientificCalculator;

public class GenerateCustomerBill
{  //I lost my audio
	@Test
	public void customerBill()
	{
		int prod1 = 454342;
		int prod2 = 143543;
		MiniCalculator mCalc = new MiniCalculator();
		CommercialCalculator cCalc = new CommercialCalculator();
		ScientificCalculator sCalc = new ScientificCalculator();
		ArithemeticOperations calc = new MiniCalculator();
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://apsrtc.com");
		//calc.displayLogo();
		int bill = calc.addition(prod1, prod2);
		System.out.println("CustomerBill :" + bill);
		//calc.coSineValue();
				
	}

}
