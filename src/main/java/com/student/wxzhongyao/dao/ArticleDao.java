package com.student.wxzhongyao.dao;

import com.student.wxzhongyao.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleDao {
    public List<Article> findAll();

    public Article findOne(Integer id);
}
