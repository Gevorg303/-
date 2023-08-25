package auto.component;

public abstract class Body {
    private String color;

    public Body (String colour) {
        this.color = colour;
    }

    @Override
    public String toString() {
        return " Цвет корпуса: "+getColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
