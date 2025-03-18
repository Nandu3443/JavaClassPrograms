class ChildTHread extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println("Child Thread");
		}
		System.out.println("Completed Child...");
	}
	
}
public class ThreadPriorityProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(6);
		System.out.printf("%s - %s\n",mainThread.getName(),mainThread.getPriority());
		ChildTHread t= new ChildTHread();
		t.start();
//		t.setPriority(1);
		System.out.printf("%s - %s\n",t.getName(),t.getPriority());
		for(int i=0;i<30;i++) {
			System.out.println("Main Thread");
		}
		System.out.println("Completed Main...");
	}

}
