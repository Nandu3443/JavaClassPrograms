import java.util.Comparator;
import java.util.TreeSet;

class CustomSort1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int a1 = (Integer) o1;
		int a2 = (Integer) o2;
		if (a1 > a2) {
			return -1;
		} else if (a1 < a2) {
			return 1;
		} else {
			return 0;
		}

	}

	
	
}
public class CustomSortProg {

	public static void main(String[] args) {
		CustomSort1 customSort = new CustomSort1();
		TreeSet set = new TreeSet(customSort);
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

