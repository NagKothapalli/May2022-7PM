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
  public static void main(String[] args)   // yourclassname.main();  xxxxxx.main()
  {
	  System.out.println("Welcome to Selenium Java");
	  //addition();
	  //addition(44,66);
	  //addition(414,646);
	  //addition(44,22,88);
	  //addition(44,272,838);
	  int gross = addition(44,272,838,56);
	  int netSal = gross - 200 ;
	  System.out.println("Payslip : NetSalary :" + netSal);
	  //return netSal;
  }
  //Naming Conventions for member of a class  [ Variable / Function ]
  //Member of a class can start with _ , $ , a-z , A-Z , It should follow camelCasing
  int _stdNum;  int $stdNum;  int stdNum; int StdNum;
  int std_Num;  int stdNum_;  int std$Num; int stdNum$;
  int std1Num;  int stdNum1;
  public static void addition() //Method overloading - compile time || static polymorphism
  {
	  int sum = 22+25; //fixed  - hard coded values
	  System.out.println("Sum of two numbers :" + sum);
  }
  
  public static void addition(int a, int b)
  {
	  int sum = a + b;
	  System.out.println("Sum of two number [with two inputs] :" + sum);
  }
  public static void addition(int a, int b,int c)
  {
	  int sum = a + b + c;
	  System.out.println("Sum of three number [with three inputs] :" + sum);
  }
  
  public static int addition(int a, int b,int c,int d)
  {
	  int sum = a + b + c + d;
	  sum = sum + 100 ;
	  return sum; //door closed	  
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
