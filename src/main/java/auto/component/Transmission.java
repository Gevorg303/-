package auto.component;

public abstract class Transmission {
    private String transmissionSystem;

    public Transmission(String transmissionSystem) {
        this.transmissionSystem = transmissionSystem;
    }

    @Override
    public String toString() {
        return " Трансмиссия: " + transmissionSystem;

    }

    public String getTransmissionSystem() {
        return transmissionSystem;
    }
    public void setTransmissionSystem(String transmissionSystem) {
        this.transmissionSystem = transmissionSystem;
    }
}
