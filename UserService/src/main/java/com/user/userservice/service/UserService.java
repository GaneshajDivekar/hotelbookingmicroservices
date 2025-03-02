package com.user.userservice.service;

import com.user.userservice.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    User saveUser(User user);

    User getUserById(String id);

    List<User> getAllUsers();

    void deleteUserById(String id);

    User updateUser(User user);

}
