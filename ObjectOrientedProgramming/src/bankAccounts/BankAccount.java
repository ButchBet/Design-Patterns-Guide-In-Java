package bankAccounts;

public class BankAccount {
    private String name;
    private Double balance;
    
    public BankAccount(){}
    
    public BankAccount(String name) {
        this.name = name;
    }
    
    public BankAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public void deposit(Double money) {
        if(money > 0) {
            this.balance += money;
        }
    }
    
    public void withdraw(Double money) {
        if(this.getBalance() - money < 0 ) {
            this.balance = 0.0;
        } else {
            this.balance -= money;
        }
    }
    
    public String toString(){
        return "Name: " + name + "\nBalance: " + balance;
    }
}
