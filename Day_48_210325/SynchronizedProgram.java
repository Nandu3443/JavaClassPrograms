class CustomerObj{
	int bal=15000;
	 synchronized void withdraw(String mode,int amount) {
//		for(int i=0;i<5;i++) {
//			
//		}
		System.out.println("Withdrawing money through"+mode);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (bal>0) {
			if(bal-amount>=0) {
				bal = bal-amount;
				System.out.println("Money withdrawn succesfully");
			}else {
				System.out.println("Insufficient funds");
			}
			
		}else {
			System.out.println("Insufficient funds");
		}
	}
}

class BankThread extends Thread{
	CustomerObj c;
	String mode;
	int amount;
	BankThread(CustomerObj c,String mode,int amount){
		this.c =c;
		this.mode = mode;
		this.amount = amount;
	}
	
	public void run() {
		c.withdraw(mode,amount);
	}
}
public class SynchronizedProgram {

	public static void main(String[] args) {
		 CustomerObj arvind = new CustomerObj();
		 BankThread t1 = new BankThread(arvind, "phonepe",15000);
		 BankThread t2 = new BankThread(arvind,"ATM",15000);
		 BankThread t3 = new BankThread(arvind,"gpay",15000);
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
