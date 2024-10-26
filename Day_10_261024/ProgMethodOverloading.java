class Calcy{
	int add(int x, int y) {
		int c = x+y;
		return c;
	}
	
	int add(int x, int y, int z) {
		int c = x + y + z;
		return c;
	}
	
	int add(int x, long y) {
		int c = x+(int)y;
		return c;
	}
	
	int sub(int x, long y) {
		int c = x -(int)y;
		return c;
	}
	
	int sub(long x,int y) {
		int c = (int)x - y;
		return c;
	}
	
}


public class ProgMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
