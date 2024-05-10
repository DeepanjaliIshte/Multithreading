
 class Test extends Thread {
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
 }

class MultitreadDemo{
	public static void main(String[] args) {
		
	
		Test test=new Test();    //Source
		for(int i=1;  i<=100; i++) {
			Thread t= new Thread(test);
			t.start();
			System.out.println(i);
		}
	}}

