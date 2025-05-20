package generics;

public class Chihuahua {
    private String name;

    public Chihuahua(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "generics.Chihuahua: " + name;
    }
}
