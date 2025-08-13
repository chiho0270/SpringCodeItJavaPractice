package org.example.Head02_OOProgramming.topic03.SOLID.DIP;

public class SmsNotificationSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("SMS 전송: " + message);
    }
}
