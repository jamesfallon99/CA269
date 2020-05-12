public class BankAccount{
    double balance;
    public BankAccount(double b){
        balance = b;
    }
    public void withdraw(double w){
        balance = balance - w;
    }
    
    public void deposit(double d){
        balance = balance + d;
    }
}