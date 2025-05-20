package interfaces.Transfarable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transferable> transferableList = new ArrayList<>();
        transferableList.add(new Transformer("John"));
        transferableList.add(new Transformer("ball"));
        transferableList.add(new Transformer("socccer"));
        transferableList.add(new Transformer("kaka"));

        for (Transferable transferable : transferableList){
            transferable.transform();
        }

        for (Transferable transferable : transferableList){
            Transformer transferable1 = (Transformer) transferable;
            System.out.println(transferable1.getName() + "transformed? " + transferable1.isTransformed());
        }
    }
}
