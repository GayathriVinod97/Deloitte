import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerDeserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Customer customer= new Customer();
		ObjectInputStream stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("deloitte.txt"))));
		customer= (Customer) stream.readObject();
		System.out.println(customer);

	}

}
