package basicConcepts;

import org.junit.Test;

public class LoopingStatements 
{
	@Test
	public void applyColorToSteps()
	{
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4");
		System.out.println("Apply color to step 5"); //.....................
	}
	
	//for(int iterator=1; condition ; stepsize) {  Task  } 
	//for(int i=1; i<50 ; i=i+1){ apply color }
	@Test
	public void applyColor()
	{
		for(int i=1;i<=50;i=i+1) //i =1 1<50->true  i=2 2<50->true ....49<50->true  50<50-> false   50<=50 -> true
		{ //true
			System.out.println("Apply Color to Step :"+ i);
		}
	}
	//for(int i=1;i<n;i++){}
	@Test
	public void applyColor_Red()
	{
		for(int i=1;i<=50;i=i+2) //i =1 3 5 7 .......
		{ //true
			System.out.println("Apply Red Color to Step :"+ i);
		}
	}
	@Test
	public void applyColor_Green()
	{
		for(int i=2;i<=50;i=i+2) //i =2 4 6 8 10 ....
		{ //true
			System.out.println("Apply Green Color to Step :"+ i);
		}
	}
	
	@Test
	public void findStudent()
	{
		boolean result = false;
		for(int s=1;s<=60;s++)
		{
			//System.out.println("Student Roll Number :" + s);
			if(s==22)
			{
				//System.out.println("Found the Student");
				result = true;
				break;
			}			
		}
		if(result == true)
		{
			System.out.println("Found the Student");
		}
		else
		{
			System.out.println("Not Found the Student");
		}
	}
	//Nested for Loop
	//Apply color to 5 floors , Different color to each floor , each floor contains 20 steps
	@Test
	public void applyColorToApartment()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("**************************Apply color to Floor :" + i);
			for(int j=1;j<=20;j++)
			{
				System.out.println("Apply color to floor :" + i + " , Step Number :" + j); // i=1 j=1 2 3 4 5...20
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
