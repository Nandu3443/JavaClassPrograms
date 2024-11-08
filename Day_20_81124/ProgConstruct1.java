class Studennt{
	String name;
	int rollNum;
	byte marks;
	
//	Studennt(){
//		System.out.println("Constructor called..");
//	}
	
	Studennt(String name,int rollNum,byte marks){
		System.out.println("Constructor called..");
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
	}
}
public class ProgConstruct1 {

	public static void main(String[] args) {
		Studennt s1 = new Studennt("Alex",101,(byte)80);
		Studennt s2 = new Studennt("Bob",102,(byte)85);
		System.out.print(s1.name);
		System.out.print(s2.name);

	}

}
