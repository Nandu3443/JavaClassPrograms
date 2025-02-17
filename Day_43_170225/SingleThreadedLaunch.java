import java.util.Scanner;

class MyTasks{
	void printNumbers() {
		for(int i=1;i<31;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	void printCharacters() {
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	void add() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Result is:"+(a+b));
	}
}
public class SingleThreadedLaunch {

	public static void main(String[] args) {
	  MyTasks tasks	= new MyTasks();
	  tasks.printNumbers();
	  tasks.printCharacters();
	  tasks.add();

	}

}
