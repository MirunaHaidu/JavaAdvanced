package generics;

import java.util.ArrayList;
import java.util.List;

public class Glass<T extends Liquid> {
//    private T object;

//    public T getObject() {
//        return object;
//    }

//    public void setObject(T object) {
//        this.object = object;
//    }
//
//    public void doSomething(){
//        System.out.println(object);
//    }

    private List<T> object;

    public void add(T newObject){
        object.add(newObject);
    }

    public Glass() {
        this.object = new ArrayList<>();
    }
}
