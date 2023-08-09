package bank;

public abstract class BankAccount {
    private double balance;
    private double exchangeRate;

    public BankAccount(double balance, double exchangeRate) {
        this.balance = balance;
        this.exchangeRate = exchangeRate;
    }
    public abstract void convertCurrency(BankAccount bankAccount, double amount);
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public double getBalance() {
        return balance;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
