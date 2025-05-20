package finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getWeight() {
        return karat;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
