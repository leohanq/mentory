package strategy.paymentprocess.solution;

public class PaymentProcessor {

    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}