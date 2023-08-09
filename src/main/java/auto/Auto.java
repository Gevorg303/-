package auto;
public class Auto {
    private String brand;
    private Component body;/*корпус*/
    private Component engine;/*двигатель*/
    private Component transmission;/*коробка передач */

    public Auto(String brand, Component body, Component engine, Component transmission) {
        this.brand = brand;
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Бренд: "+getBrand()+" Корпус: "+getBody().getName()+" Двигатель: "+getEngine().getName()+" Коробка передач: "+ getTransmission().getName();
    }

    public String getBrand() {
        return brand;
    }

    public Component getBody() {
        return body;
    }

    public Component getEngine() {
        return engine;
    }

    public Component getTransmission() {
        return transmission;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBody(Component body) {
        this.body = body;
    }

    public void setEngine(Component engine) {
        this.engine = engine;
    }

    public void setTransmission(Component transmission) {
        this.transmission = transmission;
    }
}
