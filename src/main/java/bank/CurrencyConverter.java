package bank;

public class CurrencyConverter implements InterfaceCurrencyConverter{
    private double dollarToRubleRate;
    private double rubleToDollarRate;

    public CurrencyConverter(double dollarToRubleRate, double rubleToDollarRate) {
        this.dollarToRubleRate = dollarToRubleRate;
        this.rubleToDollarRate = rubleToDollarRate;
    }
    @Override
    public void convertCurrencyDollarToRubleRate(DollarBankAccount dollarBankAccount, RubleBankAccount rubleBankAccount, double amount) {
        double convertAmount=amount * getDollarToRubleRate();
        dollarBankAccount.withdraw(amount);
        rubleBankAccount.deposit(convertAmount);
        System.out.println(amount+"$ получилось "+convertAmount+" рублей");
    }

    @Override
    public void convertCurrencyRubleToDollarRate(RubleBankAccount rubleBankAccount, DollarBankAccount dollarBankAccount, double amount) {
        double convertAmount=amount * getRubleToDollarRate();
        rubleBankAccount.withdraw(amount);
        dollarBankAccount.deposit(convertAmount);
        System.out.println(amount+" рублей получилось "+convertAmount+"$");
    }
    public double getDollarToRubleRate() {
        return dollarToRubleRate;
    }

    public double getRubleToDollarRate() {
        return rubleToDollarRate;
    }

    public void setDollarToRubleRate(double dollarToRubleRate) {
        this.dollarToRubleRate = dollarToRubleRate;
    }

    public void setRubleToDollarRate(double rubleToDollarRate) {
        this.rubleToDollarRate = rubleToDollarRate;
    }
}
