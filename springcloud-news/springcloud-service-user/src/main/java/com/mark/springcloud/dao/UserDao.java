package com.mark.springcloud.dao;

import com.mark.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    public User getUserById(String id);
    public List<User> getAllUsers();
    public boolean addUser(User user);
}
