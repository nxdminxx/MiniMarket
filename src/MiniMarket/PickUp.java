package MiniMarket;

public class PickUp {
    String pickupTime;
    PickUp(){
        pickupTime = "";
    }
    PickUp(String pickupTime){
        this.pickupTime = pickupTime;
    }
    public String getPickupTime() {
        return pickupTime;
    }
    public void setPickupTime(String pickupTime){
        pickupTime = pickupTime;
    }
}
