package org.example.Head02_OOProgramming.topic03.Enum.PaymentMethodEnum;

public class PaymentMethodTest {
    public static void main(String[] args) {
        for (PaymentMethod p : PaymentMethod.values()) {
            System.out.println(p.name() + " |Payment Method: " + p.getDisplayName());
        }
    }
}
