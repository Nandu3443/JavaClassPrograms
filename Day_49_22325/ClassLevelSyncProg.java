class TicketCount{
	int ticketCount =1;
}

class User{
	String name;
	User(String name){
		this.name = name;
	}
	synchronized static void bookTicket(String name,TicketCount count){
		if (count.ticketCount!=0) {
			System.out.println("Ticket booked by:"+name);
			count.ticketCount = 0;
		}else {
			System.out.println("Sry, No tickets available");
		}
	}
}

class BookTicket extends Thread{
	User user;
	TicketCount count;
	
	BookTicket(User user,TicketCount count){
		this.user = user;
		this.count = count;
	}
	public void run() {
		user.bookTicket(user.name,count);
	}
}
public class ClassLevelSyncProg {

	public static void main(String[] args) {
		User alex= new User("alex");
		User bob= new User("bob");
		User jack= new User("jack");
		TicketCount count = new TicketCount();
		BookTicket t0= new BookTicket(alex,count);
		BookTicket t1= new BookTicket(bob, count);
		BookTicket t2= new BookTicket(jack, count);
		t0.start();
		t1.start();
		t2.start();
	}

}
