package collections.maps.someStuff;

import collections.maps.someStuff.Model;

public class Car {
    private Model model;
    private Integer year;
    private String color;


    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public Car (final Model model, final Integer year, final String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
