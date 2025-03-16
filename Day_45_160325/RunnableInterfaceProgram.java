import java.util.Scanner;

class MyTaskRI1 implements Runnable{
	public void run() {
		for(int i=1;i<31;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}
class MyTaskRI2 implements Runnable{
	public void run() {
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}
class MyTaskRI3 implements Runnable{
	public void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Result is:"+(a+b));
	}
}

public class RunnableInterfaceProgram {

	public static void main(String[] args) {
		 MyTaskRI1 myTask1 = new MyTaskRI1();
		 MyTaskRI2 myTask2 = new MyTaskRI2();
		 MyTaskRI3 myTask3 = new MyTaskRI3();
		 Thread thread1 = new Thread(myTask1);
		 Thread thread2 = new Thread(myTask2);
		 Thread thread3 = new Thread(myTask3);
		 thread1.start();
		 thread2.start();
		 thread3.start();
		 System.out.println("Execution is done..");
	}

}
