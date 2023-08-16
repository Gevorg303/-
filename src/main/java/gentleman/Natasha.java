package gentleman;

import java.util.List;

public class Natasha extends Woman {

    public Natasha(String name) {
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
