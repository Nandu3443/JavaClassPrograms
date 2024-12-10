import java.util.Scanner;
class Car{
	public void start() {
		System.out.println("Car is starting..");
	}
	public void run() {
		System.out.println("Car is running..");
	}
	
	public void stop() {
		System.out.println("Car is stopping..");
	}
}


class Audi extends Car{
	public void start() {
		System.out.println("Audi is starting..");
	}
	public void run() {
		System.out.println("Audi is running..");
	}
	
	public void stop() {
		System.out.println("Audi is stopping..");
	}
}

class BMW extends Car{
	public void start() {
		System.out.println("BMW is starting..");
	}
	public void run() {
		System.out.println("BMW is running..");
	}
	
	public void stop() {
		System.out.println("BMW is stopping..");
	}
}

class Nano extends Car{
	public void start() {
		System.out.println("Nano is starting..");
	}
	public void run() {
		System.out.println("Nano is running..");
	}
	
	public void stop() {
		System.out.println("Nano is stopping..");
	}
}

class Factory{
	static Car getCar(String input) {
		if(input.equalsIgnoreCase("bmw")) {
			return new BMW();
		}else if(input.equalsIgnoreCase("audi")) {
			return new Audi();
		}else if(input.equalsIgnoreCase("nano")) {
			return new Nano();
		}else {
			return null;
		}
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		System.out.println("Enter the Desired Car:");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		Car myCar = Factory.getCar(choice);
		if (myCar!=null) {
			myCar.start();
			myCar.run();
			myCar.stop();
		}else {
			System.out.println("Invalid input...");
		}
		

	}

}
