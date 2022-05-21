package inheritanceByObject;

import org.junit.Test;
//             Child               Parent   -> Simple Inheritance
public class TestCases //extends ReusableComponents
{
	//Modifier[opt]  ClassName      objName  = new Constructor();
	   public    ReusableComponents  rc      = new ReusableComponents();//1  //property
	   public    ReusableComponents  rc1      = new ReusableComponents();//2 int num = 22; //property
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
		rc.launchApplication(); //rc1.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}	
	@Test
	public void replyToAnEmail() //Test Case
	{
		System.out.println("Test Case : ReplyToAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail() //Test Case
	{
		System.out.println("Test Case : ForwardAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail() //Test Case
	{
		System.out.println("Test Case : DeleteAnEmail");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
