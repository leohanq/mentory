package strategy.paymentprocess.problem;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        // Pay using PayPal
        paymentProcessor.processPayment("paypal", 5000);
        // Pay using Credit Card
        paymentProcessor.processPayment("creditCard", 3000);
    }
}
