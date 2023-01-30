package MiniMarket;

public class Customer {
	private String custID;
	private String custName, custPhoneNo;
	
	public Customer () {
		custID = null;
		custName = null;
		custPhoneNo = null;
	}
	
	public Customer (String custName, String custPhoneNo) {
		this.custName = custName;
		this.custPhoneNo = custPhoneNo;
	}

	public Customer (String custID, String custName, String custPhoneNo) {
		this.custID = custID;
		this.custName = custName;
		this.custPhoneNo = custPhoneNo;
	}
	
	
    //Accessors
	public String getCustID () {
		return custID;
	}
	
	public String getCustName () {
		return custName;
	}
	
	public String getCustPhoneNo () {
		return custPhoneNo;
	}
	
	
    //Mutators
	public void setCustID (String newCustID) {
		custID = newCustID;
	}
	
	public void setCustName (String newCustName) {
		custName = newCustName;
	}
	
	public void setCustPhoneNo(String newCustPhoneNo) {
		custPhoneNo = newCustPhoneNo;
	}
	
}
