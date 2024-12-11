class Heart{
	int hearBeat = 62;
}

class Caar{
	String brand = "nano";
	String color = "white";
	int topSpeed = 90;
}

class Human{
	//	Composition
	Heart myHeart;
	Human(){
		myHeart = new Heart();
	}
	
	//	Aggregation
	void displayCarDetails(Caar myCar){
		System.out.println(myCar.brand);
		System.out.println(myCar.color);
		System.out.println(myCar.topSpeed);
	}
}

public class HasARelation {

	public static void main(String[] args) {
		 Human bob = new Human();
		 System.out.println(bob.myHeart.hearBeat);
		 bob = null;
//		 System.out.println(bob.myHeart.hearBeat);
		 Caar nano= new Caar();
//		 bob.displayCarDetails(nano);
		 System.out.print(nano.brand);
	}

}
