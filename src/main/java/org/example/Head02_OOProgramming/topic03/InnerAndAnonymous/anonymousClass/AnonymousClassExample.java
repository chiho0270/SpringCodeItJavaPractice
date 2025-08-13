package org.example.Head02_OOProgramming.topic03.InnerAndAnonymous.anonymousClass;

public class AnonymousClassExample {
    public static void main(String[] args) {
        EventListener listener = new EventListener() {
            @Override
            public void onEvent(String eventData) {
                System.out.println("이벤트 발생: " + eventData);
            }
        };

        EventListener listener2 = new EventListener() {
            @Override
            public void onEvent(String eventData) {
                System.out.println("이벤트 발생2: " + eventData);
            }
        };

        simulateEvent("USER_LOGIN", listener);
        simulateEvent("USER_LOGIN", listener2);
    }

    public static void simulateEvent(String eventData, EventListener listener) {
        listener.onEvent(eventData);
    }
}
