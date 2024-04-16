// Create an abstract class Accounts with the following details:
// Data Members: Balance (b) accountNumber (c) accountHoldersName (d) address
// Methods: withdrawl()- abstract , (b) deposit()- abstract , (c) display() to show the balance
// of the account number
// Create a subclass of this class SavingsAccount and add the following details:
// Data Members: (a) rateOfInterest
// Methods: (a) calculateAount()


// Abstract class Accounts
abstract class Accounts {
    // Data Members
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    // Abstract methods
    public abstract void withdrawal(double amount);
    public abstract void deposit(double amount);

    // Method to display balance of the account number
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass SavingsAccount extending Accounts
class SavingsAccount extends Accounts {
    // Data Member
    private double rateOfInterest;

    // Constructor
    public SavingsAccount(double balance, String accountNumber, String accountHoldersName, String address, double rateOfInterest) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.rateOfInterest = rateOfInterest;
    }

    // Method to calculate interest amount
    public double calculateAmount() {
        return balance * (1 + rateOfInterest / 100);
    }

    // Overriding abstract methods
    @Override
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
}

// Main class
public class Problem10 {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(1000, "123456", "John Doe", "123 Main St", 5.0);

        // Display account details
        savingsAccount.display();

        // Deposit money
        savingsAccount.deposit(500);

        // Withdraw money
        savingsAccount.withdrawal(200);

        // Calculate amount with interest
        System.out.println("Amount after interest: " + savingsAccount.calculateAmount());
    }
}
