package MiniMarket;

import java.util.ArrayList;

public class Orders{

    private int quantity;
    Customer customer;
    private double totalPrice;
    private static int numOfOrder = 0;
    ProductCategory product;
    
    ArrayList<ProductCategory> orderList = new ArrayList<ProductCategory>();
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

    public void setOrderID(ProductCategory product){
        // ArrayList myOrder = new ArrayList();
        orderList.add(product);
        
    }
    public String orderToString(){

        return orderList.toString();
    }
    public ArrayList getOrderList(){
        return orderList;
    }
    public void displayOrder1(String product,int quantity){

        System.out.println("\nYour Order");
        System.out.println("\nProduct \tID \tWeight/Volume \tPrice (RM) \tQuantity \tTotal (RM)");
        System.out.println(product.toString() +"\t\t"+ quantity +"\t"+ "\t"+totalPrice);
    }
   
}