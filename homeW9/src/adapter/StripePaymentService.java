package adapter;

public class StripePaymentService {
    public void makeTransaction(double totalAmount) {
        System.out.println("Making transaction via Stripe: " + totalAmount);
    }
}

