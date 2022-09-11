package collections.maps.someStuff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheoryMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 6, 72, 1, 23);
        Integer sum = 5;

        Map<Integer, Integer> sumOfTwoNumbers = new HashMap<>();

        for (Integer number : list) {
            if (sumOfTwoNumbers.get(number) != null) {
                System.out.println("Key: " + number + "\nValue: " + sumOfTwoNumbers.get(number));
            } else {
                sumOfTwoNumbers.put(sum - number, number);
            }
        }
        System.out.println("------------------");


        map.put("Cernescu", "Stefan");
        map.put("Ene", "Alex");
        map.put("Costiuc", "Sorin");

        System.out.println(map.get("Ene"));


        System.out.println("------------------");

        Map<String, Car> cars = new HashMap<>();
        cars.put("SBC", new Car(Model.Volkswagen, 2008, "Blue"));
        cars.put("ABC", new Car(Model.BMW, 2017, "Black"));
        cars.put("AAA", new Car(Model.AUDI, 2010, "White"));

        System.out.println(cars.get("SBC"));

        System.out.println("------------------");

        Map <Person, Car> newCars = new HashMap<>();

        Person stefan= new Person("Cernescu", "Stefan");
        Person alex = new Person("Ene", "Alex");
        Person sorin = new Person("Costiuc", "Sorin");

        newCars.put(stefan, new Car(Model.Volkswagen, 2021, "Blue"));
        newCars.put(alex, new Car(Model.AUDI, 2022, "Black"));
        newCars.put(sorin, new Car(Model.VOLVO, 2022, "Black"));

        System.out.println(newCars.get(stefan));

        System.out.println("--------------------------");
        //iterate a hashMap

        Map<Integer, Integer> mapper = new HashMap<>();
        mapper.put(1,2);
        mapper.put(2, 2143543);
        mapper.put(3, 34657);
        mapper.put(4, 12324565);
        mapper.put(5, 123254);
        mapper.put(6, 7654);
        mapper.put(7, 6543);

        //iterare prin valori
        for (Integer number :mapper.values()){
            System.out.printf("%d ", number);
        }
        System.out.println("\n--------------------------");

        //iterare prin chei
        for (Integer number :mapper.keySet()){
            System.out.printf("%d ", number);
        }

        //entry set
        System.out.println("\n--------------------------");

        for (Map.Entry<Integer, Integer> entry : mapper.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }




    }
}
