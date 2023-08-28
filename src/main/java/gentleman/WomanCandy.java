package gentleman;

public class WomanCandy extends Woman {

    public WomanCandy(String name) {
        super(name);
    }

    public void takeCandies(Candies candies){
        getGiftList().add(candies);
        System.out.println(getName()+" получила "+candies);
    }

    @Override
    public String toString() {
        return "Имя девушки: "+getName()+" Список подарков: "+getGiftList();
    }
}
