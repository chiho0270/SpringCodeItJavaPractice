package org.example.Head02_OOProgramming.topic03_InnerAndAnonymous.nonStaticInnerClass;

public class Outer {
    private int instanceValue = 200;

    class Inner {
        public void printInstanceValue() {
            System.out.println("Outer.instanceValue: " + instanceValue);
        }
    }
}
