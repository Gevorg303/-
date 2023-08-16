package bank;

public interface InterfaceCurrencyConverter {
    void convertCurrencyDollarToRubleRate(DollarBankAccount dollarBankAccount, RubleBankAccount rubleBankAccount, double amount);
    void convertCurrencyRubleToDollarRate(RubleBankAccount rubleBankAccount, DollarBankAccount dollarBankAccount, double amount);
}
