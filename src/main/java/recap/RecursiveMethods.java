package recap;

public class RecursiveMethods {
    public static void main(String[] args) {

        f(1, 1, 8);


    }
    private static int f(int firstNumber, int secondNumber, int n){
        int sum = firstNumber+secondNumber;
        if (sum<n){
            System.out.println(sum);
            return f(sum, firstNumber, n);
        }
        return sum;
    }

}
