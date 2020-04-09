package com.student.wxzhongyao.services.impl;

import com.student.wxzhongyao.dao.CollectArticleDao;
import com.student.wxzhongyao.entity.CollectArticle;
import com.student.wxzhongyao.services.CollectArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectArticleServiceImpl implements CollectArticleService {
    @Autowired
    private CollectArticleDao collectArticleDao;

    public Integer addCollectArticle(CollectArticle collectArticle){
        return collectArticleDao.addCollectArticle(collectArticle);
    }

    public List<CollectArticle> findCollectArticle(Integer user_id){
        return collectArticleDao.findCollectArticle(user_id);
    }


}
