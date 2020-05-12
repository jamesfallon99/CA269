public class BankAccount{
    double balance;
    public BankAccount(double b){
        balance = b;
    }
    public BankAccount(){
        balance = 100.00;
    }
    public void withdraw(double w){
        balance = balance - w;
    }
    
    public void deposit(double d){
        balance = balance + d;
    }
    
    public String toString()
     {
         return "The balance is "  + balance;
 }
    
        public void setBalance(double s){
        balance = s;
    }
    
        public Double getBalance(){
        return balance;
    }
}