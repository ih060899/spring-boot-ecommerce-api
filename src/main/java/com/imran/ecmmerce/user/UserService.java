package com.imran.ecmmerce.user;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(String username);

    User createUser(User user);

    List<User> deleteUser(String username);

    List<User> updateUser(String usernmae,User user);

}
