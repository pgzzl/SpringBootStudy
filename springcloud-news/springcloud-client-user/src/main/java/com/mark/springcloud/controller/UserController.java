package com.mark.springcloud.controller;

import com.mark.springcloud.feign.NewsClient;
import com.mark.springcloud.feign.UserClient;
import com.mark.springcloud.pojo.SciNews;
import com.mark.springcloud.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserClient userClient;
    @Resource
    private NewsClient newsClient;

    @RequestMapping("/client/user/get/{id}")
    public User get(@PathVariable("id") String id){
        User user = userClient.getUserById(id);
        List<SciNews> newsList = newsClient.getNewsByUser(id);
        user.setNewsList(newsList);
        return user;
    }

    @RequestMapping("/client/user/add")
    public boolean add(User user){
        return userClient.addUser(user);
    }
    @RequestMapping("/client/user/list")
    public List<User> getList(){
        return userClient.getAllUsers();
    }

    @RequestMapping("/client/news/port")
    public String getPort(){
        return newsClient.port();
    }
}
