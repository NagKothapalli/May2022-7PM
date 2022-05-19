package multilevelInheritance;

import org.junit.Test;

//              A       extends  B   extends C  : A inherits both B , C 
public class TestSuites extends TestCases
{
	//this - standard keyword in java which refers to this call , instance members of the current class
	//super - standard keyword in java which refers to immediate parent
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TS"); }
	 */

	@Test
	public void smokeSuite() {
		//this.launchApplication();
		//super.launchApplication();
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		forwardAnEmail();
	}

	@Test
	public void regressionSuite() {
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		forwardAnEmail();
		replyToAnEmail();
		deleteAnEmail();
	}

}
