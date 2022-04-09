package com.mark.springcloud.feign;

import com.mark.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(name = "SPRINGCLOUD-SERVICE-USER")
public interface UserClient {
    @GetMapping("/user/get/{id}")
    public User getUserById(@PathVariable("id") String id);
    @GetMapping("/user/list")
    public List<User> getAllUsers();
    @PostMapping("/user/add")
    public boolean addUser(User user);
}
