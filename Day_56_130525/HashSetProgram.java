import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Nandu");
		h.add("Sai");
		h.add("Nandu");
		for(int i=0;i<10;i++) {
			h.add("Sai");
		}
		for(Object o:h) {
			System.out.print(o+" ");
		}

	}

}
