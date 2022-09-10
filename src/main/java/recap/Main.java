package recap;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Safe safe = new Safe();

        //////NU MERGE////
//        safe.setNumber(0011);
//        System.out.println(safe.getNumber());

        safe.setNumbers(List.of(0,0,1,1));
        System.out.println(safe.getNumbers());



    }


}
