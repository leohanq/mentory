package strategy.paymentprocess.solution;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor processor;

        // Choose Credit Card Payment
        processor = new PaymentProcessor(FactoryPayment.createStrategy("creditCard"));
        processor.processPayment(150.00);

        // Choose PayPal Payment
        processor = new PaymentProcessor(FactoryPayment.createStrategy("paypal"));
        processor.processPayment(200.00);

        // Choose Bank Transfer Payment
        processor = new PaymentProcessor(FactoryPayment.createStrategy("bankTransfer"));
        processor.processPayment(300.00);
    }
}
