import java.util.ArrayList;
import java.util.Scanner;
public class CafeUtil {

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 1; i <= numWeeks ; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for(double price : prices){
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s \n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        Scanner input = new Scanner(System.in);
        while(true){
            String customerName = "";

            while(customerName.isEmpty()){ // Keep asking the user for an input if input is empty or spaces.
                System.out.println("[type 'Exit' to stop adding]");
                System.out.println("Please enter your name:");
                customerName = input.nextLine();
                customerName = customerName.trim();
                System.out.println();
            }
            if(customerName.equalsIgnoreCase("Exit")){
                break;
            }
            System.out.printf("Hello, %s! \n", customerName);
            System.out.printf("There are %d people in front of you \n", customers.size());
            customers.add(customerName);
            System.out.println(customers);
            System.out.println();
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for (int i = 1; i <= maxQuantity ; i++) {
            double newPrice = (price * i) - (0.50 * (i-1)); // Senpai Bonus
            System.out.printf("%d - $%.2f \n" ,i ,newPrice);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        for (int i = 0; i < menuItems.size() ; i++) {
            System.out.printf("%d %s -- $%.2f \n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }
}
