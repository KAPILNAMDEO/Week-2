/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder,
 accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. 
The methods allow interaction with these attributes to modify and view the 
account's state.*/
import java.util.*;
class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;
    //contructor
    BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    //method to deposit amount
    double depositingMoney(double deposit){
        if (deposit < 0) {
            throw new IllegalArgumentException("Deposit cannot be negative.");
        }
        balance=deposit+balance;
        return balance;
    }
    //method to withdraw amount
    double withdrawingMoney(double withdraw) {
        if (withdraw>balance  ) {
            throw new IllegalArgumentException("Withdraw cannot be greater than  balance.");
        }
        balance=balance-withdraw;
        return balance;
    }
    //method to display balance
    void displayCurrentBalance(){
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Account Holder Number: "+accountNumber);
        System.out.println("Account Holder Balance: "+balance);
        
               


    }
    public static void main(String args[]){
        BankAccount bankaccount=new BankAccount("kapil",10121,500.0);
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Deposit Amount: ");
        double deposit=sc.nextDouble();
        bankaccount.depositingMoney(deposit);//update balance after deposit

        System.out.println("Enter WithDraw Amount: ");
        double withdraw=sc.nextDouble();

        bankaccount.withdrawingMoney(withdraw);
        bankaccount.displayCurrentBalance();
        sc.close();


    }

    

}