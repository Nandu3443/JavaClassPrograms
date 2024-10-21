import java.util.Scanner;
public class Note1 {

	public static void main(String[] args) {
		System.out.println("Enter score:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score > 70) {
			System.out.println("Distinction");
		} else if (score > 70) {
			System.out.println("A Class");
		} else {
			System.out.println("Failed");
		}

	}

}
