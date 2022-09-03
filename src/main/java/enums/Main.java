package enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Coffee.DOUBLE_ESPRESSO.getValue());
        System.out.println(Coffee.getByValue("Double espresso"));
        System.out.println(Coffee.getByValue("irish").getPrice());
        System.out.println(Coffee.IRISH.getPrice());
    }
}
