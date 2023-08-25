package auto;

import auto.component.*;

public abstract class Auto {
    private String brand;
    private Engine engine;
    private Transmission transmission;
    private Body body;
    public Auto(String brand, Engine engine, Transmission transmission, Body body) {
        this.brand = brand;
        this.engine = engine;
        this.transmission = transmission;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Бренд: "+getBrand()+getBody()+getEngine()+getTransmission();
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Body getBody() {
        return body;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
