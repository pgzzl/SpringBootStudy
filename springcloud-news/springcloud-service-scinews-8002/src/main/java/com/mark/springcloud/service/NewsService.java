package com.mark.springcloud.service;

import com.mark.springcloud.pojo.SciNews;

import java.util.List;

public interface NewsService {

    public boolean addNews(SciNews news);

    public List<SciNews> getNewsByUser(String uid);

    public List<SciNews> getAllNews();
}
