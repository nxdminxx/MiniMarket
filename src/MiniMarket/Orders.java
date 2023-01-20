package MiniMarket;

import java.util.ArrayList;

public class Orders{

    private int quantity;
    // Customer customer;
    ProductCategory product;
    private double totalPrice;
    ArrayList<ProductCategory> newOrder = new ArrayList<ProductCategory>();
    
    public Orders(){
   
    }

    public Orders(int quantity, ProductCategory prod){
        this.quantity = quantity;
        product = prod;
    }

    public String display(ProductCategory prod){
        return product.toString();
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double calcTotalPrice(double pp) {

        totalPrice = pp * quantity;

        return totalPrice;
    }

    public void setOrderID(String orderID){
        
    }
    public void displayOrder1(String product,int quantity){

        System.out.println("\nYour Order");
        System.out.println("\nProduct \tID \tWeight/Volume \tPrice (RM) \tQuantity \tTotal (RM)");
        System.out.println(product.toString() +"\t\t"+ quantity +"\t"+ "\t"+totalPrice);
    }
   
}