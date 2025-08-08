package org.example.Head01_JavaProgrammingStart.example06;

public class LoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        int count = 0;
        while (count < 3) {
            System.out.println("count = " + count);
            count++;
        }
    }
}
