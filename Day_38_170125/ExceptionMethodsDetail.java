
public class ExceptionMethodsDetail {

	public static void main(String[] args) {
		try {
			System.out.print(10/0);
		} catch (Exception e) {
			if(e instanceof ArithmeticException){
				System.out.println("ArithmeticException true");
			}
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	

	}

}
