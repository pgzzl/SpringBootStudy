package com.mark.springcloud.service;

import com.mark.springcloud.dao.UserDao;
import com.mark.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
}
