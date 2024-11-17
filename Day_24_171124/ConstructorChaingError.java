class PClassA{
	PClassA(int x){
		System.out.println(x);
	}
//	PClassA(){
//		
//	}
}

class PClassB extends PClassA{
	PClassB(int x){
//		super(); since there is no default constructor it gives error
		super(x);
	}
}
public class ConstructorChaingError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PClassB(10);
	}

}
