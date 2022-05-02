package basicConcepts;

//Signature : CLASS
 // Modifier  class   Name{  Members  }
 //Access Modifiers : private , default , protected , public 
 //Non-Access : static , final
public class CoreConcepts
{
	//Members : Variables   / Functions | Methods
//Signature : VARIABLE
	//Modifier[opt]   DataType  Name ; - Declaration        Modifier   DataType  Name = value ;  - Assignment
	public static String   collegeName = "JNTU";
	public        String   schoolName = "Pragathi"; //instance
	public static final int intrestRate = 2;
	public double marks = 94.87;
	private char grade = 'A';
	        boolean result = false;
//Signature : FUNCTION / METHOD
  //Modifier[opt] ReturnType  Name(inputs....[opt]){ body }    - concrete function   - class
  //Modifier[opt] ReturnType  Name(inputs....[opt]); - abstract function  - interface
//psvm
  public static void main(String[] args)
  {
	  System.out.println("Welcome to Selenium Java");
	  addition();
  }
  public static void addition()
  {
	  int sum = 22+25;
	  System.out.println("Sum of two numbers :" + sum);
  }
	        

}


class Yahoo
{
	String college = CoreConcepts.collegeName;
	//String mySchool = CoreConcepts.
	int rate = CoreConcepts.intrestRate ;
}

class Amazon
{
	
}
