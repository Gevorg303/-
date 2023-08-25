import auto.BMW;
import auto.CarAssemblyService;
import auto.Mercedes;
import auto.component.*;
import bank.CurrencyConverter;
import bank.DollarBankAccount;
import bank.RubleBankAccount;
import gentleman.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Машинка--------------");
        CarAssemblyService carAssemblyService = new CarAssemblyService();

        BMW bmw=carAssemblyService.assemblingBMW("BMW", new EngineBMW(2.5),
                new TransmissionBMW("Механическая"),new BodyBMW("Черный"));
        Mercedes mercedes =carAssemblyService.assemblingMercedes("Mercedes", new EngineMercedes(3.0),
                new TransmissionMercedes("Автоматическая"),new BodyMercedes("Желтый"));

        System.out.println(bmw);
        System.out.println(mercedes);

        System.out.println("---------------Банк--------------");
        CurrencyConverter currencyConverter= new CurrencyConverter(92, 0.012);
        DollarBankAccount dollarAccount = new DollarBankAccount(1000);
        RubleBankAccount rubleAccount = new RubleBankAccount(12500);

        System.out.println("Доллоровый счет: "+dollarAccount.getBalance());
        System.out.println("Рублевый счет: "+rubleAccount.getBalance());

        currencyConverter.convertCurrencyDollarToRubleRate(dollarAccount, rubleAccount, 500);
        System.out.println("Доллоровый счет: "+dollarAccount.getBalance());
        System.out.println("Рублевый счет: "+rubleAccount.getBalance());

        currencyConverter.convertCurrencyRubleToDollarRate(rubleAccount, dollarAccount, 10000);
        System.out.println("Доллоровый счет: "+dollarAccount.getBalance());
        System.out.println("Рублевый счет: "+rubleAccount.getBalance());

        System.out.println("---------------Ухажер--------------");
        Candies candies = new Candies(1000);
        Flowers flowers = new Flowers(12000);

        Man petya = new Man("Петя");
        Natasha natasha = new Natasha("Наташа");
        Katya katya = new Katya("Катя");

        natasha.takeCandies(petya.givingCandy(candies));
        katya.takeFlowers(petya.giveFlowers(flowers));

        System.out.println(natasha);
        System.out.println(katya);
    }
}