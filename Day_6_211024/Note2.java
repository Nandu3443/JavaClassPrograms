
public class Note2 {

	public static void main(String[] args) {
		char c = 'A';
		switch (c) {
		
		case 'A':
			System.out.println("Your score can be greater than 70");
			break;
		case 'B':
			System.out.println("Your score can be greater than 60 and less than 70");
			break;
		case 'C':
			System.out.println("Your score can be greater than 50 and less than 60");
			break;
		default:
			System.out.println("Your score can be less than 50 or failed!..");
			
	    }
  }

}
