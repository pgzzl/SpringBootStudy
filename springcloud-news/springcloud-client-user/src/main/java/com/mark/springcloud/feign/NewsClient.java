package com.mark.springcloud.feign;

import com.mark.springcloud.pojo.SciNews;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(name = "SPRINGCLOUD-SERVICE-NEWS")
public interface NewsClient {
    @PostMapping("/news/add")
    public boolean addNews(SciNews news);

    @GetMapping("/news/get/{uid}")
    public List<SciNews> getNewsByUser(@PathVariable("uid") String id);

    @GetMapping("/news/list")
    public List<SciNews> getAllNews();

    @GetMapping("/news/port")
    public String port();
}
