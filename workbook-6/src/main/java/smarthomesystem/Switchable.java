package smarthomesystem;

public interface Switchable {
    void turnOn();
    void turnOff();

    default void toggle(){
        System.out.println("Toggling device...");
        turnOff();
        turnOn();
    }
}
