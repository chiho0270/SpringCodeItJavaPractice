package org.example.Head02_OOPprogramming.topic03_OOPConcept.example01;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
        /**
         * 실제 로직은 다를 것.
         */
    }
}
