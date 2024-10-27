import java.util.Scanner;
class MyArray{
	int[] input(){
		System.out.println("Enter size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value for index:"+i);
			arr[i] =sc.nextInt();
		}
		return arr;
	}
	void display(int x[]) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
public class ArrayProg3 {

	public static void main(String[] args) {
		MyArray obj = new MyArray();
		int result[] =  obj.input();
		obj.display(result);
	}

}
