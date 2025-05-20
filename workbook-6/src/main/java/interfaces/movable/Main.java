package interfaces.movable;

public class Main {
    public static void main(String[] args) {
        Movable movable = new Bicycle();
        Movable movable2 = new Car();

        movable.move();
        movable2.move();

    }
}
