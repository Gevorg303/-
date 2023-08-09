package bank;

public class DollarBankAccount extends BankAccount{
    public DollarBankAccount(double balance, double exchangeRate) {
        super(balance, exchangeRate);
    }
    @Override
    public void convertCurrency(BankAccount bankAccount, double amount) {
        double convertAmount=amount * getExchangeRate();
        withdraw(amount);
        bankAccount.deposit(convertAmount);
        System.out.println(amount+"$ получилось "+convertAmount+" рублей");
    }
}
