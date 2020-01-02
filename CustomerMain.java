import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		List <Customer> allCustomers= new ArrayList<Customer>();
		Customer customer1= new Customer("C001","Gayathri", "Kerala", 9000);
		Customer customer2= new Customer("C002","Kavitha", "Pune", 100);
		Customer customer3= new Customer("C003","Jay", "Delhi", 1000);
		Customer customer4= new Customer("C004","Shrada", "Chennai", 40000);
		allCustomers.add(customer1);
		allCustomers.add(customer2);
		allCustomers.add(customer3);
		allCustomers.add(customer4);
		System.out.println(allCustomers);
		System.out.println("ENter choice 1)name 2)address 3)billamount");
		Scanner scanner = new Scanner(System.in);
		int choice= scanner.nextInt();
		if (choice==3) {
			Collections.sort(allCustomers);
			Iterator <Customer> i= allCustomers.iterator();
			while (i.hasNext()) {
				Customer customer = i.next();
				System.out.println(customer);
				
				
			}
		}
			 if(choice==1) {
				 Collections.sort(allCustomers, new NameComparator());
				 Iterator <Customer> i= allCustomers.iterator();
					while (i.hasNext()) {
						Customer customer = i.next();
						System.out.println(customer);
					}
					
			
		}
			 if(choice==2) {
				 Collections.sort(allCustomers, new Comparator<Customer>() {
					 public int compare(Customer o1, Customer o2) {
					 if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())>0)
							return 0;
							else return -1;
				 }
			 });		 
						 
				 Iterator <Customer> i= allCustomers.iterator();
					while (i.hasNext()) {
						Customer customer = i.next();
						System.out.println(customer);
					}
					
			
		}
		
	//	Iterator <Customer> i= allCustomers.iterator();
		//while (i.hasNext()) {
		//	Customer customer = i.next();
		//	System.out.println(customer);
		//	
			
			 
	//	}
		
			
			
		}
			
		}
		
	



