package interfaces.Transfarable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transformable> transferableList = new ArrayList<>();
        transferableList.add(new Transformer("John"));
        transferableList.add(new Transformer("ball"));
        transferableList.add(new Transformer("socccer"));
        transferableList.add(new Transformer("kaka"));

        for (Transformable transferable : transferableList) {
            transferable.transform();
        }

        for (Transformable transferable : transferableList) {
            if (transferable instanceof Transformer transformer) {
                System.out.println(transformer.getName() + " transformed? " + transformer.isTransformed());
            }
        }
    }
}