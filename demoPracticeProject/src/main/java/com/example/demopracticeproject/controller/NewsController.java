package com.example.demopracticeproject.controller;

import com.example.demopracticeproject.Entity.News;
import com.example.demopracticeproject.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsMapper newsMapper;

    @RequestMapping( value = "/getById/{id}",method = RequestMethod.GET)
    public News getNewsById(@PathVariable("id") Integer id){
        return newsMapper.getNewsById(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String postNews(@RequestParam(value = "id")Integer id,@RequestParam(value = "title")String title,@RequestParam(value = "type")String type,
                         @RequestParam(value = "user_id")Integer user_id,@RequestParam(value = "link")String link,@RequestParam(value = "cover")String cover,
                         @RequestParam(value = "downloads")Integer downloads,@RequestParam(value = "gmt_create")String gmt_create,@RequestParam(value = "create_by")String create_by,
                         @RequestParam(value = "gmt_update")String gmt_update,@RequestParam(value = "update_by")String update_by){
        News news=new News();
        news.setId(id);
        news.setTitle(title);
        news.setType(type);
        news.setUser_id(user_id);
        news.setLink(link);
        news.setCover(cover);
        news.setDownloads(downloads);
        news.setGmt_create(gmt_create);
        news.setCreate_by(create_by);
        news.setGmt_update(gmt_update);
        news.setUpdate_by(update_by);
        int t=newsMapper.addNews(news);
        if(t==1){
            return "success";
        }else {
            return "failure";
        }
    }
}
