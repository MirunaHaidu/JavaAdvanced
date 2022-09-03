package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Sorin");
        names.add("Alexandra");
        names.add("Lucinia");

        for(String name:names){
            System.out.println(name);
        }
        System.out.println("------------");

        names.remove("Alexandra");

        for(String name:names){
            System.out.println(name);
        }
        System.out.println("------------");

        System.out.println(names.isEmpty());
        System.out.println("------------");

        for(String name:names){
            if (name.equals("Sorin")){
                System.out.println("Found you!");
            }
        }
        // acelasi lucru, dar mai simplu:
        if(names.contains("Sorin")){
            System.out.println("Found you!");
        }
        System.out.println("------------");

        //mutam datele din lista intr-un array


        String[] namesAsArray = new String[]{"Miruna", "Alexandra"};
        List<String> namesAsList = Arrays.asList(namesAsArray);

        names.addAll(namesAsList);
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("------------");

        Person person1 = new Person();
        person1.setFirstName("Stefan");
        person1.setLastName("Cernescu");

        Person person2 = new Person();
        person2.setFirstName("Alex");
        person2.setLastName("Ene");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        for (Person person:people){
            if(person.getFirstName().equals("Stefan")){
                System.out.println(person.getLastName());
            }
        }
        System.out.println("------------");


        names.removeAll(List.of("Alexandra", "Sorin"));
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("------------");

        names.clear();
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("------------");

        //Alt tip de lista

        List<String> list = new LinkedList<>(); //diferenta de performanta, in anumite conditii
        //linked list folosit mai mult cand vrei sa adaugi chestii, pt. ca foloseste noduri
        // arr list folosit mai des cand vrei sa dai get, pentru ca nu tre sa parcurga toate elementele
            //pana la elementul pe care il vrei. Arr list ti-l returneaza direct


        //listele mereu pastreaza ordinea la inserare!!!!!

    }
}
