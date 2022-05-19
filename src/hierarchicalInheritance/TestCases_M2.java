package hierarchicalInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents
{
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

}
