
public class ProgStringFormatter {

	public static void main(String[] args) {
		String name ="Nandu";
		String loc = "blr";
		String result = String.format("Hi my name is %s, I am from %s",name,loc);
		String var[] = {"Nandu","blr"};
		String result2 = String.format("Hi my name is %s, I am from %s",var);
		System.out.println(result);
		System.out.printf("Hi my name is %s, I am from %s \n",var);
		System.out.println();
		
		double price = 1235689.789;
		System.out.println(String.format("Price :%.2f",price));
		System.out.println(String.format("Price :%011.2f",price));

	}

}
