
public class TestProg611 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
		System.out.println(str);
		System.out.println(str.hashCode());
		str = str.replace(2, 2, "d");
//		str = "abd";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		StringBuffer str2 = new StringBuffer();
		str2 = str2.replace(0, 0, "abc");
		System.out.println(str2);
		
		StringBuffer str3 = new StringBuffer("Nandu");
		str3 = str3.replace(str3.indexOf("a"), 2, "@");
		System.out.println(str3);
		
		StringBuilder str4= new StringBuilder("Sai");
		System.out.println(str4);
		
		System.out.println(str4.reverse());
		
		
	}
}
