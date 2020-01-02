import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerSerialisation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	Customer customer= new Customer();
	customer.accept();
	ObjectOutputStream stream= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("deloitte.txt"))));
	stream.writeObject(customer);
	stream.close();
	System.out.println("Data stored");
	
	}

}
