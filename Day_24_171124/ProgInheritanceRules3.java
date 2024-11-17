class ParentB {
	ParentB(int a){
		System.out.println("Parent Constructor");
	}
	ParentB(){
		System.out.println("Overwritten Parent Constructor");
	}
}

class ChildB extends ParentB{
	ChildB(){
		super();
//		this();
		System.out.println("Child Constructor");
	}
}


public class ProgInheritanceRules3 {

	public static void main(String[] args) {
		ChildB obj = new ChildB();

	}

}
