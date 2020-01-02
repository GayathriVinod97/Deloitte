import java.io.File;
import java.io.IOException;

public class fileDemo {

	public static void main(String[] args) throws IOException {
	
	File file= new File("C:\\Deloitte\\Core java\\SecondProject\\src\\Batch\\BatchMates.txt");
	
	
	File folder2= new File("C:\\Deloitte\\Core java\\SecondProject\\src\\Batch");
	if(file.exists()) {
		file.delete();
	}
	else {
		file.createNewFile();
	
	
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

}
