package auto.component;

public class Body {
    private String VIN;
    private String color;

    public Body(String VIN, String colour) {
        this.VIN = VIN;
        this.color = colour;
    }

    @Override
    public String toString() {
        return " Цвет корпуса: "+getColor();
    }

    public String getColor() {
        return color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
