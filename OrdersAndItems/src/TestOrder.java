public class TestOrder {
    public static void main(String[] args) {

        /*-- Declarations --*/
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

            /*-- Creating an object of Item and pass it values by it constructor --*/
        Item item1 = new Item("Mocha",3.2);
        Item item2 = new Item("Drip Coffee",4.0);
        Item item3 = new Item("Latte",3.5);
        Item item4 = new Item("Capuccino",3.0);


        /*-- Adding the items without manipulate the Items List in Order Class directly --*/
        order1.customerName("Cindhuri");
        order1.addItems(item1,item2,item3);
        order1.display();
        order1.ready();

        order2.customerName("Noah");
        order2.addItems(item1,item4);
        order2.display();

        order3.customerName("Faisal");
        order3.addItems(item2);
        order3.display();

        order2.ready();





    }
}
