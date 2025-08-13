package org.example.Head02_OOProgramming.topic03.OOPConcept.practice_payment;

public class AccountTransferPayment extends AbstractPayment{
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
}
