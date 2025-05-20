package interfaces.movable;

public class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("Moving the bicycle");
    }
}
