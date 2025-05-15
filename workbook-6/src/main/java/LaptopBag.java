import java.util.ArrayList;
import java.util.List;

public class LaptopBag {
    List<Laptop> laptopList = new ArrayList<>();

    public void add(Laptop laptop){
        laptopList.add(laptop);
    }

    public void print(){
        for (Laptop laptop : laptopList){
            System.out.println(laptop.toString());
        }
    }
}

