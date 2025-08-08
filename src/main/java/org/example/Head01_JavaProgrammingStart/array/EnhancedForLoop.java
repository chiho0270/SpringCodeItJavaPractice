package org.example.Head01_JavaProgrammingStart.array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Bird", "Penguin",
                "Person", "Monkey", "Mouse", "Lizard",
                "Snack", "Bear", "Bee", "Boar",
                "Sheep", "Fox", "Chicken", "Cow",
                "Shark", "Tiger", "Turtle", "Wolf"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
