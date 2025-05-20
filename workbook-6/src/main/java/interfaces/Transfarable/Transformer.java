package interfaces.Transfarable;

public class Transformer implements Transformable {
    private String name;
    private boolean transformed;

    public Transformer(String name) {
        this.name = name;
        this.transformed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isTransformed() {
        return transformed;
    }

    @Override
    public void transform() {
        transformed = true;
    }
}
