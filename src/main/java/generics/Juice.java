package generics;

public class Juice extends Liquid {
    public Juice(int temperature, String color) {
        super(temperature, color);
    }

    @Override
    public String toString() {
        return "Juice{" +
                "temperature=" + super.getTemperature() +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
