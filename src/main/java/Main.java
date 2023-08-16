import auto.BMW;
import auto.CarAssemblyService;
import auto.Mercedes;
import auto.component.Body;
import auto.component.Engine;
import auto.component.Transmission;
import bank.CurrencyConverter;
import bank.DollarBankAccount;
import bank.RubleBankAccount;
import gentleman.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Машинка--------------");
        CarAssemblyService carAssemblyService = new CarAssemblyService();

        BMW bmw=carAssemblyService.assemblingBMW("BMW","123", new Engine("123",  2.5),
                new Transmission("123","Механическая"),new Body("123", "Черный"));
        Mercedes mercedes =carAssemblyService.assemblingMercedes("Mercedes","543", new Engine("543",  3.0),
                new Transmission("543","Автоматическая"),new Body("543", "Желтый"));

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