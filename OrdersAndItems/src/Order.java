import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItems(Item... item){
        for (int i = 0; i < item.length; i++) {
            if (!item[i].name.isEmpty() && item[i].price > -1) {
                items.add(item[i]);
                this.ready = false;
            }
        }
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void customerName(String name){
        this.name = name;
    }

    public double getTotal(){
        double sum = 0.0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).price;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void ready(){
        ready = true;
        System.out.printf("%s's order is ready! \n\n",name);
    }

    public boolean isReady(){
        return ready;
    }

    public void display(){
        System.out.printf("%s's order: \n",name);
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s -- $%.2f \n",items.get(i).name ,items.get(i).price);
        }
        System.out.printf("\nTotal order:  $%.2f \n\n",getTotal());
    }
}
