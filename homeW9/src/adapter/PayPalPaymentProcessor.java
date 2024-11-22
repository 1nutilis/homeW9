package adapter;

public class PayPalPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment via PayPal: " + amount);
    }
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding payment via PayPal: " + amount);
    }
}
