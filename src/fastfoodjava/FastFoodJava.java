
package fastfoodjava;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FastFoodJava {

    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("#.00");
        int menuNum;
        char item;
        char other = 'Y', more ='Y';
        double numOrder;
// ENTREE OBJECT
      	menuList entree = new menuList();
	entree.nameA = "JavaChicken";
	entree.priceA = 6.50;
        entree.nameB = "Chicken JavaNuggets";
        entree.priceB = 5.50;
        entree.nameC = "Rainbow FIllet";
        entree.priceC = 6.50;
        entree.nameD = "Double Cheeseburger";
        entree.priceD = 7.00;
        entree.nameE = "Tofu Burger";
        entree.priceE = 3.49;
//SIDE DISH OBJECT
        menuList sideDish = new menuList();
        sideDish.nameA = "Apple Pie";
	sideDish.priceA = 2.49;
        sideDish.nameB = "Butter Spread";
        sideDish.priceB = 2.00;
        sideDish.nameC = "No-salt Fries";
        sideDish.priceC = 1.49;
        sideDish.nameD = "Fun Ice Cream";
        sideDish.priceD = 2.00;
        sideDish.nameE = "Rice Cracker";
        sideDish.priceE = 1.49;
//DRINK OBJECT
        menuList drink = new menuList();
        drink.nameA = "Cafe Mocha";
	drink.priceA = 1.99;
        drink.nameB = "Cafe Latte";
        drink.priceB = 1.99;
        drink.nameC = "Orange Juice";
        drink.priceC = 2.49;
        drink.nameD = "Ice Lemon Tea";
        drink.priceD = 2.49;   
        drink.nameE = "Pepsi";
        drink.priceE = 1.99;
 
//PRINT MENU LIST
    System.out.println("---------------------------------------  "+
            "MyJava Fast Food  ---------------------------------------\n");
    System.out.println("1 - Entree"+"\t\t\t\t2 - Side Dish"+"\t\t\t3 - Drink");
    //A
    System.out.println("a)"+entree.getNameA()+"\t\t$"+df2.format(entree.getPriceA())+
            "\t\ta)"+sideDish.getNameA()+"\t  $"+df2.format(sideDish.getPriceA())+
            "\t\ta)"+drink.getNameA()+"\t $"+df2.format(drink.getPriceA()));
    //B
    System.out.println("b)"+entree.getNameB()+"\t$"+df2.format(entree.getPriceB())+
            "\t\tb)"+sideDish.getNameB()+"\t  $"+df2.format(sideDish.getPriceB())+
            "\t\tb)"+drink.getNameB()+"\t $"+df2.format(drink.getPriceB()));
    //C
    System.out.println("c)"+entree.getNameC()+"\t$"+df2.format(entree.getPriceC())+
            "\t\tc)"+sideDish.getNameC()+"\t  $"+df2.format(sideDish.getPriceC())+
            "\t\tc)"+drink.getNameC()+"\t $"+df2.format(drink.getPriceC()));
    //D
    System.out.println("d)"+entree.getNameD()+"\t$"+df2.format(entree.getPriceD())+
            "\t\td)"+sideDish.getNameD()+"\t  $"+df2.format(sideDish.getPriceD())+
            "\t\td)"+drink.getNameD()+"\t $"+df2.format(drink.getPriceD()));
    //E
        System.out.println("e)"+entree.getNameE()+"\t\t$"+df2.format(entree.getPriceE())+
            "\t\te)"+sideDish.getNameE()+"\t  $"+df2.format(sideDish.getPriceE())+
            "\t\td)"+drink.getNameE()+"\t\t $"+df2.format(drink.getPriceE()));
    System.out.println("\n--------------------------------------------------------------------------------------------------");
// USER INPUT ORDER
    Scanner user = new Scanner (System.in);
    receipt orders = new receipt();
    order orderList = new order();
    
    do{
    System.out.print("Enter the menu number (1 - 3): ");
    menuNum = user.nextInt();
    //NEW OBJECT ORDER IN CLASS RECEIPT
    
    if (menuNum == 1){
        do{
            System.out.print("\tItem (a - e): ");
        item = user.next().charAt(0);
        switch(item){
            case 'a' : 
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                entree.numOrderA = (int) numOrder;
                totalpriceA(entree);
                
                menuList totalOfA = new menuList();
                orders.totalEntreeA = entree.getTotalA();
                
                orderList.setEntreeA(entree.getNameA());
                orderList.setEntreePriceA(orders.totalEntreeA);
                break;
                
                
            case 'b' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                entree.numOrderB = (int) numOrder;
                totalpriceB(entree);
                
                menuList totalOfB = new menuList();
                orders.totalEntreeB = entree.getTotalB();
                
                orderList.setEntreeB(entree.getNameB());
                orderList.setEntreePriceB(orders.totalEntreeB);
                break;
                
            case 'c' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                entree.numOrderC = (int) numOrder;
                totalpriceC(entree);
                
                menuList totalOfC = new menuList();
                totalOfC.getTotalC();
                orders.totalEntreeC = entree.getTotalC();
                
                orderList.setEntreeC(entree.getNameC());
                orderList.setEntreePriceC(orders.totalEntreeC);
                break;  
                
            case 'd' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                entree.numOrderD = (int) numOrder;
                totalpriceD(entree);
                
                menuList totalOfD = new menuList();
                totalOfD.getTotalD();
                orders.totalEntreeD = entree.getTotalD();
                
                orderList.setEntreeD(entree.getNameD());
                orderList.setEntreePriceD(orders.totalEntreeD);
                break; 
                
            case 'e' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                entree.numOrderE = (int) numOrder;
                totalpriceE(entree);
                
                menuList totalOfE= new menuList();
                totalOfE.getTotalE();
                orders.totalEntreeE= entree.getTotalE();
                
                orderList.setEntreeE(entree.getNameE());
                orderList.setEntreePriceE(orders.totalEntreeE);
                break; 
            default :
                System.out.println("This is not valid !");
                break;
        }//switch
        System.out.print("More item (Y-Yes, N-No): ");
        more = user.next().charAt(0);
        }while(more == 'Y');//do
    }//if menuNum == 1
    else if(menuNum == 2){
        do{
            System.out.print("\tItem (a - e): ");
        item = user.next().charAt(0);
        switch(item){
            case 'a' : 
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                sideDish.numOrderA = (int) numOrder;
                totalpriceA(sideDish);
                
                menuList totalOfA = new menuList();
                orders.totalSideDishA = sideDish.getTotalA();
                
                orderList.setSideDishA(sideDish.getNameA());
                orderList.setSideDishPriceA(orders.totalSideDishA);
                break;
            case 'b' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                sideDish.numOrderB = (int) numOrder;
                totalpriceB(sideDish);
                
                menuList totalOfB = new menuList();
                orders.totalSideDishB = sideDish.getTotalB();
                
                orderList.setSideDishB(sideDish.getNameB());
                orderList.setSideDishPriceB(orders.totalSideDishB);
                break;
            case 'c' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                sideDish.numOrderC = (int) numOrder;
                totalpriceC(sideDish);
                
                menuList totalOfC = new menuList();
                orders.totalSideDishC = sideDish.getTotalC();
                
                orderList.setSideDishC(sideDish.getNameC());
                orderList.setSideDishPriceC(orders.totalSideDishC);
                break;            
            case 'd' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                sideDish.numOrderD = (int) numOrder;
                totalpriceD(sideDish);
                
                menuList totalOfD = new menuList();
                orders.totalSideDishD = sideDish.getTotalD();
                
                orderList.setSideDishD(sideDish.getNameD());
                orderList.setSideDishPriceD(orders.totalSideDishD);
                break; 
            case 'e' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                sideDish.numOrderE = (int) numOrder;
                totalpriceE(sideDish);
                
                menuList totalOfE = new menuList();
                orders.totalSideDishE = sideDish.getTotalE();
                
                orderList.setSideDishE(sideDish.getNameE());
                orderList.setSideDishPriceE(orders.totalSideDishE);
                break; 
            default :
                System.out.println("This is not Valid");
                break;
        }//switch
        System.out.print("More item (Y-Yes, N-No) : ");
        more = user.next().charAt(0);
    }while(more == 'Y');
    }//else if menuNum == 2
    else if(menuNum == 3) {
        do{
            System.out.print("\tItem (a - e): ");
        item = user.next().charAt(0);
        switch(item){
            case 'a' : 
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                drink.numOrderA = (int) numOrder;
                totalpriceA(drink);
                
                menuList totalOfA = new menuList();
                orders.totalDrinkA = drink.getTotalA();
                
                orderList.setDrinkA(drink.getNameA());
                orderList.setDrinkPriceA(orders.totalDrinkA);
                break;
            case 'b' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                drink.numOrderB = (int) numOrder;
                totalpriceB(drink);
                
                menuList totalOfB = new menuList();
                orders.totalDrinkB = drink.getTotalB();
                
                orderList.setDrinkB(drink.getNameB());
                orderList.setDrinkPriceB(orders.totalDrinkB);
                break;
            case 'c' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                drink.numOrderC = (int) numOrder;
                totalpriceC(drink);
                
                menuList totalOfC = new menuList();
                orders.totalDrinkC = drink.getTotalC();
                
                orderList.setDrinkC(drink.getNameC());
                orderList.setDrinkPriceC(orders.totalDrinkC);
                break;            
            case 'd' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                drink.numOrderD = (int) numOrder;
                totalpriceD(drink);
                
                menuList totalOfD = new menuList();
                orders.totalDrinkD = drink.getTotalD();
                
                orderList.setDrinkD(drink.getNameD());
                orderList.setDrinkPriceD(orders.totalDrinkD);
                break; 
            case 'e' :
                System.out.print("\tNumber of order: ");
                numOrder = user.nextInt();
                drink.numOrderE = (int) numOrder;
                totalpriceE(drink);
                
                menuList totalOfE = new menuList();
                orders.totalDrinkE = drink.getTotalE();
                
                orderList.setDrinkE(drink.getNameE());
                orderList.setDrinkPriceE(orders.totalDrinkE);
                break; 
            default :
                System.out.println("This is not Valid");
                break;
        }//switch
        System.out.print("More item (Y-Yes, N-No) : ");
        more = user.next().charAt(0);
    }while(more == 'Y');        
    }//else if menuNum == 3
    else{
        System.out.println("This not vvalid !");
    }
    System.out.print("Other menu (Y-Yes, N-No) : ");
    other = user.next().charAt(0);
    }while (other=='Y');
    
    System.out.println("\n ----------Your menu ordered : ----------");

    if ( orderList.entreeA != null ){ //entreeA
        System.out.println(entree.getNameA()+"\t\t$"
        +df2.format(orders.getTotalEntreeA()));
    }
    else{ 
    }
    if ( orderList.entreeB != null ){ //entreeB
        System.out.println(entree.getNameB()+"\t$"
        +df2.format(orders.getTotalEntreeB()));
    }
    else{   
    }
    if ( orderList.entreeC != null ){ //entreeC
        System.out.println(entree.getNameC()+"\t\t$"
        +df2.format(orders.getTotalEntreeC()));
    }
    else{   
    }
    if ( orderList.entreeD != null ){ //entreeD
        System.out.println(entree.getNameD()+"\t$"
        +df2.format(orders.getTotalEntreeD()));
    }
    else{   
    }
    if ( orderList.entreeE != null ){ //entreeE
        System.out.println(entree.getNameE()+"\t\t$"
        +df2.format(orders.getTotalEntreeE()));
    }
    else{  
    }
    
    if ( orderList.sideDishA != null ){ //SideDishA
        System.out.println(sideDish.getNameA()+"\t\t$"
        +df2.format(orders.getTotalSideDishA()));
    }
    else{ 
    }  
    if ( orderList.sideDishB != null ){ //SideDishB
        System.out.println(sideDish.getNameB()+"\t\t$"
        +df2.format(orders.getTotalSideDishB()));
    }
    else{ 
    } 
    if ( orderList.sideDishC != null ){ //SideDishC
        System.out.println(sideDish.getNameC()+"\t\t$"
        +df2.format(orders.getTotalSideDishC()));
    }
    else{ 
    }  
    if ( orderList.sideDishD != null ){ //SideDishD
        System.out.println(sideDish.getNameD()+"\t\t$"
        +df2.format(orders.getTotalSideDishD()));
    }
    else{ 
    } 
    if ( orderList.sideDishE != null ){ //SideDishE
        System.out.println(sideDish.getNameE()+"\t\t$"
        +df2.format(orders.getTotalSideDishE()));
    }
    else{ 
    }
    if ( orderList.drinkA != null ){ //drinkA
        System.out.println(drink.getNameA()+"\t\t$"
        +df2.format(orders.getTotalDrinkA()));
    }
    else{ 
    }  
    if ( orderList.drinkB != null ){ //drinkB
        System.out.println(drink.getNameB()+"\t\t$"
        +df2.format(orders.getTotalDrinkB()));
    }
    else{ 
    }
    if ( orderList.drinkC != null ){ //drinkC
        System.out.println(drink.getNameC()+"\t\t$"
        +df2.format(orders.getTotalDrinkC()));
    }
    else{ 
    }  
    if ( orderList.drinkD != null ){ //drinkD
        System.out.println(drink.getNameD()+"\t\t$"
        +df2.format(orders.getTotalDrinkD()));
    }
    else{ 
    }     
    if ( orderList.drinkE != null ){ //drinkE
        System.out.println(drink.getNameE()+"\t\t\t$"
        +df2.format(orders.getTotalDrinkE()));
    }
    else{ 
    } 
    
    System.out.println("\nYour total charge (plus 5% goverment tax) is : $"+
            df2.format(orders.getOverAllTotal()));

    }//main
    public static void totalpriceA(menuList tot){
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println("\tTotal Price : $"+df2.format(tot.getTotalA()));

    }
    public static void totalpriceB(menuList tot){
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println("\tTotal Price : $"+df2.format(tot.getTotalB()));
    }
       public static void totalpriceC(menuList tot){
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println("\tTotal Price : $"+df2.format(tot.getTotalC())); 
    }
    public static void totalpriceD(menuList tot){
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println("\tTotal Price : $"+df2.format(tot.getTotalD())); 
    }
    public static void totalpriceE(menuList tot){
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println("\tTotal Price : $"+df2.format(tot.getTotalE())); 
    }


    
}//Class FastFoodJava
