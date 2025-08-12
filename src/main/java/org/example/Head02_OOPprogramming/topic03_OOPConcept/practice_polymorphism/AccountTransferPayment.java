package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_polymorphism;

public class AccountTransferPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("계좌 결제: " + amount + "원 완료.");
    }
}