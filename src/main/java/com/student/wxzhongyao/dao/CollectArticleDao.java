package com.student.wxzhongyao.dao;

import com.student.wxzhongyao.entity.CollectArticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectArticleDao {

    public Integer addCollectArticle(CollectArticle collectArticle);

    public List<CollectArticle> findCollectArticle(Integer user_id);
}
