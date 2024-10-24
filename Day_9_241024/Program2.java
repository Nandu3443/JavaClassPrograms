class Developer{
	String name;
	double salary;
	int empId;
}

public class Program2 {
	public static void main(String[] args) {
		int a =10;
		Developer arv =  new Developer();
		Developer thota =  new Developer();
		thota.name = "Thota";
//		arv.name = "Arvind";
//		arv.salary = 50000.00;
//		arv.empId = 101;
		System.out.println(a);
		System.out.println(arv.salary);
		double d = arv.salary;
		Developer vikram = thota;
		System.out.println(thota);
		thota = null;
		System.out.println(thota);
		System.out.println(vikram.name);
	}

}
