package exercises;

import java.util.*;

public class FirstProblem {
    public static void main(String[] args) {

        int x = 11;
        List<Integer> numbers = Arrays.asList(1,2,2,4,1,7,5,12);
        numbers.sort((a,b)-> a-b);  //ca sa imi dau seama daca a <b sau a>b
//        numbers.sort(Comparator.comparingInt(x2 -> x2)); // acelasi lucru

        //complexitate mare
//        for(int i = 0; i<numbers.size(); i++){
//            for(int j = i+1; j<numbers.size(); j++){
//                if(numbers.get(i)+numbers.get(j) == x){
//                    System.out.println("I have found the number");
//                }
//            }
//        }
        System.out.println("---------------");

        Set<Integer> foundNumbers = new HashSet<>();
        for(int i =0; i<numbers.size(); i++){
            if(foundNumbers.contains(numbers.get(i))){
                System.out.println("I have found the number");
            }else{
                foundNumbers.add(x-numbers.get(i));
            }
        }


    }
}
