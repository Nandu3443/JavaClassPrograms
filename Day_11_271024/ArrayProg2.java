import java.util.Scanner;
public class ArrayProg2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] =i+10;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
