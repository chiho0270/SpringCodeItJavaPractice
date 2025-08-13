package org.example.Head02_OOProgramming.topic03.SOLID.SRP;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String userId, String password) {
        if (!userRepository.existsUser(userId)) {
            return false;
        }
        return userRepository.getUserPassword(userId).equals(password);
    }

    public boolean checkAdminPrivilege(String userId) {
        return userId.equals("admin");
    }
}
