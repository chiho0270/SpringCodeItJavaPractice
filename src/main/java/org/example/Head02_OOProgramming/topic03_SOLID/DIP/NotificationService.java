package org.example.Head02_OOProgramming.topic03_SOLID.DIP;

public class NotificationService {
    private NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}
