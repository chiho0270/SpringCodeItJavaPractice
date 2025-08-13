package org.example.Head02_OOProgramming.topic03.OOPConcept.practice_polymorphism;

public class CreditCardPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("계좌 결제: " + amount + "원 완료.");
    }
}