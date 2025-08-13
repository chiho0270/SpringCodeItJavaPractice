package org.example.Head02_OOProgramming.topic03_SOLID.DIP;

public class EmailNotificationSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: " + message);
    }
}
