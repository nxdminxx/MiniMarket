package MiniMarket;

import java.util.ArrayList;
import java.util.Vector;

public abstract class Order{
    String orderID;
    Customer customer;
    ArrayList<Product> product;
    Vector<Integer> prodQuantity;

    static int numOfOrder = 0;

    
    public abstract void printReceipt();
    public abstract void calcTotalPrice();
}