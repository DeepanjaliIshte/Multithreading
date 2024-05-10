 // Controlling Current thread.
public class CurrentTreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread:"+t);
		
		//change the name of the thread.
		
		t.setName("My Thread");
		
		System.out.println("After name changed: "+t);
		
		for(int n=5; n>0; n--) {
			System.out.println(n);
			Thread.sleep(100);
		}
		System.out.println("Main thread interrupted");
		
	}

}
