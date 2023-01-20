package MiniMarket;

public class Delivery extends Orders{
    private String deliveryAddress; 
    private double deliveryCharge;

    public Delivery(){
    }
    public Delivery(Customer cust, String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public void setDeliveryAddress(String address){
        deliveryAddress = address;
    }

    public double calcDeliveryCharge(double charge){
        
        deliveryCharge = super.calcTotalPrice + charge;
        return deliveryCharge; 
    }

}
