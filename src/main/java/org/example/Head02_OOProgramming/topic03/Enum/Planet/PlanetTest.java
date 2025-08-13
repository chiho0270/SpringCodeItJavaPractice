package org.example.Head02_OOProgramming.topic03.Enum.Planet;

public class PlanetTest {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println("Planet: " + p.toString());
        }
    }
}
