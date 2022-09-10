package generics;

public class Cup<E extends Liquid> {
    private E liquid;


    public Cup() {
    }

    public Cup(E liquid) {
        this.liquid = liquid;
    }

    public E getLiquid() {
        return liquid;
    }

    public void setLiquid(E liquid) {
        this.liquid = liquid;
    }

    public void drink() {
        System.out.println("I am drinking " + liquid);
    }
}
