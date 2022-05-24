package myInterface;

public class MiniCalculator implements ICalculator {
	public int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}
	@Override
	public int subtraction(int a, int b) {
		int diff = a-b;
		return diff;
	}

	@Override
	public int multiplication(int a, int b) {
		int prod = a*b;
		return prod;
	}

	@Override
	public int division(int a, int b) {
		int div = a/b;
		return div;
	}
}
