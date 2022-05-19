package hierarchicalInheritance;

import org.junit.Test;

public class TestCases_M3 extends ReusableComponents
{
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
