// 1=.Create a simple banking application with the following features:
// * A Bank Account class with fields for account number, account holder name, and balance.
// * Methods to deposit, withdraw, and check the balance.
// * Ensure that the balance cannot go negative.

public class BankAccount {

    private String accountnumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountnumber, String holderName, double initialBalance) {
        this.accountnumber = accountnumber;
        this.holderName = holderName;

        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("low balance");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Withdrawal amount exceeds the current balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }

    public double checkBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    public String getAccountNumber() {
        return accountnumber;
    }

    public String HolderName() {
        System.out.println("AccountHolder Name :" + holderName);
        return holderName;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567890", "KRISHNAMOORTHY", 10000.0);
        
        account.HolderName();
        account.checkBalance();   
        account.deposit(5000.0);  
        account.withdraw(200.0);   
        account.checkBalance();
}
}