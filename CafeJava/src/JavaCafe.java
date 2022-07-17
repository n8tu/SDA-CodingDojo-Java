public class JavaCafe {

    static String pendingMessage = ", your order will be ready shortly";
    static String readyMessage = ", your order is ready";
    static String displayTotalMessage = "Your total is ";
    static String generalGreeting = "Welcome to Cafe Java, ";

    public static void Simulate(double order ,int quantity ,String customer, boolean status){
        if(status){
            System.out.println(customer + readyMessage);
            System.out.println(displayTotalMessage + order*quantity + "$");
        }else{
            System.out.println(generalGreeting + customer);
            System.out.println(customer + pendingMessage);
        }
    }

    public static void main(String[] args) {

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.2;
        double lattePrice = 2.8;
        double cappuccinoPrice = 1.8;


        // Customer name variables (add yours below)
        String customer1 = "Cindhuri" , customer2 = "Sam" , customer3 = "Jimmy" , customer4 = "Noah";


        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;


        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

        Simulate(mochaPrice,1,customer1,isReadyOrder1);
        System.out.println();
        Simulate(cappuccinoPrice,1,customer2,isReadyOrder2);
        System.out.println();
        Simulate(lattePrice,2,customer3,isReadyOrder3);
        System.out.println();
        Simulate(dripCoffeePrice,1,customer4,isReadyOrder4);




    }


}