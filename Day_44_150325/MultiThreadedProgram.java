import java.util.Scanner;

class MyTask1 extends Thread{
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
class MyTask2 extends Thread{
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
class MyTask3 extends Thread{
	public void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Result is:"+(a+b));
	}
}

public class MultiThreadedProgram {

	public static void main(String[] args) {
		 MyTask1 myTask1 = new MyTask1();
		 MyTask2 myTask2 = new MyTask2();
		 MyTask3 myTask3 = new MyTask3();
		 myTask1.start();
		 myTask2.start();
		 myTask3.start();
		 System.out.println("Execution is done..");
	}

}
