package com.mark.springcloud.service;

import com.mark.springcloud.dao.SciNewsDao;
import com.mark.springcloud.pojo.SciNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private SciNewsDao sciNewsDao;

    public boolean addNews(SciNews news) {
        return sciNewsDao.addNews(news);
    }

    public List<SciNews> getNewsByUser(String uid) {
        return sciNewsDao.getNewsByUser(uid);
    }

    public List<SciNews> getAllNews() {
        return sciNewsDao.getAllNews();
    }
}
