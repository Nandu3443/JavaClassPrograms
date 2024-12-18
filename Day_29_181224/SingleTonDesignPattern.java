class Earth{
	static Earth e = new Earth();
	int size=100;

	private Earth(){
	}
	
	public static Earth getEarthInstance() {
		return e;
	}
}

class Earth2{
	static Earth2 e = null;
	int size=100;
	private Earth2() {
		
	}
	public static Earth2 getEarthInstance() {
		if (e==null) {
			e = new Earth2();
		}
		return e;
	}
}

public class SingleTonDesignPattern {

	public static void main(String[] args) {
//		Earth obj = new Earth();
		Earth2 globe = Earth2.getEarthInstance();
		System.out.println(globe);
		System.out.println(globe.size);
		globe.size = 101;
		Earth2 world = Earth2.getEarthInstance();
		System.out.println(world);
		System.out.println(world.size);
		System.out.println(globe.size);
	}
}
