
class Student{
	String name;
	
	public String toString() {
		return "Nandu";
	}
}

public class ObjStringDiff {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
//		System.out.println(s1.toString());
		String str = new String("abc");
		System.out.println(str);
//		System.out.println(str.toString());
		System.out.println(System.identityHashCode(str));

	}

}
