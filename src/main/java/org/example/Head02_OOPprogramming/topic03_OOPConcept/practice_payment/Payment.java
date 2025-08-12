package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_payment;

// Payment 인터페이스
public interface Payment {
    // 아래 메서드들을 정의 하겠다는 설계, C언어로 따지면 함수 선언문인듯
    void pay(double amount);
    void cancel(double amount);
}
