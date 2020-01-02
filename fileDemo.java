import java.io.File;
import java.io.IOException;

public class fileDemo {

	public static void main(String[] args) throws IOException {
	
	File file= new File("C:\\Deloitte\\Core java\\SecondProject\\src\\Batch\\BatchMates.txt");
	
	file.createNewFile();
	File folder2= new File("C:\\Deloitte\\Core java\\SecondProject\\src\\Batch");
	String[] all= folder2.list();
	for (String a : all) {
		System.out.println(a);
	}
	File[] file1= folder2.listFiles();
	for(File file2 : file1 ) {
		if(file2.isFile()) {
			System.out.println(file2 +" is a file");
		
	}
		else if(file2.isDirectory()) {
			System.out.println(file2 +" is a folder");
		
	}
	
	}	
	
	

	}

}
