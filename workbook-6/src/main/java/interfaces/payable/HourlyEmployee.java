package interfaces.payable;

public class HourlyEmployee implements Payable{
    private double hoursWorked;
    public double hourlyRate;

    public HourlyEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double getPaymentAmount() {
        return hoursWorked * hourlyRate;
    }
}
