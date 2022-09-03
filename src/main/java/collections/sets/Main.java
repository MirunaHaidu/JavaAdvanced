package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set <Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        for(Integer number:numbers){
            System.out.println(number);
        }
        //reg: nu pastreaza ordinea la date
        // au ordinea f(x) = x la puterea a 2 a
        System.out.println("-------------");

//        Set <String> setNames = new HashSet<>(); //nu pastreaza ordinea la inserare
        Set<String> setNames = new LinkedHashSet<>();
        setNames.add("George");
        setNames.add("Andrei");
        setNames.add("Alexandra");
        setNames.add("Miruna");
        for (String name:setNames){
            System.out.println(name +" "+ name.hashCode()); //pastreaza ordinea la inserare
        }

    }
}
