package myInterface;

public class ScientificCalculator implements ArithemeticOperations,TrigonametricOperations
{
	public void displayLogo()
	{
		System.out.println("Welcome to CASIO Scientific");
	}
	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition from Scientific Calc");
		return (a+b);
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}
	@Override
	public void sineValue() {
		// TODO Auto-generated method stub
		System.out.println("SINE VALUE");
	}
	@Override
	public void coSineValue() {
		// TODO Auto-generated method stub
		System.out.println("COSINE VALUE");
	}
	@Override
	public void coSecValue() {
		// TODO Auto-generated method stub
		System.out.println("COSEEC VALUE");
	}

}
