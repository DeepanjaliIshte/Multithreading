
public class MultiThreading_Demo extends Thread	// 1) extends the Thread class
{
	public void run()	// 2) override the run() method
	{
		System.out.println("Thread Task");	//thread task
	}
	public static void main(String[] args) 
	{
		MultiThreading_Demo md=new MultiThreading_Demo();	//3) create an object of the class
		md.start();	//4) Start the thread by using start() method
		// md.start;	// exception
	}

}
