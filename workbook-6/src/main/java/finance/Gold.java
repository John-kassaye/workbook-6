package finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
