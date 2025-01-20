class BankAccount {
    public String accountNumber; // Public attribute
    protected String accountHolder; // Protected attribute
    private double balance; // Private attribute

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(initialBalance); // Use setter to initialize balance
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) { // Ensure balance is not negative
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. It cannot be negative.");
        }
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. It must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Check your balance or amount.");
        }
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate; // Private attribute for interest rate

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call the constructor of the superclass
        this.interestRate = interestRate;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public attribute
        System.out.println("Account Holder: " + accountHolder); // Accessing protected attribute
        System.out.println("Balance: " + getBalance()); // Accessing balance using getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }

   
    
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("123456789", "John Doe", 1000.0, 5.0);

        // Display account details
        savingsAccount.displayAccountDetails();

        // Deposit money
        savingsAccount.deposit(500.0);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());

        // Withdraw money
        savingsAccount.withdraw(200.0);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());

        
    }
}