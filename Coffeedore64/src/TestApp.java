public class TestApp {
    public static void main(String[] args) {
        CoffeeKiosk app = new CoffeeKiosk();
        app.addMenuItem(
                new Item("Drip Coffee",4.5),
                new Item("Latte",3.5),
                new Item("Americano",3.2),
                new Item("Iced Latte",4.1),
                new Item("Cappuccino",2.9),
                new Item("Water",0.5)
        );

        app.newOrder();
    }
}
