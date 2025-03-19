class ChildTHreadTask extends Thread{
	public void run() {
		for (int i=0;i<=200;i++) {
			System.out.println("#####Child-Thread#####");
			Thread.yield();
		}
	}
}
public class YeidProgram {

	public static void main(String[] args) {
		 ChildTHreadTask t0 = new ChildTHreadTask();
		 t0.start();
		 for (int i=0;i<=200;i++) {
				System.out.println("$$$$Main-Thread$$$$");
				Thread.yield();
			}

	}

}
