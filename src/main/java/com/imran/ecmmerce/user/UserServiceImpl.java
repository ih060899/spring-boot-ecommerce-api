package com.imran.ecmmerce.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String username) {
        return userRepository.findById(username).get();
    }

    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return userRepository.findById(user.getUsername()).get();
    }

    @Override
    public List<User> deleteUser(String username) {
        userRepository.deleteById(username);
        return userRepository.findAll();
    }

    @Override
    public List<User> updateUser(String username,User user) {
        if (userRepository.existsById(username)) {
            userRepository.deleteById(username);
            userRepository.save(user);
        }

        return userRepository.findAll();
    }
}
