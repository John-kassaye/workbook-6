package interfaces.speakable;

import java.util.List;

public class Human implements Speakable,Walkable{
    @Override
    public void speak() {
        System.out.println("We are speaking!");
    }

    @Override
    public void walk() {
        System.out.println("We are walking");
    }
}
