
public class TransposeMatrix {

	public static void main(String[] args) {
			int arr[][] = new int[2][3];
			int new_arr[][] = new int[3][2];
			char ch= 'a';
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j] = (int)ch;
					ch = (char)(int)(ch+1);
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print((char)arr[i][j]+" ");
				}
				System.out.println();
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					new_arr[j][i] = arr[i][j];
				}
			}
			
			System.out.println();
			for(int i=0;i<new_arr.length;i++) {
				for(int j=0;j<new_arr[i].length;j++) {
					System.out.print((char)new_arr[i][j]+" ");
				}
				System.out.println();
			}

	}

}
