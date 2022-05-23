package inheritanceByObject;

import org.junit.Test;

public class ReusableComponents
{
	//Execution Sequence : Instance variables -> Block -> Constructor of the class called by the user[child class]
	String empName = "Ram";
	//Block
	{
		System.out.println("Employee Name :" + empName);
		System.out.println("Clear the Cache"); //Write the respective java code to clear cache
		System.out.println("Delete Temp records in data base");
	}
	public ReusableComponents()
	{
		//System.out.println("Clear the Cache");
		//System.out.println("Delete Temp records in data base");
		System.out.println("Open Defult Browser : Google Chrome");
	}
	public ReusableComponents(String browser)
	{
		//System.out.println("Clear the Cache");
		//System.out.println("Delete Temp records in data base");
		System.out.println("Open Browser of user Choice : " + browser); // we have to write the logic with if else statements
	}
	public ReusableComponents(String browser,int version)
	{
		//System.out.println("Clear the Cache");
		//System.out.println("Delete Temp records in data base");
		System.out.println("Open Browser of user Choice : " + browser  +   "   With Version :" + version); // we have to write the logic with if else statements
	}
	//********************Reusable Components ********************
	protected void launchApplication()
	{
		System.out.println("RC : Launch Application from RC");
		//launch
		//dfdfdfdfd
		//gghfhgh
		//fghgfhj
		//tytr5656
		//ffdg78768
		//fggh34324
	}
	protected void loginToApplication()
	{
		System.out.println("RC : Login Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");		
	}
	protected void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply Mail");
	}
	void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}


}
