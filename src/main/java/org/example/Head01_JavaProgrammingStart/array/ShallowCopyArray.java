package org.example.Head01_JavaProgrammingStart.array;

public class ShallowCopyArray {
    public static void main(String[] args) {
        int[] original = {88, 92, 76};
        int[] copy = original;

        copy[0] = 100;

        System.out.println(original == copy);
        System.out.println(original.equals(copy));
    }
}
