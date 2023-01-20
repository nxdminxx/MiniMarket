package MiniMarket;

public class CannedFoods extends ProductCategory{
    private String productName;
    public char productID;
    private String productDescription;
    private double productPrice;
    private double totalItemPrice;

    public CannedFoods(String productName,
                        char productID, 
                        String productDesciprtion, 
                        double productPrice){
        this.productName = productName;
        this.productID = productID;
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
        return totalItemPrice;
    }
    public String toString(){
        return productName+ "\t"+productID+"\t  "+productDescription+"\t\t"+productPrice;
    }
}
