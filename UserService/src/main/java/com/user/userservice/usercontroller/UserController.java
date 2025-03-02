package com.user.userservice.usercontroller;

import com.user.userservice.entities.User;
import com.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/{user_Id}")
    public ResponseEntity<User> getUserById(@PathVariable String user_Id) {
        return ResponseEntity.ok(userService.getUserById(user_Id));
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @DeleteMapping("/{user_Id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable String user_Id) {
        userService.deleteUserById(user_Id);
        return ResponseEntity.noContent().build();
    }
}
