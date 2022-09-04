package collections.lists;

import java.util.ArrayList;
import java.util.List;

public class MainToo {
    public static void main(String[] args) {

    Grocery bakery = new Bakery();
    bakery.setName("Cupcake");
    bakery.setPrice(5);

    Grocery cola = new Drink();
    cola.setName("Coca Cola");
    cola.setPrice(10);

        List<Grocery> groceries = new ArrayList<>();
        groceries.add(bakery);
        groceries.add(cola);


        System.out.println("-------------------");

        LinkedList list = new LinkedList();
        Node node = new Node();
        node.setValue(1);
        node.setNext(null);


        Node node2 = new Node();
        node2.setValue(2);
        node2.setNext(null);


        Node node3 = new Node();
        node3.setValue(3);
        node3.setNext(null);
        list.add(node)
                .add(node2)
                .add(node3);

        list.printList();

    }
}
