package org.example.Head02_OOProgramming.topic03_SOLID.SRP;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String userId, String password) {
        userRepository.saveUser(userId, password);
        System.out.println("사용자 [" + userId + "] 등록 완료");
    }

    public String findPassword(String userId) {
        return userRepository.getUserPassword(userId);
    }
}
