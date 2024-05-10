 
	public class BookMyShow{
		public static void main(String[] args) {
			TicketBooking tickets=new TicketBooking(10, 6);
					Thread t1= new Thread (tickets);
					t1.setName("Atul");
					t1.setPriority(Thread.MAX_PRIORITY);
					t1.start();
				Thread t2= new Thread (tickets);
				t2.setName("Amol");
				t2.setPriority(3);
				t2.start();
			Thread t3= new Thread(tickets);
			t3.setName("Sanket");
			t3.setPriority(5);
			t3.start();
				
				
		}
	}

