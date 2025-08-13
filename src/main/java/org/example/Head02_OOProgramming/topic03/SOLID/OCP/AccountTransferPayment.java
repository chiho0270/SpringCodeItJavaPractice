package org.example.Head02_OOProgramming.topic03.SOLID.OCP;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체 결제: " + amount + "원");
    }
}
