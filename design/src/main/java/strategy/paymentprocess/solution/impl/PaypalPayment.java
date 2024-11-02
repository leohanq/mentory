package strategy.paymentprocess.solution.impl;

import strategy.paymentprocess.solution.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic for processing PayPal payment
    }
}
