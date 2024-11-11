class AlphaCLass{
	int x;
	static int a;
}
public class StaticReference {

	public static void main(String[] args) {
		System.out.println(AlphaCLass.a);
		AlphaCLass.a = 100;
		System.out.println(AlphaCLass.a);
		AlphaCLass obj1 = new AlphaCLass();
		System.out.println(obj1.a);
	}
}
