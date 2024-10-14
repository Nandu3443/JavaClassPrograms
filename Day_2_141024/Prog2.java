import java.util.Scanner;
class Prog2 {

    public static void main(String[] args) { 
           System.out.println("Enter a number:");
           Scanner sc = new Scanner(System.in);
           System.out.println(sc.nextInt());
    }
    
}

// What is scanner
// 1. If an user needs an input from a different stream
//     1. keyboard:
//         Scanner sc = new Scanner(System.in);
//        from Standard i/o stream, java opens up channel
//     2. file
//     3. URL

