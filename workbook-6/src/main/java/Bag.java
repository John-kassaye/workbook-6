import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public void print(){
        for (T t : list){
            System.out.println(t.toString());
        }
    }
}
