package bankAccountPackage;

public class BankAccount {
    String accountNumber;
    double balance;
    double savingsBalance;
    public static numberOfAccounts(){
        return 10;
    }
    public static totalMoneyInAccounts(){
        return 2000;
    }
    private randomAccountNum(){

    }
    public int getCheckingAccountBalance(){
        return balance;
    }
    public int getSavingAccountBalance(){
        return savingsBalance;
    }
    public depositMula() {
        balance += balance;
        savingsBalance += balance;
    }    
}
