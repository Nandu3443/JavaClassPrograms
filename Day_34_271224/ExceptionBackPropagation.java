public class ExceptionBackPropagation {
	static void friendsFriend() {
		System.out.println(10 / 0);
	}

	static void friend() {
		friendsFriend();
	}

	public static void main(String[] args) {
		friend();
	}
}
