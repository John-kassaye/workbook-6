package interfaces.speakable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> speakableList = new ArrayList<>();
        speakableList.add(new Human());
        speakableList.add(new Parrot());
        speakableList.add(new Parrot());
        speakableList.add(new Robot());
        speakableList.add(new Robot());
        speakableList.add(new Robot());
        speakableList.add(new Alien());

        List<Walkable> walkableList = new ArrayList<>();
        walkableList.add(new Alien());
        walkableList.add(new Alien());
        walkableList.add(new Parrot());
        walkableList.add(new Parrot());
        walkableList.add(new Parrot());
        walkableList.add(new Human());
        walkableList.add(new Human());
        walkableList.add(new Robot());
        walkableList.add(new Robot());
        walkableList.add(new Robot());
        walkableList.add(new Robot());

       letThemSpeak(speakableList);
       letThemWalk(walkableList);
    }

     static void letThemSpeak(List<Speakable> speakable){
        for (Speakable speakable1 : speakable){
            speakable1.speak();
        }
    }

     static void letThemWalk(List<Walkable> walkableList){
        for (Walkable walkable : walkableList){
            walkable.walk();
        }
     }
}
