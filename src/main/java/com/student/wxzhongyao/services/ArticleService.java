package com.student.wxzhongyao.services;

import com.student.wxzhongyao.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {
    public List<Article> findAll();

    public Article findOne(Integer id);

}
