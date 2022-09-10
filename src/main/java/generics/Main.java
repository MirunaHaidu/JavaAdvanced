package generics;

public class Main {
    public static void main(String[] args) {
//
//        ////NU MAI MERGE//// pentru ca am pus extends liquid
//        Glass<Integer> glass = new Glass<>();  // primeste doar obiecte, NU int etc.
//
////        glass.setObject("asdfg");
////        glass.doSomething();
//
//        glass.add(21);
//
//        Glass<String> stringGlass = new Glass<>();
//        stringGlass.add("asdfg");
        Glass<Water> waterGlass = new Glass<>();

        System.out.println("--------------------------");

        Cup<Tea> firstCup = new Cup<Tea>();
        firstCup.setLiquid(new Tea(32, "purple"));
        firstCup.drink();

    }
}
