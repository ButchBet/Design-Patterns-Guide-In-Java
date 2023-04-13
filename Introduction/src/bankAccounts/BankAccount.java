package bankAccounts;

public class BankAccount {
    public String name;
    public Double balance;
    
    public BankAccount(){}
    
    public BankAccount(String name) {
        this.name = name;
    }
    
    public BankAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(Double money) {
        this.balance += money;
    }
    
    public void withdraw(Double money) {
        this.balance -= money;
    }
    
    public String toString(){
        return "Name: " + name + "\nBalance: " + balance;
    }
}
