package org.example.Head02_OOProgramming.topic03_OOPConcept.practice_businessUser;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        User coU = new BusinessUser("U002", "Arocoro", "noreply@gmail.com", "Google");
        coU.printUserInfo();
    }
}
