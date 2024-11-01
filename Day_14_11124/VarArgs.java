class CalculatorArgs{
	int add(int... a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		return sum;
	}
}


public class VarArgs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CalculatorArgs cal= new CalculatorArgs();
			System.out.println(cal.add(1,2));
			System.out.println(cal.add(1,2,3));
			System.out.println(cal.add(1,2,3,4,5));
			System.out.println(cal.add());
	}
}
