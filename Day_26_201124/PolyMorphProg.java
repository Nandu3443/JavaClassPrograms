
import java.util.Scanner;
class AlphaOS{
	void boot() {
		System.out.println("System is booting..");
	}
	void shutDown() {
		System.out.println("System is shutting down..");
	}
}

class AlphaWindows extends AlphaOS{
	void playPubg() {
		System.out.println("Enjoying headshots..");
	}
}

class AlphaMac extends AlphaOS{
	void videoEdit() {
		System.out.println("Editing shortfilm..");
	}
}

class AlphaLinux extends AlphaOS{
	void videoEdit() {
		System.out.println("Editing shortfilm..");
	}
}


public class PolyMorphProg {

	public static void main(String[] args) {
		System.out.print("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int choice  = sc.nextInt();
		AlphaOS myOS = null;
		switch (choice) {
		case 1: {
			myOS = new AlphaWindows();
			break;
		}
		case 2: {
			myOS = new AlphaMac();
			break;
		}
		case 3: {
			myOS = new AlphaLinux();
			break;
		}
		default:
			System.out.println("Not a valid choice..");
			System.exit(choice);
		}
		
		System.out.println("Required Object is created..");
		
	}

}
