import java.util.Scanner;

public class FinallyBlockExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a:");
			int a = sc.nextInt();
			System.out.println("Enter b:");
			int b = sc.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Exception handled...");
		}finally {
			System.out.println("Finally Executed..");
		}

	}

}
