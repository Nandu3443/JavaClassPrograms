
public class DataTypes {
	public static void main(String[] args) {
		int b = 0;
		float flt = 0;
		char c = '\u0000';
		System.out.println(b);
		System.out.println(flt);
		System.out.println(c);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.SIZE);
		
		System.out.println("===================");
		
		int y = 130;
		byte x = (byte)y;
		System.out.println(x);
		
		char d = 65;
		System.out.println(d);
	}

}
