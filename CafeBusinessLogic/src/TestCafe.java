import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafe = new CafeUtil();

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafe.getStreakGoal(10));

        System.out.println("----- Order Total Test-----");
        double[] prices = {10.1, 4.3, 1.0, 8.2};
        System.out.printf("Order total: %.2f \n\n",cafe.getOrderTotal(prices));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafe.displayMenu(menu);
        System.out.println();

        System.out.println("----- Price Chart -----");
        cafe.printPriceChart("Columbian Coffee Grounds",2.00,4);
        System.out.println();

        System.out.println("----- display Menu 2  -----");
        ArrayList<Double> prices2 = new ArrayList<Double>();
        prices2.add(1.50);
        prices2.add(3.50);
        prices2.add(4.50);
        prices2.add(3.50);
        cafe.displayMenu(menu,prices2);
        System.out.println();



        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        cafe.addCustomer(customers);





    }
}
