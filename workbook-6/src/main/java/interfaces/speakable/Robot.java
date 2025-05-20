package interfaces.speakable;

public class Robot implements Speakable,Walkable{
    @Override
    public void speak() {
        System.out.println("The Robot is speaking!");
    }

    @Override
    public void walk() {
        System.out.println("Robot is walking");
    }
}
