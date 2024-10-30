public class Main {
    public static void main(String[] args) {

        BankAccount test_acc = new BankAccount("Ta Hai Tung", "20235527", 100000);

        System.out.println("Initial balance: " + test_acc.getBalance() + " VND");
        test_acc.deposit(50000);
        test_acc.withdraw(30000);
        test_acc.withdraw(200000);
        System.out.println("Final balance: " + test_acc.getBalance() + " VND");

        test_acc.displayAccountInfo();
    }
}
