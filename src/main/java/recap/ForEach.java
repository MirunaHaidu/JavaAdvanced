package recap;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {


        List <String> personNames = new ArrayList<>();
        personNames.add("Ioana");
        personNames.add("Stefan");

        for(int i = 0; i<personNames.size(); i++){
            System.out.println(personNames.get(i));
        }

        for(String name:personNames){
            System.out.println(name);
        }
    }
}
