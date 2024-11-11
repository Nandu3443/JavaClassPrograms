class Alpha{
	int x,y;
	static int a,b;
}


public class StaticVariable {

	public static void main(String[] args) {
		Alpha obj1 = new Alpha();
		Alpha obj2 = new Alpha();
		
			
		System.out.println("obj1 Before");
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println("obj2 Before");
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		obj1.x = 100;
		obj1.y = 50;
		obj1.a = 999;
		obj1.b = 888;
		
		obj2.x = 200;
		obj2.y = 150;
		obj2.a = 777;
		obj2.b = 666;
		
		System.out.println("obj1 After");
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println("obj2 After");
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.a);
		System.out.println(obj2.b);

	}

}
