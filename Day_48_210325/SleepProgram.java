class ChildTask extends Thread {
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("child-executing"+i);
			try {
				System.out.println("t0 child is going to sleep..");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println("t0 sleep interupted");
			}
		}
	}
}

public class SleepProgram {

	public static void main(String[] args) {
		ChildTask t0 = new ChildTask();
		t0.start();
//		try {
//			System.out.println("Main is going to sleep");
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		for (int i = 0; i < 30; i++) {
			System.out.println("child-executing"+i);
			try {
				System.out.println("t0 child is going to sleep..");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println("t0 sleep interupted");
			}
			t0.interrupt();
		}
		
	}

}
