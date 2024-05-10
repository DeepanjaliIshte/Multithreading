
public class Runnable_Demo implements Runnable	// 1) implement the runnable interface
{
	//@override 
	public void run()  // 2) override the run() method
	{
		System.out.println("Thread task 2"); // thread task
		
	}
	public static void main(String[] args)
	{
		Runnable_Demo rd=new Runnable_Demo();	//3) Create an object of the class
		
		Thread th=new Thread(rd);// 4)Create an object of thread class and pass the parameter in constructor
		th.start();	//5) Start the thread
	}
}
