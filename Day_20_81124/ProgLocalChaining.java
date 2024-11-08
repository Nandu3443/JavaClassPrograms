class Studentt{
	private String name;
	private int rollNum;
	private byte marks;
	Studentt(String name,int rollNum,byte marks){
		this(rollNum,marks);
		System.out.println("Constructor 1");
		this.name = name;
		System.out.println("Name is assigned");
	}
	
	Studentt(int rollNum,byte marks){
		this(marks);
		System.out.println("Constructor 2");
		this.rollNum  = rollNum;
		System.out.println("rollNum assigned");
		
	}
	Studentt(byte marks){
			this();
			System.out.println("Constructor 3");
			this.marks = marks;
			System.out.println("marks assigned");
	}
	Studentt(){
		System.out.println("Object created");
	}
	
	public String toString() {
		return String.format("Name :%s, RollNum:%d, Marks: %d",
				 this.name,
				 this.rollNum,
				 this.marks);
	}
}
public class ProgLocalChaining {

	public static void main(String[] args) {
		 Studentt alex = new Studentt("Alex",101,(byte)40);
		 System.out.println(alex);

	}

}
