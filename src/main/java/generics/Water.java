package generics;

public class Water extends Liquid {
    public Water(int temperature, String color) {
        super(temperature, color);
    }

    @Override
    public String toString() {
        return "Water{" +
                "temperature=" + super.getTemperature() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
