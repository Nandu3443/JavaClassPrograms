import java.util.Scanner;

public class ThrowingExceptionExample {

    public static int divide(int a, int b) {
        if(b<0){
            throw new ArithmeticException("/ by -ve value");
        }else if (b>a){
            throw new ArithmeticException("b>a");
        }
        return a/b;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int a = sc.nextInt();
         System.out.println("Enter b number: ");
         int b = sc.nextInt();
         int result = divide(a, b);
         System.out.println("Result: " + result);
    }
    
}
