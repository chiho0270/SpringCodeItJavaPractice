package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_payment;

public class CreditCardPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}

