package strategy.paymentprocess.problem;

public class PaymentProcessor {

    public void processPayment(String method, double amount) {
        switch (method) {
            case "creditCard" -> processCreditCardPayment(amount);
            case "paypal" -> processPaypalPayment(amount);
            case "bankTransfer" -> processBankTransferPayment(amount);
            default -> throw new IllegalArgumentException("Unsupported payment method: " + method);
        }
    }

    private void processCreditCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic for processing credit card payment
    }

    private void processPaypalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic for processing PayPal payment
    }

    private void processBankTransferPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
        // Logic for processing bank transfer payment
    }
}
