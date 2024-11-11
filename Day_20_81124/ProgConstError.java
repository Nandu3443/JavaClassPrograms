class Bank{
	double amount;
	private Bank(double amount){
		this.amount = amount;
	}
//	Bank(){
//		
//	}
	Bank createBankInstance(double amount) {
		return new Bank(amount);
	}
	
}
public class ProgConstError {

	public static void main(String[] args) {
//			Bank b = new Bank(1000.00);

	}

}
