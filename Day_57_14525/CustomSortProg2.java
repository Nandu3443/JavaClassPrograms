import java.util.Comparator;
import java.util.TreeSet;

class CustomSort2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return -1;

	}

	
	
}
public class CustomSortProg2 {

	public static void main(String[] args) {
		CustomSort2 customSort2 = new CustomSort2();
		TreeSet set = new TreeSet(customSort2);
		set.add(10);
		set.add(30);
		set.add(25);
		set.add(25);
		set.add(45);
		set.add(35);
		set.add(90);
		System.out.print(set);
	}

}

