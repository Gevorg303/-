package gentleman;

public class Man implements FlowersInterface, CandiesInterface{
    private String name;
    private Candies candies;
    private Flowers flowers;

    public Man(String name, Candies candies, Flowers flowers) {
        this.name = name;
        this.candies = candies;
        this.flowers = flowers;
    }

    @Override
    public void giveFlowers(WomanFlowers womanFlowers) {
        womanFlowers.takeFlowers(getFlowers());
    }

    @Override
    public void givingCandy(WomanCandy womanCandy) {
        womanCandy.takeCandies(getCandies());
    }

    public Candies getCandies() {
        return candies;
    }

    public void setCandies(Candies candies) {
        this.candies = candies;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public Flowers getFlowers() {
        return flowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
