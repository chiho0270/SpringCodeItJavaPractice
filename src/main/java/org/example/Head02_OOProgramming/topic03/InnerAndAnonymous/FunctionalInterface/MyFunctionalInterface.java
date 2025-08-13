package org.example.Head02_OOProgramming.topic03.InnerAndAnonymous.FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void doSomething();

    default void helper() {
        System.out.println("Helper method");
    }
}
