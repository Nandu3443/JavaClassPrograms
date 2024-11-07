class Customer{
	String name;
	long crnNumber;
	double balance;
}

public class ProgWithoutEncap {

	public static void main(String[] args) {
		Customer x = new Customer();
		x.name = "Arvind";
		x.crnNumber = 7592927l;
		x.balance = 500;
		System.out.printf("Name : %s, CRNNumber : %d, balance : %f",x.name,x.crnNumber,x.balance);
	}
}
