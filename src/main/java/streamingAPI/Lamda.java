package streamingAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lamda {
    public static void main(String[] args) {

        List<Integer> someNumbers = List.of(1, 2, 6, 2, 1, 3, 7, 2, 1, 12, 6, 7, 8, 8);
        List<Integer> someNewNumbers = new ArrayList<>();

        /////// PRIMA VARIANTA /////////////////
        for (Integer number : someNumbers) {
            if (number % 2 != 1) {
                someNewNumbers.add(number * 2);
            }
        }
        for (Integer number : someNewNumbers) {
            if (number > 20) {
                System.out.println(number);
            }
        }


        ///////////// ASA SE FACE MAI SIMPLU ////////////////
        Integer numberFound = someNumbers.stream()            //daca conditia pe care o dai predicatului
                // e adevarata, pastreaza info
                .filter(number -> number % 2 != 1) //asta e conditia
                .map(number -> number * 2)          // aici inmultim cu 2
                .filter(number -> number > 20)       // aici bagam alta conditie
                .findFirst().orElse(null);  // orElse executa functia indiferent daca gaseste sau nu nr
                                                    // orElseGet executa functia doar daca are nevoie de ea
//                .findFirst().get();     //daca las asa, imi da exceptie daca e null

        System.out.println(numberFound);


        someNumbers.stream()
                .filter(number -> number % 2 != 1)
                .map(number -> number * 2)
                .filter(number -> number > 20)
                .collect(Collectors.toList())  //.toList - version java 11+
                .forEach(number -> System.out.println(number));  //.forEach(System.out::println) - version 11+

        System.out.println("-----------");
        Supplier<Integer> number = getNumberSupplier();  //nu returneaza un Integer, ci un Supplier de Integer
        System.out.println(number.get()); // abia acum a facut calculul 5*5

        System.out.println("-----------");
        Supplier<Integer> supplierImplementation = new SupplierImplementation();
        System.out.println(number.get());
        System.out.println(supplierImplementation.get());
        System.out.println("-----------");

        ///////////  SUPPLIER IMPLEMENTATION ////////////////
        MyFunctionalInterface myFunctionalInterface = () -> {
            System.out.println("Hello");
            System.out.println("Hello again!");
        };// asta a fost instantierea clasei
        myFunctionalInterface.doSomething(); //daca sterg asta, nu mai printeaza nimic
        System.out.println("-----------");

        AnotherInterface anotherInterface = (numbers)-> numbers.stream()
                        .filter(myNumber -> myNumber %2 !=1)
                        .collect(Collectors.toList());

        anotherInterface.filterNumbers(someNumbers)
                .forEach(System.out::println);
        System.out.println("-----------");

        EvenNumbers myInterface = (numbers) -> numbers.stream()
                .filter(myNumber -> myNumber % 2 != 1)
                .map(myNumber -> myNumber * 2)
                .collect(Collectors.toList());
        myInterface.filterNumbers(someNumbers)
                .forEach(System.out::println);

        System.out.println("-------------------");
//        refolosim codul de mai sus

        Calculate calculate = new Calculate(myInterface);
        calculate.getMyEvenNumbers(someNumbers)
                .forEach(System.out::println);



    }
    private static Integer getNumber(){
        return 5*5;
    }

    private static Supplier<Integer> getNumberSupplier() {
        return () -> 5 * 5;
    }
    private static Supplier<Integer> getNumberSupplierTime(){
        // asta ca sa vedem diferenta de timp
        return ()->{
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            return 5*5;
        };
    }
}
