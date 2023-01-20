package MiniMarket;

public class PersonalCare extends ProductCategory{
    private String productName;
    public int productID;
    private String productDescription;
    private double productPrice;
    //private double totalItemPrice;

    public PersonalCare(String productName,
                        int i, 
                        String productDesciprtion, 
                        double productPrice){
        this.productName = productName;
        this.productID = i;
        this.productDescription = productDesciprtion;
        this.productPrice = productPrice;

    }

    public String getProductName() {
        return productName;
    }
    
    public int getProductID() {
        return productID;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public double getTotalItemPrice(){
        return productPrice;
    }
    public String toString(){
        return productName+ "\t"+productID+"\t  "+productDescription+"\t\t"+productPrice;
    }
}
