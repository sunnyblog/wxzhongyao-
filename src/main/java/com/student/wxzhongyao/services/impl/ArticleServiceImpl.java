package com.student.wxzhongyao.services.impl;

import com.student.wxzhongyao.dao.ArticleDao;
import com.student.wxzhongyao.entity.Article;
import com.student.wxzhongyao.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }

    @Override
    public Article findOne(Integer id) {
        return articleDao.findOne(id);
    }
}
