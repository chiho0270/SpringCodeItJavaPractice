package org.example.Head02_OOProgramming.topic03_SOLID.OCP;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment[] payments = {
                new CreditCardPayment(),
                new AccountTransferPayment(),
                new MobliePayment()
        };
        double[] paymentAmounts = new double[]{
                10000,
                20000,
                40000
        };
        for (int i = 0; i < payments.length; i++) {
            paymentProcessor.pay(payments[i], paymentAmounts[i]);
        }
    }
}
