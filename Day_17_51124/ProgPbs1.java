import java.util.Scanner;
public class ProgPbs1 {

	public static void main(String[] args) {
		System.out.println("Enter Problem Stmt Line:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
			
		}
	}
}
