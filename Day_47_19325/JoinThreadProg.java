import java.util.Scanner;

class Downloading extends Thread{
	public void run() {
		for(int i=0;i<101;i++) {
			System.out.println(i+"% downloaded");
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class JoinThreadProg {

	public static void main(String[] args) {
		Downloading d = new Downloading();
		d.start();
		try {
			d.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Download Completed");
		System.out.println("Do you want to play y");
		String choice = sc.next();
		if (choice.equals("y")) {
			for(int i=0;i<101;i++) {
				System.out.println(i+"% played");
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
