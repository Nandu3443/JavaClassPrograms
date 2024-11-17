class A{
	int x = 10;
	private int y =100;
	public void eat() {
		System.out.println("A is eating...");
	}
	private void sleep() {
		System.out.println("A is sleeping...");
	}
}

class B extends A{
	
}


public class ProgInheritanceRules1 {

	public static void main(String[] args) {
			B obj= new B();
			System.out.println(obj.x);
//			System.out.println(obj.y);
			obj.eat();
//			obj.sleep();
//			obj.play();
	}

}
