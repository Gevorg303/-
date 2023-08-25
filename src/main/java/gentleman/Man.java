package gentleman;

public class Man implements FlowersInterface, CandiesInterface{
    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public Flowers giveFlowers(Flowers flowers) {
        return flowers;
    }

    @Override
    public Candies givingCandy(Candies candies) {
        return candies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
