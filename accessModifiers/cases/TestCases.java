package cases;

import org.junit.Test;

import components.ReusableComponents;
//             Child               Parent   -> Simple Inheritance
public class TestCases extends ReusableComponents
{
	
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TC"); }
	 */
	 
	//Junit : Unit Test Framework . We can run test methods with the help of junit
	//A Java function will be treated as Test Method / Test Case  after adding @Test annotation
	@Test   //TestCase - Step1 , Step2 , Step3 , Step4 ........
	public void composeAndSendAnEmail() //Test Case
	{
		System.out.println("Test Case : ComposeAndSendAnEmail");
		//launch , login , compose , send , logout , close
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}	
	@Test
	public void replyToAnEmail() //Test Case
	{
		System.out.println("Test Case : ReplyToAnEmail");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void forwardAnEmail() //Test Case
	{
		System.out.println("Test Case : ForwardAnEmail");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail() //Test Case
	{
		System.out.println("Test Case : DeleteAnEmail");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
