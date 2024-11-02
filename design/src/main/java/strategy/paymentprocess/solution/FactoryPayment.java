package strategy.paymentprocess.solution;

import strategy.paymentprocess.solution.impl.BankTransferPayment;
import strategy.paymentprocess.solution.impl.CreditCardPayment;
import strategy.paymentprocess.solution.impl.PaypalPayment;

public class FactoryPayment {

    public static PaymentStrategy createStrategy(String type) {
        return switch (type) {
            case "creditCard" -> new CreditCardPayment();
            case "paypal" -> new PaypalPayment();
            case "bankTransfer" -> new BankTransferPayment();
            default -> throw new IllegalArgumentException("Unsupported payment method: " + type);
        };
    }
}
