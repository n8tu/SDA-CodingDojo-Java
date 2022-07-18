public class BankAccount {
    private double checking_balance;
    private double savings_balance;
    private static int number_of_accounts = 0;
    private static double total_amount_of_money;

    private final long account_number;
    private final long max_account_length = 10000000000L , min_account_length = 1000000000;


    public BankAccount(){
        number_of_accounts++;
        this.account_number = (long) Math.floor(Math.random()*(max_account_length-min_account_length+1)+min_account_length);
    }

    public void setChecking_balance(double checking_balance) {
        this.checking_balance = checking_balance;
        updateTotal_amount_of_money(checking_balance);
    }

    public double getChecking_balance() {
        return checking_balance;
    }

    private void updateTotal_amount_of_money(double amount){
        total_amount_of_money += amount;
    }

    public void setSavings_balance(double savings_balance) {
        this.savings_balance = savings_balance;
        updateTotal_amount_of_money(savings_balance);
    }


    public double getSavings_balance() {
        return savings_balance;
    }

    public void deposit(String account_name,double amount){
        if(account_name.equalsIgnoreCase("checking")){
            checking_balance += amount;
            updateTotal_amount_of_money(amount);
            display();
        }else if(account_name.equalsIgnoreCase("savings")){
            savings_balance += amount;
            updateTotal_amount_of_money(amount);
            display();
        }
    }

    public void withdraw(String account_name,double amount){
        if(account_name.equalsIgnoreCase("checking") && checking_balance >= amount){
            checking_balance -= amount;
            updateTotal_amount_of_money(amount);
            display();
        }else if(account_name.equalsIgnoreCase("savings") && savings_balance >= amount){
            savings_balance -= amount;
            updateTotal_amount_of_money(amount);
            display();
        }else{
            System.out.println("insufficient funds");
            display();
        }
    }

    public void totalMoney(){
        System.out.printf("Account Number: %d\n",account_number);
        System.out.printf("Your total balance is $%.3f \n\n",checking_balance+savings_balance);
    }

    public static int getNumber_of_accounts(){
        return number_of_accounts;
    }

    public static double getTotal_amount_of_money(){
        return total_amount_of_money;
    }

    public long getAccount_number(){
        return account_number;
    }

    public void display(){
        System.out.printf("Account Number: %d\n",account_number);
        System.out.printf("Your Checking Account Balance is : $%.3f\n",checking_balance);
        System.out.printf("Your Savings Account Balance is : $%.3f\n\n",savings_balance);
    }

}
