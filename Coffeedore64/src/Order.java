import java.util.ArrayList;

public class Order {
    private ArrayList<Item> cart;
    private String customerName;

    public Order(){
        this("Customer");
        cart = new ArrayList<Item>();
    }

    public Order(String customerName){
        this.customerName = customerName;
        cart = new ArrayList<Item>();
    }

    public void addToCart(Item item) {
        if(!item.getName().isEmpty() && item.getPrice() > -1){
            cart.add(item);
        }
    }

    public void removeFromCart(Item item){
        cart.remove(item);
    }

    public double getTotal(){
        double sum = 0.0;
        for (int i = 0; i < cart.size(); i++) {
            sum += cart.get(i).getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.printf("Customer Name: %s\n",customerName);
        for (int i = 0; i < cart.size(); i++) {
            System.out.printf("%s -- $%.2f\n",cart.get(i).getName(),cart.get(i).getPrice());
        }
        System.out.printf("\nTotal: $%.2f\n",getTotal());
    }
}
