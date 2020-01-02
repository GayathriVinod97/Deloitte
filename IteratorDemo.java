import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		Set <String> names= new LinkedHashSet<String>();
		names.add("jay");
		names.add("Veeru");
		names.add("Neha");
		names.add("Spring");
		System.out.println(names);
		Iterator <String> i= names.iterator();
		while (i.hasNext()) {
			String str= i.next();
			if(str=="Neha")
				continue;
			System.out.println(str);
		}
	}

}
