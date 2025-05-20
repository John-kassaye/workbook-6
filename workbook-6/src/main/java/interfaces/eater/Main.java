package interfaces.eater;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Eater> eater = new ArrayList<>();

        eater.add(new Cat("Lewam",9));
        eater.add(new Dog("Jack",4));
        eater.add(new Dog("Potter",4));

        for (Eater eater1 : eater){
            eater1.eat();
        }
    }
}
