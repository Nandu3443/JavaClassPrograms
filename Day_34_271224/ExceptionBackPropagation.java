public class ExceptionBackPropagation {
	static int friendsFriend(int b) {
		System.out.println("friendsFriend() started..");
		System.out.println(10 / 0);
		int a;
		try {
			 a = 10/b;
			
		} catch (Exception e) {
			a = 0;
		}
		int result = a*2;
		System.out.println("friendsFriend() ended..");
		return result;
	}

	static void friend() {
		System.out.println("friend() started..");
		int res = friendsFriend(0);
		System.out.println("friend() ended..");
	}

	public static void main(String[] args) {
		System.out.println("main() started..");
		try {
			friend();
		} catch (Exception e) {
			System.out.println("Handled Exception by main()");
		}
		System.out.println("main() Ended..");
	}
}
