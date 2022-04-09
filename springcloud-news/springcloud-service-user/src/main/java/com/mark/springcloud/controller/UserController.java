package com.mark.springcloud.controller;

import com.mark.springcloud.pojo.User;
import com.mark.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/get/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }
    @GetMapping("/user/list")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/user/add")
    public boolean addUser(User user){
        return userService.addUser(user);
    }
}
