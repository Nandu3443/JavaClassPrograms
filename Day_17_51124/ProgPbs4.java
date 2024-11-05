import java.util.Scanner;

public class ProgPbs4 {

	static String reverse(String s) {
		String result = "";
		for(int i=s.length()-1;i>=0;i--) {
			result +=s.charAt(i);
		}
		return result; 
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Problem Stmt Line:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		for(int i=0;i<ar.length;i++) {
			String eachStr = ar[i];
			System.out.print(reverse(eachStr)+" ");
		}
	}
}
