package exercises.grocery;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Grocery> groceryList = new HashSet<>();
        groceryList.add(Grocery.FRIDGE);
        groceryList.add(Grocery.TV);
        groceryList.add(Grocery.ESPRESSOR);
        groceryList.add(Grocery.WASHING_MACHINE);
        groceryList.add(Grocery.ESPRESSOR);

        int sum = 0;
        for (Grocery item:groceryList){
            sum+= item.getPrice();
        }
        System.out.println(sum);
    }
}
