package interfaces.payable;

public class Invoice implements Payable{
    private int quantity;
    private double price;

    public Invoice(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * price;
    }
}
