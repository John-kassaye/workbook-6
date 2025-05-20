package interfaces.eater;

public class Dog extends Animals implements Eater{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println( getName() + " is eating. " + getName() + " is " + getAge() + " Years old!");
    }
}
