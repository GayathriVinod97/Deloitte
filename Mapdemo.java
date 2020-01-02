import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo {
	public static void main(String[] args) {
		HashMap<String , Double>hm= new HashMap<String , Double>();
		hm.put("Joe", new Double(3434.34));
		hm.put("Tom", new Double(123.34));
		hm.put("Jane", new Double(34.34));
		hm.put("Todd", new Double(8633.00));
		hm.put("Ralph", new Double(984.956));
	
	Set set= hm.entrySet();
	Iterator i= set.iterator();
//	while(i.hasNext()) {
	//	Map.Entry me= (Map.Entry)i.next();
//		System.out.println(me.getKey()+": ");
	//  	System.out.println(me.getValue());
//}
	System.out.println();
	double balance=((Double) hm.get("Joe")).doubleValue();
	hm.put("Joe", new Double(balance+1000));
	
	while(i.hasNext()) {
		Map.Entry me= (Map.Entry)i.next();
		System.out.println(me.getKey()+": ");
		System.out.println(me.getValue());
	}
	
	}
	

}
