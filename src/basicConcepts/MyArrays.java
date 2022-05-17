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
	
	
}
