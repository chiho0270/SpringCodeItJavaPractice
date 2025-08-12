package org.example.Head02_OOPprogramming.topic03_OOPConcept.practice_businessUser;

public class BusinessUser extends User {
    private String email;
    private String coName;

    public BusinessUser(String id, String name, String email, String coName) {
        super(id, name);
        this.email = email;
        this.coName = coName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
        System.out.println("회사이름: " + coName);
    }
}
