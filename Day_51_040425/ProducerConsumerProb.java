class OilFactory{
	int item = 0;
	synchronized public void production() throws InterruptedException {
		item = item +1;
		System.out.println("Item "+ item +" under production");
		Thread.sleep(1000);
		System.out.println("Item "+ item +" is produced");
		Thread.sleep(7000);
		notify();
		wait();
	}
	
	synchronized public void consumption() throws InterruptedException {
		System.out.println("Item "+ item +" under consumption");
		Thread.sleep(7000);
		System.out.println("Item "+ item +" is consumed");
		Thread.sleep(1000);
		notify();
		wait();
		
	}
}
class Production extends Thread{
	OilFactory f;
	Production(OilFactory f){
		this.f = f;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				f.production();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumption extends Thread{
	OilFactory f;
	public Consumption(OilFactory f) {
		this.f = f;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				f.consumption();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerProb {

	public static void main(String[] args) {
		OilFactory f= new OilFactory();
		Production p = new Production(f);
		Consumption c = new Consumption(f);
		p.start();
		c.start();

	}

}
