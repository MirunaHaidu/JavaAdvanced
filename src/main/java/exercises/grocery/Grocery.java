package exercises.grocery;

public enum Grocery {
    TV (1200),
    FRIDGE (1000),
    WASHING_MACHINE (1500),
    ESPRESSOR (500);

    private Integer price;
    Grocery(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}
