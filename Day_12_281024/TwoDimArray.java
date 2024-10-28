
public class TwoDimArray {

	public static void main(String[] args) {
			int arr[][]= new int[4][4];
			int count = 35;
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					count++;
					arr[i][j] = count;
				}
			}
			
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			

	}

}
