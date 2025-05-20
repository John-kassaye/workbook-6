package interfaces.eater;

public class Cat extends Animals implements Eater {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println( getName() + " is eating. " + getName() + " is " + getAge() + " Years old!");
    }
}
