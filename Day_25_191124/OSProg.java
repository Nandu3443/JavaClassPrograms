class OS{
	void boot() {
		System.out.println("System is booting..");
	}
	void shutDown() {
		System.out.println("System is shutting down..");
	}
}

class Windows extends OS{
	void playPubg() {
		System.out.println("Enjoying headshots..");
	}
}

class Mac extends OS{
	void videoEdit() {
		System.out.println("Editing shortfilm..");
	}
}

class Linux extends OS{
	void writeCode() {
		System.out.println("Writing program..");
	}
}

public class OSProg {

	public static void main(String[] args) {
			OS os = new OS();
			os.boot();
			os.shutDown();
//			os.playPubg();  // parent can't inherit child method
			
			Windows windows= new Windows();
			windows.boot();				// child can inherit parent methods
			windows.shutDown();
			windows.playPubg();     
			

	}

}
