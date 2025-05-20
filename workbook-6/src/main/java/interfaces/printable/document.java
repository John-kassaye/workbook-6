package interfaces.printable;

public class document implements Printable {

    @Override
    public void print() {

    }

    public static void printAnything(Printable printable){
        System.out.println("Printing document");
    }
}
