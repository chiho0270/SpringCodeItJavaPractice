package org.example.Head02_OOProgramming.topic03.OOPConcept.practice_polymorphism;

public class OrderService{
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}
