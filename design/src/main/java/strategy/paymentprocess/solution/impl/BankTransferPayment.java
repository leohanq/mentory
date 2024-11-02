package strategy.paymentprocess.solution.impl;

import strategy.paymentprocess.solution.PaymentStrategy;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
        // Logic for processing bank transfer payment
    }
}
