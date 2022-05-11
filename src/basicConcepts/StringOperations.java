package basicConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "     Selenium With Java            ";
	String b = "JAVA";
	String c = "Selenium With JAVA      ";
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("Length of the string :"+ len);
		String aT = a.trim();
		System.out.println("String length after trim :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("string after lower :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("string after upper :" + aU);
	}
	@Test
	public void substring()
	{
		String a8 = a.trim().substring(8);
		System.out.println("a8 :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("a08 :" + a08);
	}
	@Test
	public void contains()
	{
		//boolean result = a.trim().contains(b);
		//boolean result = a.trim().toLowerCase().contains(b.trim().toLowerCase());
		boolean result = a.trim().toUpperCase().contains(b.trim().toUpperCase());
		if(result)
		{
			System.out.println("String a cotains b");
		}
		else
		{
			System.out.println("String b is not there in string a");
		}
	}
	@Test
	public void stringEquals()
	{
		//if(a.equals(c))
		//if(a.trim().equals(c.trim()))
		//if(a.trim().toLowerCase().equals(c.trim().toLowerCase()))
		if(a.trim().equalsIgnoreCase(c.trim()))
		{
			System.out.println("Both a and c are equal");
		}
		else
		{
			System.out.println(" a and c are not equal");
		}
	}
	
	//charAt , split , concat
	
	
	
	
	
	
	
	
	
	
	

}
