import java.util.Scanner;

class Calculator2{
	int add(int x, int y) {
		int c = x+y;
		return c;
	}
}
public class ProgramMapping1 {
	public static void main(String args[]) {
		System.out.println("Enter a,b values:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator2 calc = new Calculator2();
		int result = calc.add(a, b);
		System.out.println(result);
	}
}
