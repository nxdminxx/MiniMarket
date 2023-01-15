package MiniMarket;
import java.util.ArrayList;

public class Orders {

    private String orderID;
    Customer customer;
    ArrayList<Product> Product;
    
    Orders(){

    }

    Orders(Customer customer,ArrayList<Product> product){
        
    }

    public String getOrderID(){

        return orderID;

    }

    public Customer getCustomer(){

        return customer;
        
    }

    public ArrayList<MiniMarket.Product> getProduct(){

        return Product;

    }

    public double calcTotalPrice(){

        return 0;

    }

    public void setOrderID(String orderID){
        
    }
}
