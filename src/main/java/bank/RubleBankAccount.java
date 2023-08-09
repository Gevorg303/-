package bank;

public class RubleBankAccount extends BankAccount{
    public RubleBankAccount(double balance, double exchangeRate) {
        super(balance, exchangeRate);
    }
    @Override
    public void convertCurrency(BankAccount bankAccount, double amount) {
        double convertAmount=amount * getExchangeRate();
        withdraw(amount);
        bankAccount.deposit(convertAmount);
        System.out.println(amount+" рублей получилось "+convertAmount+"$");
    }
}
