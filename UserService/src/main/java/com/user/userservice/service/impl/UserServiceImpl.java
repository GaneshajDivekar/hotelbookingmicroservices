package com.user.userservice.service.impl;

import com.user.userservice.entities.User;
import com.user.userservice.repo.UserRepo;
import com.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        String randomID = UUID.randomUUID().toString();
        user.setUser_id(randomID);
        return userRepo.save(user);
    }

    @Override
    public User getUserById(String id) {
        User user = userRepo.findById(id).get();
        ResponseEntity<ArrayList> response = restTemplate.exchange("http://localhost:8082/rating/" + id,
                HttpMethod.POST,
                null,
                ArrayList.class);
        ArrayList list = response.getBody();
        System.out.println("Ganesh: " + list);
        System.out.println("Ganesh1: " + id);
        user.setRatings(list);
        return user;

    }

    @Override
    public List<User> getAllUsers() {
        if (userRepo.count() > 0) return userRepo.findAll();
        return List.of();
    }

    @Override
    public void deleteUserById(String id) {
        if (userRepo.existsById(id)) userRepo.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }
}
