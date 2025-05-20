package interfaces.payable;

public class Freelance implements Payable{
    @Override
    public double getPaymentAmount() {
        return 900;
    }
}
