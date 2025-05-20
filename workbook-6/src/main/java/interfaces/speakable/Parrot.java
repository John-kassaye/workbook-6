package interfaces.speakable;

public class Parrot implements Speakable, Walkable{
    @Override
    public void speak() {
        System.out.println("The Parrot is Speaking!");
    }

    @Override
    public void walk() {
        System.out.println("Parrot walking?");
    }
}
