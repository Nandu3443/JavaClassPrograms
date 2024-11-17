class ParentA{
	int income = 100;
}

class childA extends ParentA{
	int income = 1000;
	
	void showIncome(int source) {
		if (source == 1) {
			System.out.println(this.income);
		}else {
			System.out.println(super.income);
		}
	}
}

public class ProgInheritanceRules2 {

	public static void main(String[] args) {
		childA obj = new childA();
		obj.showIncome(1);
		obj.showIncome(0);
		
		 

	}

}
