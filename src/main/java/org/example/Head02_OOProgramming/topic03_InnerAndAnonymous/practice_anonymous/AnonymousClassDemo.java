package org.example.Head02_OOProgramming.topic03_InnerAndAnonymous.practice_anonymous;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 execute() 구현부");
            }
        };

        customTask.start();
        customTask.execute();
    }
}
