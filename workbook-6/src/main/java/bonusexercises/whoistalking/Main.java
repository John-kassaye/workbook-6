package bonusexercises.whoistalking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speaker> speakers = new ArrayList<>();
        speakers.add(new Dog());
        speakers.add(new Cat());
        speakers.add(new Cat());
        speakers.add(new Cat());
        speakers.add(new Parrot());

        for (Speaker speaker : speakers){
            System.out.println(speaker.speak());
        }

    }
}
