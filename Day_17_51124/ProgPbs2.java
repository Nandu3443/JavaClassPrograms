import java.util.Scanner;

public class ProgPbs2 {

	public static void main(String[] args) {
		System.out.println("Enter Problem Stmt Line:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		for(int i=0;i<ar.length;i++) {
//			String eachStr = ar[i];
//			System.out.print(eachStr+eachStr.length()+" ");
			System.out.print(ar[i]+ar[i].length()+" ");
		}
	}
}
