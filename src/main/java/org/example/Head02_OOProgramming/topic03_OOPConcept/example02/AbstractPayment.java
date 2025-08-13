package org.example.Head02_OOProgramming.topic03_OOPConcept.example02;

public abstract class AbstractPayment {
    protected void validatePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액이 유효하지 않습니다.");
        }
    }
    protected void validateCancel(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("취소 금액이 유효하지 않습니다.");
        }
    }
    protected abstract void pay(double amount);
    protected abstract void cancel(double amount);
}