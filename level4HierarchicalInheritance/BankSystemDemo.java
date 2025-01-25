package com.Day05Inheritance.level4HierarchicalInheritance;


// Base abstract class
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayAccountType();
}

// Subclass of BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass of BankAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass of BankAccount
class FixedDepositAccount extends BankAccount {
    private int term; // in months
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, int term, double interestRate) {
        super(accountNumber, balance);
        this.term = term;
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Term: " + term + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the hierarchy
public class BankSystemDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.00, 2.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.00, 1000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.00, 12, 5.0);

        savings.displayAccountType();
        savings.displayDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayDetails();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayDetails();
    }
}
