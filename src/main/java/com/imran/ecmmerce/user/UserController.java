package com.imran.ecmmerce.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUserById(@PathVariable("username") String username) {
        return userService.getUserById(username);
    }

    @PostMapping
    public User createUser(@RequestBody final User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{username}")
    public List<User> deleteUser(@PathVariable String username) {

        return userService.deleteUser(username);
    }

    @PutMapping("/{username}")
    public List<User> updateUser(@PathVariable String username, @RequestBody User user) {
        return userService.updateUser(username, user);
    }
}
