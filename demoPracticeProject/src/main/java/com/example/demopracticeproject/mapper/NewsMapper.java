package com.example.demopracticeproject.mapper;

import com.example.demopracticeproject.Entity.News;

public interface NewsMapper {
    News getNewsById(Integer id);
    int addNews(News news);
}
