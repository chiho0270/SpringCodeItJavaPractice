package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_payment;

// CreditCardPayment는 AbstractPayment 상속(확장)받아 메서드 Override로 다른 클래스와 다른 형식의 로직을 수행
public class CreditCardPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}

