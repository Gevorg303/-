package gentleman;

public class Man implements ManInterface{
    private String name;

    public Man(String name) {
        this.name = name;
    }
    @Override
    public void giveFlowers(Woman woman) {
        System.out.println(getName() + " дарит цветы " + woman.getName());
    }

    @Override
    public void givingCandy(Woman woman) {
        System.out.println(getName() + " дарит цветы " + woman.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
