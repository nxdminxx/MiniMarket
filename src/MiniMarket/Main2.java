package MiniMarket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main2 {
    public static void main (String[] args) {

        ArrayList<Product> productList = new ArrayList<Product>();
        readFile(productList);
        

        Scanner input = new Scanner(System.in);

        ArrayList<Product> chosenProduct = new ArrayList<Product>();
        Vector<Integer> prodQuantity = new Vector<Integer>();
        Order order;

        System.out.println("------------------Java Mini Market------------------");
        System.out.print  ("Enter Name      : ");
        String name  = input.nextLine();
        System.out.print  ("Enter Phone No. : ");
        String phone = input.nextLine();
        Customer customer = new Customer(name, phone);


        //START Choose Product
        char aodc = 'N'; //add order different category
        do {
            String chosenCategory = null;
            String catInitial = null;

            System.out.println("\n");
            System.out.println("CATEGORY:\n"
                              +"(a)Personal Care\n"
                              +"(b)Frozen Foods\n"
                              +"(c)Canned Foods\n"
                              +"(d)Produced Foods\n");
            do {
                try {
                    System.out.print("Choose a category : ");
                    char category = Character.toLowerCase(input.nextLine().charAt(0));
        
                    switch (category) {
                        case 'a':
                            chosenCategory = "Personal Care";
                            catInitial = "PC";
                            break;
        
                        case 'b':
                            chosenCategory = "Frozen Foods";
                            catInitial = "FF";
                            break;
        
                        case 'c':
                            chosenCategory = "Canned Foods";
                            catInitial = "CF";
                            break;
        
                        case 'd':
                            chosenCategory = "Produced Foods";
                            catInitial = "PF";
                            break;
    
                        default:
                            System.out.println("ERROR: Invalid Input!!");
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: Invalid Input!!");
                }

            } while (chosenCategory==null);


            
            System.out.println("\nNo. \tProduct \tWeight/Volume \tPrice (RM)");
            System.out.println("-------------------------------------------------");

            int count = 0;
            for (int i=0; i<productList.size(); i++) {
                if (productList.get(i).getCategory().equals(chosenCategory)) {
                    count++;
                    System.out.println("("+count+") \t" +productList.get(i).toString());
                }
                        
                else
                    continue;
            }
            System.out.println("-------------------------------------------------");


            //do while for same category
            char aosc = 'N'; //add order same category
            do{
                int itemNo = 0;
                int quantity = 0;
                do {
                    try {
                        System.out.print("\nEnter product no.   : " );
                        itemNo = Integer.parseInt(input.nextLine());                        
        
                        String catCode = catInitial +itemNo;
        
                        for (int i=0; i<productList.size(); i++) {
                            if (productList.get(i).getProdID().equals(catCode)) {
                                System.out.print("\nEnter item quantity : ");
                                quantity = Integer.parseInt(input.nextLine());
        
                                chosenProduct.add(productList.get(i));
                                prodQuantity.add(quantity);
                                break;
                            }
                            
                            else {
                                if (i==(productList.size()-1)) {
                                    itemNo = 0;
                                    System.out.println("ERROR: Invalid Input!!");
                                }
                                    
                                else
                                    continue;
                            }
                        } 
                    } catch (Exception e) {
                        System.out.println("ERROR: Invalid Input!!");
                    }

                } while (itemNo == 0);

                System.out.println();
                do {
                    try {
                        System.out.print("Do you want to add anoter item from the same category?(Y/N) : ");
                        aosc = Character.toUpperCase(input.nextLine().charAt(0));
                        
                        switch (aosc) {
                            case 'Y':
                                break;
                            
                            case 'N':
                                break;
                            
                            default:
                                System.out.println("ERROR: Invalid Input!!");
                        }
                    } catch (Exception e) {
                        System.out.println("ERROR: Invalid Input!!");
                    }

                } while (aosc != 'Y' && aosc != 'N');

            } while (aosc == 'Y');
            
            do {
                try {
                    System.out.print("\nDo you want to add another item from a different category?(Y/N) : ");
                    aodc = Character.toUpperCase(input.nextLine().charAt(0));
    
                    switch (aodc) {
                        case 'Y':
                            break;
                        
                        case 'N':
                            break;
                        
                        default:
                            System.out.println("ERROR: Invalid Input!!");
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: Invalid Input!!");
                }

            } while (aodc != 'Y' && aodc != 'N');
            
        } while (aodc == 'Y'); //END Choose Product


        //START Choose Order Option
        char orderOption = 'n';
        System.out.println("\n");
        System.out.println("Collect Order Option: \n"
                          +"(a)Delivery (Charges RM10)\n"
                          +"(b)Self Pickup (No added charges)\n");
        do {
            try {
                System.out.print("Choose your preferable option : ");
                orderOption = Character.toLowerCase(input.nextLine().charAt(0));
    
                switch (orderOption) {
                    case 'a':
                        System.out.println();
                        System.out.print("Enter your address : ");
                        String address = input.nextLine();
    
                        order = new Delivery(customer, chosenProduct, prodQuantity, address);
                        order.printReceipt();
                        break;
    
                    case 'b':
                        String pickupTime = null;
                        System.out.println();
                        System.out.println("\nPickup Time:"
                                          +"\n(a)10am-12pm"
                                          +"\n(b)2pm-4pm"
                                          +"\n(c)6pm-9pm\n");
                        do {
                            try {
                                System.out.print("Enter your desire pickup time : ");
                                char pickup = Character.toLowerCase(input.next().charAt(0));
        
                                switch (pickup) {
                                    case 'a':
                                        pickupTime = "10am-12pm";
                                        break;
        
                                    case 'b':
                                        pickupTime = "2pm-4pm";
                                        break;
        
                                    case 'c':
                                        pickupTime = "6pm-9pm";
                                        break;
        
                                    default:
                                        System.out.println("ERROR: Invalid Input!!");
                                }
                            } catch (Exception e) {
                                System.out.println("ERROR: Invalid Input!!");
                            }
       
                        } while (pickupTime==null);
    
    
                        order = new PickUp(customer, chosenProduct, prodQuantity, pickupTime);
                        order.printReceipt();
                        break;
    
                    default:
                        orderOption = 'n';
                        System.out.println("ERROR: Invalid Input!!");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Invalid Input!!");
            }
        } while (orderOption == 'n'); //END Choose Order Option

        input.close();
    }


    public static void readFile(ArrayList<Product> productList) {
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("D:\\Java Project\\MiniMarket\\src\\MiniMarket\\Products.txt"));
            String inData = null;

            while ((inData = br.readLine()) != null) {
                StringTokenizer in = new StringTokenizer(inData, ";");
                
                String prodID    = in.nextToken();
                String prodName  = in.nextToken();
                String prodDesc  = in.nextToken();
                double prodPrice = Double.parseDouble(in.nextToken());
                String category  = in.nextToken();

                productList.add(new Product(prodID, prodName, prodDesc, prodPrice, category));
            }
            
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found!!");
        }
        catch (IOException e) {
            System.out.println("ERROR: File Can't Be Read!!");
        }
    }
}
