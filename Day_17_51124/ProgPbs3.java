import java.util.Scanner;

public class ProgPbs3 {
	
	public static void main(String[] args) {
		System.out.println("Enter Problem Stmt Line:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		for(int i=0;i<ar.length;i++) {
			String eachStr = ar[i];
			String startChar = ""+eachStr.charAt(0);
			String result =startChar.toUpperCase() + eachStr.substring(1,eachStr.length()) + " ";
			System.out.print(result);
		}
	}

}
