//using setName()
class MyJob1 extends Thread{
	public void run() {
		System.out.print("MyJob1 thread is running..");
	}
}
public class SetNameToThreadProg {

	public static void main(String[] args) {
		MyJob1 myJob1 = new MyJob1();
		System.out.println(myJob1.getName());
		myJob1.setName("MyJob1");
		System.out.println(myJob1.getName());

	}

}
