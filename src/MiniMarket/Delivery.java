package MiniMarket;

public class Delivery {
    String address;
    Orders order;
    Delivery(){
        address = "";
    }
    Delivery(String address){
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
