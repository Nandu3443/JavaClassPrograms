class Bank{
	double amount;
	private Bank(double amount){
		this.amount = amount;
	}
//	Bank(){
//		
//	}
}
public class ProgConstError {

	public static void main(String[] args) {
			Bank b = new Bank(1000.00);

	}

}
