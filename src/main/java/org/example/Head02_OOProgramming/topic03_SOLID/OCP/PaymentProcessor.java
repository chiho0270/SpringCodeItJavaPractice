package org.example.Head02_OOProgramming.topic03_SOLID.OCP;

public class PaymentProcessor {
    public void pay(Payment payment, double amount) {
        payment.pay(amount);
    }
}