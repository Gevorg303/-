package auto.component;

public class Engine {
    private String VIN;
    private double engineCapacity;/*объем двигателя*/

    public Engine(String VIN, double engineCapacity) {
        this.VIN = VIN;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public String toString() {
        return " Объем двигателя: "+getEngineCapacity();
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
