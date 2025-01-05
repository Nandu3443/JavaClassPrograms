import java.util.InputMismatchException;
import java.util.Scanner;

public class AlphaExceptionHandler {
	static int read_input_integer() {
		Scanner sc = new Scanner(System.in);
		int result = -1;
		try {
			result = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		return result;
	}

	public static void main(String[] args) {
		boolean stop = true;
		int a = 0, b = 0;
		while (stop) {
			System.out.println("Enter a value:");
			a = read_input_integer();
			System.out.println("Enter b value:");
			b = read_input_integer();
			if (a == -1 || b == -1) {
				System.out.println("Please reconsider the values");
			} else {
				stop = false;
			}
		}
		System.out.printf("result is :%d", a / b);
//		return a/b;

	}

}
