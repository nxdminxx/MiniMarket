package MiniMarket;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;

public class Delivery extends Order{
    private static DecimalFormat df = new DecimalFormat("0.00");
    private String deliveryAddress;

    public Delivery () {
        orderID = null;
        customer = new Customer();
        product = null;
        prodQuantity = null;
        deliveryAddress = null;
    }

    public Delivery (Customer customer, ArrayList<Product> product, Vector<Integer> prodQuantity, String deliveryAddress) {
        this.customer = customer;
        this.product = product;
        this.prodQuantity = prodQuantity;
        this.deliveryAddress = deliveryAddress;
    }

    public Delivery (String orderID, Customer customer, ArrayList<Product> product, Vector<Integer> prodQuantity, String deliveryAddress) {
        this.orderID = orderID;
        this.customer = customer;
        this.product = product;
        this.prodQuantity = prodQuantity;
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress () {
        return deliveryAddress;
    }

    public void setDeliveryAddress (String newDeliveryAddress) {
        deliveryAddress = newDeliveryAddress;
    }
    

    public void printReceipt() {
        
        System.out.println("\n");
        System.out.println("---------------------------------JAVA MINI MARKET------------------------------------");
        System.out.println("--------------------------------------RECEIPT----------------------------------------");
        System.out.println(" Customer Name      : " +customer.getCustName());
        System.out.println(" Customer Phone No. : " +customer.getCustPhoneNo());
        System.out.println(" Delivery Address   : " +deliveryAddress);

        System.out.println();
        System.out.println("Qty \tItem \t\t\t\tPrice (RM) \tAmount (RM)");
        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i<product.size(); i++){
            double amount = product.get(i).getProdPrice()*prodQuantity.get(i);

            System.out.print(prodQuantity.get(i));
            System.out.print("\t" +product.get(i).getProdName() +" " +product.get(i).getProdDescription());
            System.out.print("\t\t\t" +df.format(product.get(i).getProdPrice()));
            System.out.println("\t" +df.format(amount));
        }

        System.out.println("-------------------------------------------------------------------------------------");
        this.calcTotalPrice();
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public void calcTotalPrice () {
        double subTotal = 0.0, tax = 0.0, total = 0.0;
        final double TAX = 0.06, DELIVERYFEE = 10.0;
        
        for (int i=0; i<product.size(); i++) {
            double productPrice = product.get(i).getProdPrice();
            double quantity = prodQuantity.get(i);
            subTotal += productPrice*quantity;
        }

        tax = subTotal*TAX;
        total = subTotal + tax;

        int roundingAdjustment;
        double beforeRounding = total%0.1;
        double roundOff = (double) Math.round(beforeRounding * 100) / 100;
        roundOff = roundOff*100;
        if (roundOff > 5)
            roundingAdjustment = (int)roundOff - 5;
        else if (roundOff < 5)
            roundingAdjustment = (int)roundOff;
        else
            roundingAdjustment = 0;

        total = total + DELIVERYFEE - ((double)roundingAdjustment/100);

        System.out.println("\t\t\t\t          Sub Total : " +df.format(subTotal));
        System.out.println("\t\t\t\t           Tax (6%) : " +df.format(tax));
        System.out.println("\t\t\t\tRounding Adjustment : " +"-.0" +roundingAdjustment);
        System.out.println("\t\t\t\t       Delivery Fee : " +df.format(DELIVERYFEE));
        System.out.println("\t\t\t\t Rounded Total (RM) : " +df.format(total));
    }
}
