import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashTreeSetProgram {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		TreeSet t = new TreeSet();
		String str = "Mississippi";
		char ar[] = str.toCharArray();
		for(int i=0;i<ar.length;i++) {
			ls.add(ar[i]);
			t.add(ar[i]);
		}
		for(Object o:ls) {
			System.out.print(o);
		}
		System.out.println();
		for(Object o:t) {
			System.out.print(o);
		}
	}
}
