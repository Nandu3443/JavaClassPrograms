import java.util.*;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList arr =  new ArrayList();
		System.out.println(arr.size());
		ArrayList arr2 =  new ArrayList(50);
		System.out.println(arr.size());
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(10);
		arr.add("arvind");
		System.out.println(arr);
		System.out.println(arr.size());
		ArrayList arr3 =  new ArrayList(arr);
		System.out.println(arr == arr3);
		System.out.println(arr.get(3));
		arr.remove(2);
		System.out.println(arr.get(3));
	}

}
