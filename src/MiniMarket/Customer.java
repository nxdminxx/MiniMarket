package MiniMarket;

public class Customer {
   private String custID;
   private String custName;
   private String custPhoneNo;
   
   Customer(){

   }
    
   public Customer(String custID, String custName, String custPhoneNo){
    this.custID = custID;
    this.custName = custName;
    this.custPhoneNo = custPhoneNo;
    }

    public String getCustId(){
        return custID;
    }
    public String getCustName()
    {
        return custName;
    }
    public String getCustPhoneNo(){
        return custPhoneNo;
    }
    public void setCustID(String newID){
        custID = newID;
    }
    public void setCustName(String newName){
        custName = newName;
    }
    public void setPhone(String newPhone){
        custPhoneNo = newPhone;
    }

    public String toString(){

        return custID+ "\t"+custName+"\t  "+custPhoneNo;
    }

}
