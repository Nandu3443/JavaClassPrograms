import java.util.Scanner;
class Calculator{
	int result;
	
	void addition(int a, int b) {
		result = a+b;
	}
	
	void substraction(int a,int b) {
		result = a-b;
	}
	
	void multiplication(int a,int b) {
		result = a*b;
	}
	
	void division(int a, int b) {
		result = a/b;
	}
}

public class ProgCalc {

	public static void main(String[] args) {
			Calculator calc = new Calculator();
			System.out.println("Enter two values:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			calc.addition(a, b);
			System.out.println("Addition of 2 values is:"+calc.result);
	}

}
