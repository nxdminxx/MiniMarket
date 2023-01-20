package MiniMarket;

import java.util.ArrayList;

public class Orders{

    private int quantity;
    Customer customer;
    private double totalPrice;
    private static int numOfOrder = 0;
    ProductCategory product;
    
    // ArrayList<Orders> orderList = new ArrayList<Orders>();
    // ArrayList<Orders> orderID = new ArrayList<Orders>(); 


    public Orders(){
        numOfOrder++;
    }

    public Orders(int orderID, int quantity, ProductCategory prod){ 
        this.quantity = quantity;
        product = prod;
    }

    public int getOrderID(){

        return numOfOrder;
    
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double calcTotalPrice(double productPrice) {

        totalPrice = productPrice * quantity;

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