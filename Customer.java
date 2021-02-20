package OopsAssignment;

public class Customer {
	private String customername;
	private Address residentialaddress;
	public Customer()
	{
		super();
	}
	public Customer(String customername, Address residentialaddress)
	{
		this.customername=customername;
		this.residentialaddress=residentialaddress;
	}
	public String getCustomerName()
	{
		return customername;
	}
	public void setCustomerName(String customername)
	{
		this.customername=customername;
	}
	public Address getResidentialaddress() {
		return residentialaddress;
	}
	public void setResidentialaddress(Address residentialaddress) {
		this.residentialaddress = residentialaddress;
	}
	public String getCustomerDetails()
	{
		return "Customer: "+getCustomerName()+"\n" +"Residential Address: "+getResidentialaddress();
	}

}


