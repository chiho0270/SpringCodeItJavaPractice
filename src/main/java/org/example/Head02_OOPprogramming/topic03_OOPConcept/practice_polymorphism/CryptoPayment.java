package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_polymorphism;

public class CryptoPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("크립토로: " + amount + "원 결제 완료.");
    }
}
