package org.example.Head02_OOProgramming.topic03_SOLID.DIP;

public class DipTest {
    public static void main(String[] args) {
        NotificationSender[] sender = new NotificationSender[]{
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };
        for (NotificationSender sen : sender) {
            NotificationService notSer = new NotificationService(sen);
            notSer.notify("Hello World");
        }
    }
}
