package gentleman;

public class WomanFlowers extends Woman{

    public WomanFlowers(String name) {
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
