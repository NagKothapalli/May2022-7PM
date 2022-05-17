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
	public void stringConcatenation()
	{
		//int+int -> int , int+string |  string+int | string+string -> string
		System.out.println(2+"Ram"+4); //2Ram4
		System.out.println("Ram"+2+4);  //Ram24
		System.out.println(2+4+"Ram"); //6Ram
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
	//Write a program to read a string as input and find count of a particular char
	@Test
	public void characterAt()
	{
		int count =0;
		String a = "Selenium Automation With Java   ";		
		char c0 = a.charAt(0);
		System.out.println("Chat at 0 index :" + c0);
		int len = a.trim().length();
		for(int i=0;i<len;i++)
		{
			char ci = a.trim().charAt(i); // i = 0 1 2 3 4 5
			System.out.println("char at place :" + i + " , char is :" + ci);
			if(ci == 'e')
			{
				count++;
			}
		}
		System.out.println("Count of char e :" + count);
	}
	//two mnts
	@Test
	public void characterAt_Test()
	{
		characterAt("Welcome to Java",'a');
		characterAt("Welcome to Python",'w');
	}
	public void characterAt(String input,char charToFind)
	{
		int count =0;
		int len = input.trim().length();
		for(int i=0;i<len;i++)
		{
			char ci = input.trim().toLowerCase().charAt(i); // i = 0 1 2 3 4 5
			//System.out.println("char at place :" + i + " , char is :" + ci);
			if(ci == charToFind)
			{
				count++;
			}
		}
		System.out.println("In the given string --  "+input+ " --  Count of char " + charToFind + " is :" + count);
	}
	@Test
	public void concatenation()
	{
		String d = a.concat(b).concat(c);
		System.out.println(d);
		System.out.println(a+b+c);
	}
	@Test
	public void splitOperation()
	{
		String a = "    Selenium-With-Java   ";
		String[] arr = a.trim().split("-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Technology :" + arr[2]);
		//array
	}
	
	
	
	
	
	

}
