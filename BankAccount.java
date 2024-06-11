package Bank;

public class BankAccount {
    // Initializing the Class with fields
   private int accountNumber;
   private String accountHolder;
   private double balance;

   //constructor to use the object
    public BankAccount(int  accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
   public int getAccountNumber(){
       return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
       this.accountNumber = accountNumber;
    }
    public String getAccountHolder(){
       return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
       this.accountHolder = accountHolder;
    }
    public double getBalance(){
       return balance;
    }
    public void setBalance(double balance){
       this.balance = balance;
    }
    // Adding this toString method prevents the memory location from printing and instead prints the values
    public String toString(){
        return "Your account number: " + accountNumber + ". "+ "The account holder: " + accountHolder + ". "+  "Your balance is: " + balance;
    }
}
