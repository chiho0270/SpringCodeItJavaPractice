package org.example.Head02_OOProgramming.topic03.Enum.enumTest;

public class EnumBasicTest {
    public enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {
        for (Level lvl : Level.values()) {
            System.out.println(lvl + " Ordinal=" + lvl.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name() = " + today.name());
    }
}
