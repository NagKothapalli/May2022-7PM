package basicConcepts;

import org.junit.Test;

public class MyArrays
{
	//Arrays and Collections
	//Array : Is a group of memory locations of similar data types.
	
	//fixed array
	//Modifier[opt]    DataType  Name = value;
	public int rollNum ;
	//Modifier[opt]    DataType[]  Name = {values ......};
	//Declaration , Assignment , size , reading , writing
	@Test
	public void fixedArray_integer()
	{
		//   Index           0  1  2 3 4 5 6  7  8  9  10  ->11
		int[] rollNumbers = {22,34,6,3,7,4,34,56,87,99,43};
		int len = rollNumbers.length;
		System.out.println("Length of the array :" + len); //first type syso then hold [CTRL+SPACE] 
		int value = rollNumbers[0]; //Reading  // the maximum index value should be <= [length-1]
		//if you mention the index value > [length-1] then you will get IndexOutOfBounds Exception.		
		rollNumbers[0] = 44; //writing
		for(int i=0;i<len;i++)
		{
			int val = rollNumbers[i];  // i = 0 1 2 .....
			System.out.println("My elements :" + val);
		}
		for(int i=0;i<len;i++)
		{
			rollNumbers[i] = 222 + i;  // i = 0 1 2 .....
			System.out.println("My elements after writing :" + rollNumbers[i] );
		}
	}
	@Test
	public void fixedArray_string()
	{//  index               0     1     2       3     -> 4
		String[]  names = {"Ram","Raj","Ravi","Rajesh"};
		int len = names.length;
		System.out.println("Length of the array :" + len);
		//Read , Write
		for(int i=0;i<len;i++) 
		{
			String name = names[i]; // i = 0 1 2 3 4
			System.out.println("Elements in the array :" + name);
		}
		for(int i=0;i<len;i++) 
		{
			names[i] = "Selenium-"+i;
			String name = names[i]; // i = 0 1 2 3 4
			System.out.println("Elements in the array after :" + name);
		}
	}
	
	//school - 4th class - 60 students - represent marks of the students 
	//Modifier[opt]   DataType[]  name = new DataType[count];
	@Test
	public void dynamicArray_integer()
	{
		//   Index           0  1  2 3 4 5 6  7  8  9  10  ->11
		//int[] rollNumbers = {22,34,6,3,7,4,34,56,87,99,43};
		int[]  marks = new int[60];  // default value of integer in java - 0
		int len = marks.length;
		System.out.println("Length of the array :" + len); //first type syso then hold [CTRL+SPACE] 
		int value = marks[0]; //Reading  // the maximum index value should be <= [length-1]
		//if you mention the index value > [length-1] then you will get IndexOutOfBounds Exception.		
		//marks[0] = 44; //writing
		for(int i=0;i<len;i++)
		{
			int val = marks[i];  // i = 0 1 2 .....
			System.out.println("My elements :" + val);
		}
		for(int i=0;i<len;i++)
		{
			marks[i] = 222 + i;  // i = 0 1 2 .....
			System.out.println("My elements after writing :" + marks[i] );
		}
	}
	
	@Test
	public void dynamicArray_string()
	{//  index               0     1     2       3     -> 4
		//String[]  names = {"Ram","Raj","Ravi","Rajesh"};
		String[]  names  = new String[20]; //default value of string in java null
		int len = names.length;
		System.out.println("Length of the array :" + len);
		//Read , Write
		for(int i=0;i<len;i++) 
		{
			String name = names[i]; // i = 0 1 2 3 4
			System.out.println("Elements in the array :" + name);
		}
		for(int i=0;i<len;i++) 
		{
			names[i] = "Selenium-"+i;
			String name = names[i]; // i = 0 1 2 3 4
			System.out.println("Elements in the array after :" + name);
		}
	}
	
	
	
	
	
	
	
	
	
}
