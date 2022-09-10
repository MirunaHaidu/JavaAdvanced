package questions;

public class FoundMissingNumber {
    public static void main(String[] args) {

        int[] list = new int[]{1, 5, 4, 2};
        int[] sortedList = new int[6];

        for (int i = 0; i < list.length; i++) {
            sortedList[list[i]] = list[i];
        }
        for (int i = 1; i < sortedList.length; i++) {
            if (sortedList[i] == 0) {
                System.out.println("Missing element is: " + i);
            }
        }

    }
}
