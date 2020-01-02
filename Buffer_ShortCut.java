import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_ShortCut {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader= new BufferedReader(new FileReader(new File("record.txt")));

		BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(new File("new.txt")));
		int i=0;
		while((i=bufferedReader.read())!= -1) {
			bufferedWriter.write((char)i);
			
		}
		bufferedReader.close();
		bufferedWriter.close();

	}

}
