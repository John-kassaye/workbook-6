package interfaces.movable;

import java.util.List;

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Driving the car");
    }

    public static void print(List<Movable> movableList){
        for (Movable movable : movableList){
            if (movable instanceof Bicycle){
                Bicycle bicycle = (Bicycle) movable;
                bicycle.move();
            }
        }
    }
}
