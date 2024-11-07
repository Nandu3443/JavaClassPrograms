class Customer2{
	private String name;
	private long crnNumber;
	private double balance;
	
	public void setName(String name){
		this.name = name;
//		name = name;
	}
	
	public void setCRN(long l) {
		this.crnNumber = l;
	}
	
	public void setBalance(double amount) {
		if ( amount > 0) {
			this.balance += amount;	
		}else {
			System.out.print("Not a permissible amount!.");
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public long getCRN() {
		return this.crnNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
}

public class ProgWIthEncap {

	public static void main(String[] args) {
			Customer2 customer1 = new Customer2();
			customer1.setName("Arvind");
			customer1.setCRN(146612312);
			customer1.setBalance(500.00);
			System.out.printf("Name : %s, CRNNumber : %d, balance : %f",
			customer1.getName(),
			customer1.getCRN(),
			customer1.getBalance());
	}

}

