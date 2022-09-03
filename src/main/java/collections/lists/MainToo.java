package collections.lists;

import java.util.ArrayList;
import java.util.List;

public class MainToo {
    public static void main(String[] args) {

    Grocery bakery = new Bakery();
    bakery.setName("Cupcake");
    bakery.setPrice(5);

    Grocery cola = new Drink();
    cola.setName("Coca Cola");
    cola.setPrice(10);

        List<Grocery> groceries = new ArrayList<>();
        groceries.add(bakery);
        groceries.add(cola);
    }
}
