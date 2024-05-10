import java.io.*;

public class Deserilization {

	public static void main(String[] args) throws IOException, Exception {
		File file = new File ("C:\\New folder\\Person.txt");
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Object o=ois.readObject(); //upcasting
		Person p =(Person)o;
		
		System.out.println(p);
		
		

	}

}
