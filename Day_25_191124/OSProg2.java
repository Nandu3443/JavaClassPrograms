class OS2{
	void boot() {
		System.out.println("System is booting..");
	}
	void shutDown() {
		System.out.println("System is shutting down..");
	}
}

class Windows2 extends OS2{
	void playPubg() {
		System.out.println("Enjoying headshots..");
	}
	
	void boot() {
		System.out.println("Windows System is booting..");
	}
	void shutDown() {
		System.out.println("Windows System is shutting down..");
	}
}

class Mac2 extends OS2{
	void videoEdit() {
		System.out.println("MEditing shortfilm..");
	}
	void boot() {
		System.out.println("MAC System is booting..");
	}
	void shutDown() {
		System.out.println("MAC System is shutting down..");
	}
}

class Linux2 extends OS2{
	void writeCode() {
		System.out.println("Writing program..");
	}
	
	void boot() {
		System.out.println("Linux System is booting..");
	}
	void shutDown() {
		System.out.println("Linux System is shutting down..");
	}
}

public class OSProg2 {

	public static void main(String[] args) {
			OS2 os = new OS2();
			os.boot();
			os.shutDown();
//			os.playPubg();  // parent can't inherit child method
			
			System.out.println("=====");
			Windows2 windows= new Windows2();
			windows.boot();				// child can inherit parent methods
			windows.shutDown();
			windows.playPubg();     
			

	}

}
