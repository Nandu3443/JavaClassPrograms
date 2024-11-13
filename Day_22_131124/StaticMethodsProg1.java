class WithInstance{
	int x;
	void myMethod() {
		System.out.println("instance method...");
	}
}

class WithStatic{
	int x;
	static void myMethod() {
		System.out.println("static method..");
		System.out.println(x);
	}
}

public class StaticMethodsProg1 {

	public static void main(String[] args) {
		int x = 10;
		WithStatic.myMethod();
		WithInstance obj = new WithInstance();
		obj.myMethod();
	}
}
