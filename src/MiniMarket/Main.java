package MiniMarket;

//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ///////private final DecimalFormat df = new DecimalFormat("0.00");
    //hello zatii
    //hello dari branch ipah

    public static void main(String[] args){

            try (Scanner input = new Scanner(System.in)) {

                ArrayList<ProductCategory> product = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> personalcare = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> frozenfood = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> cannedfood = new ArrayList<ProductCategory>();
                ArrayList<ProductCategory> producefood = new ArrayList<ProductCategory>();
                
                ArrayList<Orders> MyOrder = new ArrayList<Orders>(); 
                ArrayList<Double> totalAll = new ArrayList<>();
                ArrayList<Integer> totalQty = new ArrayList<>();
                ArrayList<Character> orderList = new ArrayList(); 
                
                Orders order1 = new Orders();
                char category;
                char addOrder;
                char addFromCategory;
                int item;
                int quantity;

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
                
                    do{
                        System.out.println("CATEGORY");
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

                            totalQty.add(quantity);

                            System.out.print("\nDo you want to add anoter item from the same category?(Y/N) : ");
                            addOrder = input.next().charAt(0);

                            orderList.add(addOrder);

                            insertOrder(personalcare, orderList, order1, item, totalQty,totalAll);

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

                            insertOrder(personalcare, orderList, order1, item, totalQty,totalAll);
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

                            insertOrder(personalcare, orderList, order1, item, totalQty,totalAll);
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

                            insertOrder(personalcare, orderList, order1, item, totalQty,totalAll);
                            System.out.print("\nDo you want to add anoter item from the same category?(Y/N) : ");
                            addOrder = input.next().charAt(0);

                        }while(addOrder == 'Y');
                        break;
                            
                    }
                        
                    System.out.print("\nDo you want to add another item from a different category?(Y/N) : ");
                    addFromCategory = input.next().charAt(0);

                }while(addFromCategory =='Y');
      
                // orderList.toArray();
                System.out.println(orderList.toString());
                System.out.println(totalAll);

            }
            
        }

    private static void insertOrder(ArrayList<ProductCategory> product, ArrayList<Character> orderList, Orders order1,
            int item,ArrayList<Integer>totalQty,ArrayList<Double>totalAll) {
        
        //show item name
        String itemName = product.get(item).toString();
        order1.displayOrder1(itemName);

        //calculate total qty
        int productQty = totalQty.get(item);
        order1.setQuantity(productQty);
        totalQty.add(Integer.valueOf(productQty));

        //calculate total qty price
        double productPrice = product.get(item).getProductPrice();
        double totalProductPrice = order1.calcTotalPrice(productPrice);
        totalAll.add(Double.valueOf(totalProductPrice));

        // System.out.println(order1.displayOrder());
        // System.out.println(products);
        // order1.displayOrder1(products,quantity);
        // orderList.add();
        
    
    }
        
}
    /*private static void displayProducts(ArrayList<ProductCategory> personalcare) {
        System.out.println(personalcare.toString());
        // System.out.println(df.format(prodName.getProductPrice()));

        
        orders1.displayOrder;
                        //order.add(order1);
                        //order1.forEach(System.out::println);

    }*/


