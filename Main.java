package Bank.Main;
import Bank.BankAccount;
public class Main {
    public static void main(String [] args){
        BankAccount newUser = new BankAccount(3, "Celeste", 1000.00);
        System.out.println(newUser);
    }
}
