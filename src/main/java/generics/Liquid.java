package generics;

public abstract class Liquid {
    private int temperature;
    private String color;

    public Liquid(int temperature, String color) {
        this.temperature = temperature;
        this.color = color;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Liquid{" + "temperature=" + temperature + ", color='" + color + '\'' + '}';
    }
}
