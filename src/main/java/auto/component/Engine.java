package auto.component;

public abstract class Engine {
    private double engineCapacity;/*объем двигателя*/

    public Engine(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    @Override
    public String toString() {
        return " Объем двигателя: "+getEngineCapacity();
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
