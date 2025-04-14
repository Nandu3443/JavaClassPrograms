import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListInteratorProgram {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter values");
 		while(sc.hasNextInt()) { //10 20 30 40 50 exit
 			al.add(sc.nextInt());
 		}
 		System.out.println("collection is"+al);
 		ListIterator i = al.listIterator();
 		while(i.hasNext()) {
 			System.out.print(""+i.next()+" ");
 		}
 		System.out.println();
 		while(i.hasPrevious()) {
 			System.out.print(""+i.previous()+" ");
 		}
	}

}
