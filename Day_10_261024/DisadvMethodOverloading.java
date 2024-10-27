class Calcu{
	double add (float a, int b){
		return a+b;
	}
	
	double add(int a,float b) {
		return a+b;
	}
}

public class DisadvMethodOverloading {

	public static void main(String[] args) {
			Calcu c = new Calcu();
			int a = 5;
			int b = 10;
//			System.out.println(c.add(a,b));
	}

}
