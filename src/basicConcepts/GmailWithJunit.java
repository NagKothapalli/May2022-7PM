package basicConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//Junit : Unit Test Framework . We can run test methods with the help of junit
	//A Java function will be treated as Test Method / Test Case  after adding @Test annotation
	@Test
	public void composeAndSendAnEmail() //Test Case
	{
		System.out.println("Test Case : ComposeAndSendAnEmail");
	}
	@Test
	public void replyToAnEmail() //Test Case
	{
		System.out.println("Test Case : ReplyToAnEmail");
	}
	@Test
	public void forwardAnEmail() //Test Case
	{
		System.out.println("Test Case : ForwardAnEmail");
	}
	@Test
	public void deleteAnEmail() //Test Case
	{
		System.out.println("Test Case : DeleteAnEmail");
	}

}
