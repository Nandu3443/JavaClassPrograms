class Studennt2{
	String name;
	byte marks;
	Studennt2(){
		System.out.println("Nothing assigned..");
	}
	Studennt2(String name){
		System.out.println("name param constructor called");
		this.name = name;
	}
	
	Studennt2(byte marks){
		System.out.println("marks param constructor called");
		this.marks = marks;
	}
	
	Studennt2(String name,byte marks){
		System.out.println("complete constructor is called");
		this.name = name;
		this.marks = marks;
	}
	
}

public class ProgConstructorOverloading {

	public static void main(String[] args) {
		Studennt2 alex = new Studennt2("ALex");
		Studennt2 x = new Studennt2((byte)100);
		Studennt2 bob = new Studennt2("bob",(byte)92);
		new Studennt2();

	}

}
