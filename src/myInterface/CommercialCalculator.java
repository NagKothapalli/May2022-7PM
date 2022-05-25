package myInterface;

public class CommercialCalculator implements ArithemeticOperations
{
	public void displayLogo()
	{
		System.out.println("Welcome to CASIO Commercial");
	}
	@Override
	public int addition(int a, int b) {
		System.out.println("Addition from Commercial Calc");
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
