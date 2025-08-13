package org.example.Head02_OOProgramming.topic03.Enum.PaymentMethodEnum;

public enum PaymentMethod {
    CREDIT_CARD("카드"),
    ACCOUNT_TRANSFER("계좌"),
    MOBILE_PAYMENT("모바일");

    private String displayName;

    private PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
