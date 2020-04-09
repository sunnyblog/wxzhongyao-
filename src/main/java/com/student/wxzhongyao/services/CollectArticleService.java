package com.student.wxzhongyao.services;

import com.student.wxzhongyao.entity.CollectArticle;

import java.util.List;

public interface CollectArticleService {
    public Integer addCollectArticle(CollectArticle CollectArticle);

    public List<CollectArticle> findCollectArticle(Integer user_id);


}
