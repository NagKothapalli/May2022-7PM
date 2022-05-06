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
	
	//Write a program to read two inputs and perform addition if they are equal , subtraction if a > b , multiplication if a < b
	@Test
	public void multipleDecisions_test() //Unit Test
	{
		multipleDecisions(22,22);  //UseCase 1 Code Coverage =  Lines covered  /  Total Number of lines of code  * 100 : 5/15 = 33.33333
		multipleDecisions(44,2);
		multipleDecisions(4,84);
	}
	public void multipleDecisions(int a,int b) //Dev
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		boolean result = (a == b); //40 == 40 -> true   80 == 40 -> false
		//if(result == true)
		if(a==b)
		{
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a > b)
		{
			int diff = a-b;
			System.out.println("Difference of two numbers :" +diff );
		}
		else if(a<b)
		{
			int prod = a*b;
			System.out.println("Product of two numbers :"+ prod);
		}		
	}
	
	//Write a program to read two inputs and perform the below task if and only if both inputs are above 10
	//Task : perform addition if they are equal , subtraction if a > b , multiplication if a < b
	@Test
	public void logicalOperators_Test()
	{
		logicalOperators(4,6);
		logicalOperators(4,56);
		logicalOperators(54,6);
		logicalOperators(14,14);
		logicalOperators(44,14);
		logicalOperators(14,64);
	}
	
	public void logicalOperators(int a,int b)
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		//   T           T  -> T
		if((a>10)  && (b>10)) //Outer condition   // && Logical Operator
		{
			//Task
			if(a==b) // == Relational Operator //Inner condition - Nested if condition
			{
				int sum = a+b; // = : Assignment operator
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(a > b)  // >  Relational Operator
			{
				int diff = a-b;
				System.out.println("Difference of two numbers :" +diff );
			}
			else if(a<b) // < Relational Operator
			{
				int prod = a*b;
				System.out.println("Product of two numbers :"+ prod);
			}		
		}
		else
		{
			System.out.println("Both A and B or anyone of them might be below 10");
		}
	}
	
	//Write a program to read a number and find is that a even number
	@Test
	public void findEvenNumber_Test()
	{
		findEvenNumber(4);
		findEvenNumber(45);
		findEvenNumber(48);
		findEvenNumber(413);
		
	}
	
	public void findEvenNumber(int num)
	{
		//if the given number is divisible by 2 then that is a even number . If the reminder after division is 0 that is divisible by 2
		//if num % 2  then the output is reminder , if it is 0 then that number is even 
		// if num / 2 then the output is quotient
		if((num % 2) == 0)
		{
			System.out.println("The Given Number is Even :" + num);
		}
		else
		{
			System.out.println("The Given Number is Odd :" + num);
		}
		
	}
	
	@Test
	public void findOddNumber_Test()
	{
		findOddNumber(4);
		findOddNumber(45);
		findOddNumber(48);
		findOddNumber(413);
		
	}
	
	public void findOddNumber(int num)
	{
		if(!((num%2) == 0))
		{
			System.out.println("The Given Number is Odd :" + num);
		}
		else
		{
			System.out.println("The Given Number is Even :" + num);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
