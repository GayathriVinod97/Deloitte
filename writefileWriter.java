import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writefileWriter {

	public static void main(String[]args) throws IOException {
		File file =new File("C:\\Deloitte\\Core java\\SecondProject\\src\\filetest.txt");
		FileReader reader= new FileReader(file);
		FileWriter fw= new FileWriter("record.txt");
		int i=0;
		while((i=reader.read())!= -1) {
			fw.write((char)i);
			
		}
	
		
		
		fw.close();
				
	}
}
