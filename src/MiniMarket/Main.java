package MiniMarket;

import java.text.DecimalFormat;
//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args){

            try (Scanner input = new Scanner(System.in)) {

                // All ArrayList used for storing
                ArrayList<ProductCategory> personalcare = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> frozenfood = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> cannedfood = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> producefood = new ArrayList<ProductCategory>();
                ArrayList<Orders> orderList = new ArrayList<Orders>(); 
                ArrayList<Double> totalAllArray = new ArrayList<>();
                ArrayList<Integer> quantityItemArray = new ArrayList<Integer>();

                //Pickup and Delivery Object
                PickUp pickup1 = new PickUp();
                Delivery address1 = new Delivery();

                Orders order1 = new Orders();
                char category;
                char addOrder;
                char addFromCategory;
                String pickUpTime;
                boolean pickUp = false;
                int item,quantity,numItem = 0;
                double totalAll = 0;

                //Object for Personal Care
                ProductCategory shampoo = new PersonalCare("Hair Shampoo",0,"170ml",12.50);
                ProductCategory bodyWash = new PersonalCare("Body Wash",1,"950ml",18.90);
                ProductCategory toothPaste = new PersonalCare("Toothpaste",2,"100g",9.60);
                ProductCategory toothBrush = new PersonalCare("Tooth Brush",3,"50g",5.00);
                ProductCategory faceWash = new PersonalCare("Face Wash",4,"100ml",9.00);
                //save all obj in arrylist personal care
                personalcare.add(shampoo);
                personalcare.add(bodyWash);
                personalcare.add(toothPaste);
                personalcare.add(toothBrush);
                personalcare.add(faceWash);

                //Object for Frozen Foods
                ProductCategory fries = new FrozenFoods("Frozen Fries",0,"1kg",13.00);
                ProductCategory nuggets = new FrozenFoods("Chicken Nuggets",1,"1kg",15.90);
                ProductCategory chicken = new FrozenFoods("Chicken Meat",2,"300g",17.80);
                ProductCategory beef = new FrozenFoods("Beef Meat",3,"300g",19.90);
                ProductCategory pizza = new FrozenFoods("Frozen Pizza",4,"180g",8.15);
                //save all obj in arrylist frozen food
                frozenfood.add(fries);
                frozenfood.add(nuggets);
                frozenfood.add(chicken);
                frozenfood.add(beef);
                frozenfood.add(pizza);

                //Object for Canned Foods
                ProductCategory beans = new CannedFoods("Baked Beans",0,"425g",4.46);
                ProductCategory corn = new CannedFoods("Canned Corn",1,"418g",5.39);
                ProductCategory sardines = new CannedFoods("Sardines",2,"155g",4.65);
                ProductCategory tuna = new CannedFoods("Canned Tuna",3,"150g",8.81);
                ProductCategory tomato = new CannedFoods("Tomato Sauce",4,"220g",4.71);
                //save all obj in arrylist frozen food
                cannedfood.add(beans);
                cannedfood.add(corn);
                cannedfood.add(sardines);
                cannedfood.add(tuna);
                cannedfood.add(beef);
                cannedfood.add(tomato);

                //Object for Produced Foods
                ProductCategory broccoli = new ProduceFoods("Broccoli",0,"500g",12.35);
                ProductCategory potatoes = new ProduceFoods("Red Potatoes",1,"500g",10.65);
                ProductCategory eggplant = new ProduceFoods("ggplants",2,"150g",5.45);
                ProductCategory eggs = new ProduceFoods("Fresh Eggs",3,"12pcs",10.11);
                ProductCategory banana = new ProduceFoods("Fresh Banana",4,"800g",4.90);
                ProductCategory apple = new ProduceFoods("Fresh Apples",5,"500g",8.96);
                //save all obj in arrylist frozen food
                producefood.add(broccoli);
                producefood.add(potatoes);
                producefood.add(eggplant);
                producefood.add(eggs);
                producefood.add(banana);
                producefood.add(apple);

   
                System.out.println("------------------Java Mini Market------------------");
                System.out.print("Enter Name : ");
                String name = input.nextLine();
                System.out.print("Enter Phone No. : ");
                String phone = input.nextLine();
                Customer customer1 = new Customer(phone,name, phone);
                
                do{
                    System.out.println("\nCATEGORY");
                    System.out.println("(a)Personal Care\n(b)Frozen Foods/Meats\n(c)Canned Foods\n(d)Produced Foods");
                    System.out.print("Choose a category : ");
                    category = input.next().charAt(0);
                    switch (category){

                        case 'a': 

                        System.out.println("\nProduct \tID \tWeight/Volume \tPrice (RM)");
                        System.out.println("-------------------------------------------------");

                        personalcare.forEach(System.out::println);

                        System.out.println("-------------------------------------------------");
                        //do while for same category
                        do{
                            System.out.print("\nEnter product ID : " );
                            item = input.nextInt();                        

                            System.out.print("\nEnter item quantity : ");
                            quantity = input.nextInt();

                            insertOrder(personalcare, orderList, order1, item, quantity,totalAllArray,quantityItemArray,numItem);
                            System.out.print("\nDo you want to add anoter item from the same category?(Y/N) : ");
                            addOrder = input.next().charAt(0);

                        }while(addOrder == 'Y');
                        break;

                        case 'b': 

                        System.out.println("\nProduct \tID \tWeight/Volume \tPrice (RM)");
                        System.out.println("-------------------------------------------------");
                        //System.out.println(personalcare);
                        frozenfood.forEach(System.out::println);

                        System.out.println("-------------------------------------------------");
                        //do while for same category
                        do{
                            System.out.print("\nEnter product ID : " );
                            item = input.nextInt();                        

                            System.out.print("\nEnter item quantity : ");
                            quantity = input.nextInt();

                            insertOrder(frozenfood, orderList, order1, item, quantity,totalAllArray,quantityItemArray,numItem);
                            System.out.print("\nDo you want to add anoter item from the same category?(Y/N) : ");
                            addOrder = input.next().charAt(0);

                        }while(addOrder == 'Y');
                        break;

                        case 'c': 

                        System.out.println("\nProduct \tID \tWeight/Volume \tPrice (RM)");
                        System.out.println("-------------------------------------------------");
                        //System.out.println(personalcare);
                        cannedfood.forEach(System.out::println);

                        System.out.println("-------------------------------------------------");
                        //do while for same category
                        do{
                            System.out.print("\nEnter product ID : " );
                            item = input.nextInt();                        

                            System.out.print("\nEnter item quantity : ");
                            quantity = input.nextInt();

                            insertOrder(cannedfood, orderList, order1, item, quantity,totalAllArray,quantityItemArray,numItem);
                            System.out.print("\nDo you want to add anoter item from the same category?(Y/N) : ");
                            addOrder = input.next().charAt(0);

                        }while(addOrder == 'Y');
                        break;

                        case 'd': 

                        System.out.println("\nProduct \tID \tWeight/Volume \tPrice (RM)");
                        System.out.println("-------------------------------------------------");
                        //System.out.println(personalcare);
                        producefood.forEach(System.out::println);

                        System.out.println("-------------------------------------------------");
                        //do while for same category
                        do{
                            System.out.print("\nEnter product ID : " );
                            item = input.nextInt();                        

                            System.out.print("\nEnter item quantity : ");
                            quantity = input.nextInt();

                            insertOrder(producefood, orderList, order1, item, quantity,totalAllArray,quantityItemArray,numItem);
                            System.out.print("\nDo you want to add anoter item from the same category?(Y/N) : ");
                            addOrder = input.next().charAt(0);

                        }while(addOrder == 'Y');
                        break;
                            
                    }
                        
                    System.out.print("\nDo you want to add another item from a different category?(Y/N) : ");
                    addFromCategory = input.next().charAt(0);

                }while(addFromCategory =='Y');
                System.out.print("\nCollect Order Option : \n(a)Delivery (Chargers RM10)\n(b)Pickup (No added chargers)\nChoose your preferable option : ");
                char service = input.next().charAt(0);
                if (service == 'a'){
                    pickUp = false;
                    System.out.print("Enter your address : ");
                    String address = input.next();
                    address1.setAddress(address);
                }else if (service == 'b'){
                    pickUp = true;
                    System.out.println("\nPickup Time \n(a)10am-12pm\n(b)2pm-4pm\n(c)6pm-9pm");
                    System.out.print("Enter your desire pickup time : ");
                    char pickup = input.next().charAt(0);
                    if(pickup == 'a'){
                        pickUpTime = "10am-12pm";
                        pickup1.setPickupTime(pickUpTime);
                    }else if (pickup == 'b'){
                        pickUpTime = "2pm-4pm";
                        pickup1.setPickupTime(pickUpTime);
                    }else if (pickup == 'c'){
                        pickUpTime = "6pm-9pm";
                        pickup1.setPickupTime(pickUpTime);
                    }
                }
                //Display Reciept and My OrderList
                DisplayMyOrderList(totalAllArray,quantityItemArray, order1,customer1,address1,pickUp);
                //Display Total Order
                DisplayTotal(totalAllArray, totalAll,pickUp);
          

            }
            
        }

    private static void DisplayMyOrderList(ArrayList<Double> totalAllArray,ArrayList<Integer> quantityItemArray, Orders order1, Customer customer1, Delivery address1, boolean pickUp) {
        System.out.println("\n------------------------------------Your Receipt-------------------------------------");
        System.out.println("Customer Name : "+customer1.getCustName());
        System.out.println("Customer Phone No. : "+customer1.getCustId());
        if(pickUp == false){
            System.out.println("Delivery Address : "+address1.getAddress());
        }
        System.out.print("\nProduct \tItem \t \t\tPrice/each(RM)\tQuantity\tTotal Price(RM)\n");
        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i<totalAllArray.size(); i++){
            System.out.print(order1.getOrderList().get(i).toString());
            System.out.print("\t\t"+quantityItemArray.get(i));
            System.out.println("\t\t"+df.format(totalAllArray.get(i)));
        }
    }

    private static void DisplayTotal(ArrayList<Double> totalAllArray, double totalAll, boolean pickUp) {
        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i<totalAllArray.size();i++){
            totalAll = totalAll + totalAllArray.get(i);
        }
        System.out.println("Total Price (RM) : "+df.format(totalAll));
        double afterTax = totalAll+(totalAll*0.06);
        double afterDelivery = afterTax + 10;
        if(pickUp == true){
            System.out.println("Total Price after 6% Gov Tax (RM) : "+ df.format(afterTax));
            System.out.println("-------------------------------------------------------------------------------------");
        }else if(pickUp == false){
            System.out.println("Price after 6% Gov Tax (RM) : "+ df.format(afterTax));
            System.out.println("Total Price with Delivery Charges (RM) : "+ df.format(afterDelivery));
            System.out.println("-------------------------------------------------------------------------------------");
        }
        
    }

    private static void insertOrder(ArrayList<ProductCategory> product, ArrayList<Orders> orderList, Orders order1,
            int item, int quantity,ArrayList<Double>totalAllArray,ArrayList<Integer>quantityItemArray,int numItem) {
        numItem = numItem + 1;        
        double productPrice = product.get(item).getProductPrice();
        order1.setQuantity(quantity);
        order1.setOrderID(product.get(item));
        double totalProductPrice = order1.calcTotalPrice(productPrice);
        quantityItemArray.add(Integer.valueOf(quantity));
        totalAllArray.add(Double.valueOf(totalProductPrice));
 
        
    
    }
        
}



