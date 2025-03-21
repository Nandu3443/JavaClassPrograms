class CustomerObj{
	synchronized public void withdraw(String mode) {
//		for(int i=0;i<5;i++) {
//			
//		}
		System.out.println("Withdrawing money through"+mode);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class BankThread extends Thread{
	CustomerObj c;
	String mode;
	BankThread(CustomerObj c,String mode){
		this.c =c;
		this.mode = mode;
	}
	
	public void run() {
		c.withdraw(mode);
	}
}
public class SynchronizedProgram {

	public static void main(String[] args) {
		CustomerObj arvind = new CustomerObj();
		 BankThread t1 = new BankThread(arvind, "phonepe");
		 BankThread t2 = new BankThread(arvind,"ATM");
		 BankThread t3 = new BankThread(arvind,"gpay");
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
