public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setSavings_balance(10242);
        account2.setChecking_balance(394);

        account1.display();
        account2.display();

        account1.totalMoney();

        account1.deposit("savings",234);
        account2.withdraw("Savings",2323);

        System.out.println("Total Bank Accounts: " + BankAccount.getNumber_of_accounts());
        System.out.println("Total Money in Bank Accounts: " + BankAccount.getTotal_amount_of_money());
    }
}
