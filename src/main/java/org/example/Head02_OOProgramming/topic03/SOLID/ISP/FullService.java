package org.example.Head02_OOProgramming.topic03.SOLID.ISP;

public interface FullService {
    void orderFood();
    void processPayment();
    void startDelivery();
    void provideCustomerSupport();
    void handleReturns();
}
// 위 사례는 틀린 것. 뭘 하는 것인지 종잡을 수 없다.

/* 각 인터페이스로 나눠서 진행하는 것이 옳다.
public interface OrderService {
    void orderFood();
}

public interface PaymentService {
    void processPayment();
}

public interface DeliveryService {
    void startDelivery();
}

public interface CustomerSupportService {
    void provideCustomerSupport();
    void handleReturns();
}
*/