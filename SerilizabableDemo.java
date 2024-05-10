import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizabableDemo {

	public static void main(String[] args) throws IOException{
		
		File file = new File ("C:\\New folder\\Person.txt");
		FileOutputStream fis= new FileOutputStream(file);
		ObjectOutputStream oos= new ObjectOutputStream(fis);
		Person p=new Person();
		
		p.setName("Atul");
		p.setAge(25);
		p.setAddress("At. narhe Pune  411041");
		p.setSalary(25000.55f);
		
		
		oos.writeObject(p);
		System.out.println("success");
		oos.close();
		
		
		
		
		

	}

}
