import java.util.Comparator;

public class AddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getCustomerAddress().compareTo(c2.getCustomerAddress())>0)
		return 0;
		else return -1;
		
		
	}

}
