class GreatGrandFather{
	GreatGrandFather(){
		System.out.println("GreatGrandFather Born..");
	}
}

class GrandFather extends GreatGrandFather{
	GrandFather(){
		System.out.println("GrandFather Born..");
	}
}

class Father extends GrandFather{
	Father(){
		System.out.println("Father Born..");
	}
}

class ChildA extends Father{
	ChildA(){
		System.out.println("Child Born..");
	}
}

public class MultiLevelConstructorChaining {

	public static void main(String[] args) {
		new ChildA();

	}

}
