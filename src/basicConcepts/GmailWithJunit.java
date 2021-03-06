package basicConcepts;

import org.junit.Test;

public class GmailWithJunit
{
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
	//********************Reusable Components ********************
	void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//launch
		//dfdfdfdfd
		//gghfhgh
		//fghgfhj
		//tytr5656
		//ffdg78768
		//fggh34324
	}
	private void loginToApplication()
	{
		System.out.println("RC : Login Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	private void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");		
	}
	void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	protected void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}

}
