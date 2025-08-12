package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_payment;

public abstract class AbstractPayment implements Payment{
    public abstract void pay(double amount);

    public void cancel(double amount) {
        System.out.println("결제 취소: " + amount + "원");
    }
}
