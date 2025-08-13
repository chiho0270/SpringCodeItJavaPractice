package org.example.Head02_OOProgramming.topic03_OOPConcept.practice_businessUser;

public class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("ID: " + userId + ", 이름: " + name);
    }
}

