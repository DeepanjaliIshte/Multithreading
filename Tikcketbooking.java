

class TicketBooking implements Runnable {
	int avlTicket;
	int resTicket;
	public TicketBooking(int avlTicket, int resTicket) {
		this.avlTicket=avlTicket;
		this.resTicket=resTicket;
	}
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("welcome to ticket Booking:"+t.getName());
		
		if(resTicket<=avlTicket) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(resTicket+"booked for user:"+t.getName());
		System.out.println(avlTicket+"are available");
		}
		else {
			System.out.println("ticket are not availabale");
		}		}}
