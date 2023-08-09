import auto.Auto;
import auto.CarAssemblyService;
import auto.Component;
import bank.BankAccount;
import bank.DollarBankAccount;
import bank.RubleBankAccount;
import gentleman.Man;
import gentleman.Woman;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Машинка--------------");
        CarAssemblyService carAssemblyService = new CarAssemblyService();

        Auto auto1 = carAssemblyService.assemblyService("BMW", new Component("BMW","Белый"), new Component("BMW", "2.5"), new Component("BMW","Автоматическая"));
        Auto auto2 = carAssemblyService.assemblyService("Lada", new Component("Lada","Черный"), new Component("Lada","1.6"), new Component("Lada","Механика"));

        System.out.println(auto1);
        System.out.println(auto2);

        System.out.println("---------------Банк--------------");
        BankAccount dollarAccount = new DollarBankAccount(1000, 83);
        BankAccount rubleAccount = new RubleBankAccount(12500, 0.012);

        System.out.println("Доллоровый счет: "+dollarAccount.getBalance());
        System.out.println("Рублевый счет: "+rubleAccount.getBalance());

        dollarAccount.convertCurrency(rubleAccount, 500);
        System.out.println("Доллоровый счет: "+dollarAccount.getBalance());
        System.out.println("Рублевый счет: "+rubleAccount.getBalance());

        rubleAccount.convertCurrency(dollarAccount, 10000);
        System.out.println("Доллоровый счет: "+dollarAccount.getBalance());
        System.out.println("Рублевый счет: "+rubleAccount.getBalance());

        System.out.println("---------------Ухажер--------------");
        Man petya = new Man("Петя");
        Woman natasha = new Woman("Наташа","Хочу цветы");
        Woman katya = new Woman("Катя","Хочу конфеты");

        petya.giveFlowers(natasha);
        petya.givingCandy(katya);
    }
}