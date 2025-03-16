import java.util.Scanner;

class MultiTasks extends Thread{
	public void printNumbers() {
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
	public void printCharacters() {
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
	public void add() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Result is:"+(a+b));
	}
	public MultiTasks(String name) {
		super(name);
	}
	public void run() {
		String name = this.getName();
		if (name.equals("printNumbers")) {
			printNumbers();
		}else if (name.equals("printChars")) {
			printCharacters();
		}else if(name.equals("add")) {
			add();
		}
	}
}
public class MultiTaskProg {

	public static void main(String[] args) {
		MultiTasks task1 = new MultiTasks("printNumbers");
		MultiTasks task2 = new MultiTasks("printChars");
		MultiTasks task3 =new MultiTasks("add");
		task1.start();
		task2.start();
		task3.start();
	}

}
