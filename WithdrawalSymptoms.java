public class BankAccount{
    double balance;
    public BankAccount(double b){
        balance = b;
    }
    public void withdraw(double w){
        balance = balance - w;
    }
}