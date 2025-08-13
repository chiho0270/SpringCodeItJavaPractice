package org.example.Head02_OOProgramming.topic01AndTopic02.example02_varargs;

public class VarargsExample {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.print(1, 2);
    }
}

class Example {
    void print(int a, int b) {}
    void print(int... nums) {}
}
