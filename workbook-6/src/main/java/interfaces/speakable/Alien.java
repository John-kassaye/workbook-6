package interfaces.speakable;

public class Alien implements Speakable, Walkable{
    @Override
    public void speak() {
        System.out.println("Aliens are here");
    }

    @Override
    public void walk() {
        System.out.println("ALiens are walking");
    }
}
