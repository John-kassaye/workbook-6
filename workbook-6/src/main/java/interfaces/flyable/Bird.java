package interfaces.flyable;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying super high!!");
    }
}
