package strategy.paymentprocess.solution.impl;

import strategy.paymentprocess.solution.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double  amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic for processing credit card payment
    }
}
