class BankAccount {
    //attributes
    static String bankName="Union bank of India";
    private static int totalAccounts=0;
    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    //constructor
    BankAccount(String accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        totalAccounts++;
    }
    //static method to display total accounts
    public static void getTotalAccounts(){
        System.out.println("Total Number of Accounts: "+totalAccounts);
    }

    public void display(){//method to display result

            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Number: "+accountNumber);
            System.out.println("Account Holder Name: "+accountHolderName);
            System.out.println("balance: "+balance);

    }


}
public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("011KP121","Kapil Namdeo",80.000);//call constructor
        BankAccount account2=new BankAccount("011KP125","Pranjal Haswani",2.0);

        if (account1 instanceof BankAccount) {//check instance of an object
            System.out.println("Account1 is an instance of BanKAccount");
        }


        account1.display();
        System.out.println();

        if(account2 instanceof BankAccount){
            System.out.println("Account2 is an instance of BanKAccount");
        }
        account2.display();

        System.out.println();
        BankAccount.getTotalAccounts();


    }
}
