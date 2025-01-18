import java.util.Scanner;

class UnderAgeException extends Exception{
	public UnderAgeException() {
		
	}
	public UnderAgeException(String message) {
		super(message);
	}
}


class OverAgedException extends Exception{
	@Override
	public String getMessage() {
		return "OMG, you are still alive";
	}
}

public class CustomExceptionExample {
	
	public static void checkAge(int age) throws UnderAgeException,OverAgedException {
		if (age<18) {
//			throw new UnderAgeException("Your are young to drive");
			throw new UnderAgeException("you are not applicable for job");
		}else if(age>60) {
			throw new OverAgedException();
		}else {
			System.out.println("Your perfect fit and eligible..");
		}
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			try {
				checkAge(age);
			} catch (UnderAgeException e) {
//				System.out.println(e);
				System.out.printf(e.getMessage());
			}catch(OverAgedException e) {
				System.out.println(e);
			}
	}

}
