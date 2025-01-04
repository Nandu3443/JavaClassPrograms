import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchHandler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		try {
			System.out.println("Enter a value:");
			a = sc.nextInt();
			System.out.println("Enter b value:");
			b = sc.nextInt();
			System.out.println(a/b);
//			return a/b;
		}
		catch (InputMismatchException e) {
			System.out.printf("Not a valid input provide integer value %s",e);
		}catch (ArithmeticException e) {
			System.out.printf("Enter value greater than 0 %s",e);
			b = 1;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		int result = a*b;
	}

}
