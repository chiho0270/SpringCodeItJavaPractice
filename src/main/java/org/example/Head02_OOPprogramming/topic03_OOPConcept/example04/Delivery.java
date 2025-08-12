package org.example.Head02_OOPprogramming.topic03_OOPConcept.example04;

public class Delivery {
    private String trackingNumber;
    private String carrier;

    public Delivery(String trackingNumber, String carrier) {
        this.trackingNumber = trackingNumber;
        this.carrier = carrier;
    }

    public void startDelivery() {
        System.out.println("배송 시작 - 운송장 번호: " + trackingNumber);
    }
}
