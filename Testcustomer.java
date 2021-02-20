package OopsAssignment;

public class Testcustomer {

	public static void main(String[] args) {
	Address a=new Address("BTM Layout","Bangalore");
	Address a1=new Address("HSR Layout","Bangalore");

	Customer c1=new Customer();
	c1.setCustomerName("John");
	c1.setResidentialaddress(a);
	System.out.println("Customer Name "+c1.getCustomerName()+"\nResidential Address "+c1.getResidentialaddress());
	
	Customer c2=new Customer("Alex",a1);
	System.out.println(c2.getCustomerDetails());
	}

}
