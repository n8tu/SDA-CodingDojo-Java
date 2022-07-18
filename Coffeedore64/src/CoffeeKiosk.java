import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(Item... item){
        for (int i = 0; i < item.length; i++) {
            if(!item[i].getName().isEmpty() && item[i].getPrice() > -1){
                menu.add(item[i]);
            }
        }
    }


    public void displayMenu(){
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d %s -- $%.2f \n",i , menu.get(i).getName(), menu.get(i).getPrice());
        }
        System.out.println();
    }

    public void newOrder(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter customer name for new order:");
        String name = input.nextLine();
        Order order = new Order(name);

        displayMenu();
        String itemNumber;
        do{
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = input.nextLine();
            if(!itemNumber.equalsIgnoreCase("q")){
                order.addToCart(menu.get(Integer.parseInt(itemNumber)));
            }
        }while(!itemNumber.equalsIgnoreCase("q"));

        orders.add(order);
        order.display();
    }
}
