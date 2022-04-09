package com.mark.springcloud.dao;

import com.mark.springcloud.pojo.SciNews;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SciNewsDao {
    public boolean addNews(SciNews news);

    public List<SciNews> getNewsByUser(String uid);

    public List<SciNews> getAllNews();
}
