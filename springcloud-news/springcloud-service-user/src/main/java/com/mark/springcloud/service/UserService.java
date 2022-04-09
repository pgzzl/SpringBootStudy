package com.mark.springcloud.service;

import com.mark.springcloud.pojo.User;

import java.util.List;

public interface UserService {
    public User getUserById(String id);
    public List<User> getAllUsers();
    public boolean addUser(User user);
}
