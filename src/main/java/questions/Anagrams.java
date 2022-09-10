package questions;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String string1 = "Arc";
        String string2 = "rac";

        System.out.println(areTheWordsAnagrams(string1, string2));
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
}
