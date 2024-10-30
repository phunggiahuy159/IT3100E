public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;
    private static final double MIN_BALANCE = 50000.0;
    private static final double WITHDRAWAL_FEE = 5000.0;

    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, MIN_BALANCE);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " VND. New balance: " + balance + " VND.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount - WITHDRAWAL_FEE) >= MIN_BALANCE) {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println("Withdrew: " + amount + " VND with fee of " + WITHDRAWAL_FEE + " VND. New balance: " + balance + " VND.");
        } else {
            System.out.println("Withdrawal denied. Insufficient balance or minimum balance requirement not met.");
        }
    }


    public double getBalance() {
        return balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Owner: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
