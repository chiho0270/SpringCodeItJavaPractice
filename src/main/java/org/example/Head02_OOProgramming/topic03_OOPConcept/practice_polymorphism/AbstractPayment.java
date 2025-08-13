package org.example.Head02_OOProgramming.topic03_OOPConcept.practice_polymorphism;

public abstract class AbstractPayment implements Payment{
    public abstract void pay(double amount);
    public void cancel(double amount) {
        System.out.println("결제 취소되었습니다.");
    }
}
