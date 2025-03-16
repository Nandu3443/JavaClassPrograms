class MyJob2 extends Thread{
	
	public MyJob2(String name) {
		super(name);
	}
	
	public void run() {
		
	}
}
public class SetNameUsingConsProg {

	public static void main(String[] args) {
		 MyJob2 myJob2 = new MyJob2("Myjob2-thread");
		 System.out.println(myJob2.getName());

	}

}
