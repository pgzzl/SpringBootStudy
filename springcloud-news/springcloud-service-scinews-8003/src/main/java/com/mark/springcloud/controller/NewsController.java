package com.mark.springcloud.controller;

import com.mark.springcloud.pojo.SciNews;
import com.mark.springcloud.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @Value(value = "${server.port}")
    private String serverPort;

    @PostMapping("/news/add")
    public boolean addNews(SciNews news){
        return newsService.addNews(news);
    }

    @GetMapping("/news/get/{uid}")
    public List<SciNews> getNewsByUser(@PathVariable("uid") String id){
        return newsService.getNewsByUser(id);
    }

    @GetMapping("/news/list")
    public List<SciNews> getAllNews(){
        return newsService.getAllNews();
    }

    @GetMapping("/news/port")
    public String port(){
        return serverPort;
    }

}
