package auto.component;

public class Transmission {
    private String VIN;
    private String transmissionSystem;

    public Transmission(String VIN, String transmissionSystem) {
        this.VIN = VIN;
        this.transmissionSystem = transmissionSystem;
    }

    @Override
    public String toString() {
        return " Трансмиссия: " + transmissionSystem;

    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getTransmissionSystem() {
        return transmissionSystem;
    }
    public void setTransmissionSystem(String transmissionSystem) {
        this.transmissionSystem = transmissionSystem;
    }
}
