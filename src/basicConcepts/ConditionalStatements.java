package basicConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//if(expression -> boolean : true / false) {  if true then this code will be executed }
	int a = 22;
	int b = 25;
	@Test
	public void compareNumbers()
	{
		if(a==b)
		{
			//code
			System.out.println("Both A and B are equal");
		}
	}
	
	@Test
	public void compareNumbers_ifelse()
	{
		if(a==b)
		{ //true
			//code
			System.out.println("Both A and B are equal");
		}
		else
		{ //false
			System.out.println("Both A and B are not equal");
		}
	}
	@Test
	public void compareNumbers_ifelse_test() //Unit Test
	{
		compareNumbers_ifelse(22,22);
		compareNumbers_ifelse(44,28);
	}
	public void compareNumbers_ifelse(int a,int b) //Dev code
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(a==b)
		{ //true
			//code
			System.out.println("Both A and B are equal");
		}
		else
		{ //false
			System.out.println("Both A and B are not equal");
		}
	}
	

}
