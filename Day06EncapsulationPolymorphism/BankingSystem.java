package com.week2.Day04ClassModeling.Day06EncapsulationPolymorphism;


// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate
    private static final double LOAN_MULTIPLIER = 5; // Loan eligibility = 5 times balance

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan approved for: " + amount);
        } else {
            System.out.println("Loan amount exceeds eligibility");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_MULTIPLIER;
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Kapil Namdeo", 50000);
        BankAccount current = new CurrentAccount("CA456", "Ketan Verma", 100000);

        savings.displayDetails();
        System.out.println("----------------------");

        current.displayDetails();
        System.out.println("Loan Eligibility: " + ((CurrentAccount) current).calculateLoanEligibility());
        ((CurrentAccount) current).applyForLoan(300000);
        System.out.println("----------------------");
    }
}

