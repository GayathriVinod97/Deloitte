import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		List names= new ArrayList();
		names.add("Himanshu");
		names.add("Anthony");
		names.add("Swami");
		names.add("Swami");
		System.out.println(names);
		names.add(2,"Reddy");
		System.out.println(names);
		names.remove("Swami");  //first swami gone
		System.out.println(names.isEmpty());
		
	}

}
