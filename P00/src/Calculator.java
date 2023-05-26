
public class Calculator {
	public int add (int a, int b) {
		 return a + b;
		}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiple (int a, int b) {
		return a*b;
	}
	public int divide (int a, int b) {
		if (b == 0) {
			System.out.println("0 Cannot be divided!");
		}
		return a/b;
	}
}
