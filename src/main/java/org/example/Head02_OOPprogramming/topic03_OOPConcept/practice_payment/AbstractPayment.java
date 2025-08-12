package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_payment;

// 인터페이스로 정의된 Payment를 AbstractPayment로 구현
public abstract class AbstractPayment implements Payment{
    // 추상 메소드 : 구현 X, 각 상속받은(자식) 클래스에 구체해줘야 함
    public abstract void pay(double amount);

    // 구체 메소드 : 해당 추상 클래스의 상속받는(자식) 클래스에 공통되는 클래스
    public void cancel(double amount) {
        System.out.println("결제 취소");
    }
}
