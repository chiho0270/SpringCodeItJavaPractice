package org.example.Head02_OOProgramming.topic03.SOLID.OCP;

public class MobliePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("모바일 결제: " + amount + "원");
    }
}
