package MiniMarket;

abstract class ProductCategory{
    
    abstract String getProductName();
    abstract int getProductID();
    abstract String getProductDescription();
    abstract double getProductPrice();
    abstract double getTotalItemPrice();
    //public ProductCategory get(int item);
}