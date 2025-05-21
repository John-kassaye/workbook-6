package smarthomesystem;

public class SmartLight implements Switchable{
   private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light off");
    }
}
