package org.example.Head02_OOProgramming.topic03.OOPConcept.practice_paymentaccount;

public class PaymentServiceTest {
    public static void main(String[] args) {
        //UserAccount 객체 생성
        UserAccount account = new UserAccount("basic1", 30000d);
        //PaymentService 객체 생성
        PaymentService service = new PaymentService();

        // 정상 입급 테스트
        service.processPayment(account, 10000d);

        //sout 잔액 조회
        System.out.println("잔액 조회: " + account.getBalance());

        //1. 음수 입금 테스트
        try {
            account.deposit(-5000d);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 (음수 입금): " + e.getMessage());
        }

        //2. 음수 출금 테스트
        try {
            service.processRefund(account, -10000d);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생 (음수 출금): " + e.getMessage());
        }

        //3. 잔액 부족 출금 테스트
        try {
            service.processPayment(account, 205000d);
        } catch (IllegalStateException e) {
            System.out.println("예외 발생 (출금 잔액 부족): " + e.getMessage());
        }

        //4. 정상 결제
        service.processPayment(account, 10000d);

        //5. 정상 환불
        service.processRefund(account, 10000d);
    }
}
