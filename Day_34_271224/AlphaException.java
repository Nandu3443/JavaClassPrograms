import java.util.Scanner;

public class AlphaException {

	public static void main(String[] args) {
		System.out.println("Enter a and b value:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}catch (Exception e) {
			System.out.println("infinity..");
		}
		System.out.println("Main Completed...");
	}

}
