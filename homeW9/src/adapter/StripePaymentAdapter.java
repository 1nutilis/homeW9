package adapter;

public class StripePaymentAdapter implements IPaymentProcessor {
    private StripePaymentService stripeService;
    public StripePaymentAdapter(StripePaymentService stripeService) {
        this.stripeService = stripeService;
    }
    @Override
    public void processPayment(double amount) {
        stripeService.makeTransaction(amount);
    }
    @Override
    public void refundPayment(double amount) {
        // Логика возврата для Stripe
        System.out.println("Refunding payment via Stripe: " + amount);
    }
}

