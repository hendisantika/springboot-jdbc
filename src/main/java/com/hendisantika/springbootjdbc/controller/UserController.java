package com.hendisantika.springbootjdbc.controller;

import com.hendisantika.springbootjdbc.domain.User;
import com.hendisantika.springbootjdbc.repository.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-01
 * Time: 07:27
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser() {
        User user = userService.create(getUser());
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userService.findAll();

    }

    @GetMapping("/users/{id}")
    public User retrieveUserById(@PathVariable int id) {
        return userService.findUserById(id);
    }

    private User getUser() {
        User user = new User();
        user.setName("Uzumaki Naruto");
        user.setAddress("Konohagakure, Hokage");
        user.setEmail("uzumaki_naruto@konohagakure.com");
        return user;
    }

}