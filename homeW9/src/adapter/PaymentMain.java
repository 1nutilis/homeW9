package adapter;

public class PaymentMain {
    public static void main(String[] args) {
        IPaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        paypalProcessor.processPayment(100.0);
        paypalProcessor.refundPayment(50.0);

        StripePaymentService stripeService = new StripePaymentService();
        IPaymentProcessor stripeAdapter = new StripePaymentAdapter(stripeService);
        stripeAdapter.processPayment(200.0);
        stripeAdapter.refundPayment(100.0);
    }
}
