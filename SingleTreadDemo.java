
public class SingleTreadDemo {

	public static void main(String[] args) throws Exception {
		for(int i=1; i<=100;i++)
		{
			Thread.sleep(2000); 
			System.out.println("Thread:"+i);
		}
	}

}
