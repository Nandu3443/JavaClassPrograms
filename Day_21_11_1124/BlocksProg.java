class Alphaa{
	static int a = 10;
	{
		System.out.println("Instance block-1");
	}
	
	static {
		System.out.println("static block-1");
	}
	
	{
		System.out.println("Instance block-2");
	}
	
	static {
		System.out.println("static block-2");
	}
}
public class BlocksProg {
	{
		System.out.println("Main Instance Block");
	}

	static {
		System.out.println("Main static Block");
	}
	
	public static void main(String[] args) {
		Alphaa obj1 = new Alphaa();
		Alphaa obj2 = new Alphaa();
		System.out.println(Alphaa.a);
	}

}
