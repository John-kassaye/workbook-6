package bonusexercises.whisperer;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
    List<T> list = new ArrayList<>();

    public void add(T lists){
        list.add(lists);
    }
    public void print(){
        for (T t : list){
            System.out.println(t);
        }
    }
}
