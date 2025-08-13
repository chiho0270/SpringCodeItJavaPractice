package org.example.Head02_OOProgramming.topic03_OOPConcept.practice_paymentaccount;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("0보다 커야 합니다.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || balance < amount) throw new IllegalStateException("출금 오류.");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
