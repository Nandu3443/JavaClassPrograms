
public class ProgramDoWhileLoop {

	public static void main(String[] args) {
		int n = 5;
		for (int i=2;i<=n;i++) {
			if (i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
			System.out.println("Inside loop end..");
		}
		System.out.println("COmpleted Loop..");
		
		while(n>0) {
			System.out.println(n);
			n--;
		}
		n=5;
		System.out.println("For as While loop:");
		for(;n>0;) {
			System.out.println(n);
			n--;
		}
		
		n=5;
		System.out.println("Do while example...");
		do {
			System.out.println("Executing my do block"+n);
			n--;
		}while(false);
	}

}
