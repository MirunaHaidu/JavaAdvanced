package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {

        String string1 = "Arc";
        String string2 = "rac";

        System.out.println(areTheWordsAnagrams(string1, string2));
        System.out.println(areTheWordsAnagrams("asdf", "nbvcd"));
        System.out.println("-------------------------");
        System.out.println(isAnagram(string1, string2));
        System.out.println(areTheWordsAnagrams("asdf", "nbvcd"));


    }

    public static boolean areTheWordsAnagrams(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        char[] arr1 = firstWord.toLowerCase().toCharArray();
        char[] arr2 = secondWord.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                break;
            }
        }
        return true;
    }



    ///////////ESTE MAI EFICIENTA//////////////
    public static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        Map<Character, Integer> frequency = new HashMap<>();


        char[] arr1 = firstWord.toLowerCase().toCharArray();
        char[] arr2 = secondWord.toLowerCase().toCharArray();

        for (int i = 0; i< arr1.length; i++){
            if(frequency.get(arr1[i]) == null){
                frequency.put(arr1[i],  1);
            } else{
                frequency.put(arr1[i], frequency.get(arr1[i])+1);
            }
        }

        Map<Character, Integer> frequency2 = new HashMap<>();
        for (int i = 0; i< arr2.length; i++){
            if(frequency2.get(arr2[i]) == null){
                frequency2.put(arr2[i],  1);
            } else{
                frequency2.put(arr2[i], frequency.get(arr2[i])+1);
            }
        }

        for(Map.Entry<Character, Integer> entry : frequency.entrySet()){
            if (!(frequency.get(entry.getKey()).equals(frequency2.get(entry.getKey())))){
                return false;
            }
        }
        return true;
    }

}
