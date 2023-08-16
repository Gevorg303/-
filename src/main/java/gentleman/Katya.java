package gentleman;

import java.util.List;

public class Katya extends Woman{

    public Katya(String name) {
        super(name);
    }
    public void takeFlowers(Flowers flowers){
        getGiftList().add(flowers);
        System.out.println(getName()+" получила "+flowers);
    }
    @Override
    public String toString() {
        return "Имя девушки: "+getName()+" Список подарков: "+getGiftList();
    }
}
