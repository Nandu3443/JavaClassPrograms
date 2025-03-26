class CustomerTransact extends Thread{
	int balance = 5000;
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Transaction started..");
		}
		for(int i=0;i<5;i++) {
			System.out.println("Amount withdrawn");
			balance = balance - 500;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (this) {
			notify();
		}
		for(int i=0;i<5;i++) {
			System.out.println("Transaction completed");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class InterThreadCommunicationProg {

	public static void main(String[] args) {
		CustomerTransact t0= new CustomerTransact();
		System.out.println("Balance before withdraw:"+t0.balance);
		t0.start();
		try {
			synchronized (t0) {
				t0.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Balance after withdraw:"+t0.balance);
		

	}

}
