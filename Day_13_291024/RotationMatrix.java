
public class RotationMatrix {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int newArr[][] = new int[3][3];
		int a = 1;
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = a;
				a++;
			}
		}
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0,k=arr.length-1;j<arr[i].length;j++,k--) {
				newArr[i][j] = arr[k][i];
			}
			break;
		}
		
		for (int i=0;i<newArr.length;i++) {
			for(int j=0;j<newArr[i].length;j++) {
				System.out.print(newArr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
