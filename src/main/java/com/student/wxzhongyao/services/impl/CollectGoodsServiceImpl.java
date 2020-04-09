package com.student.wxzhongyao.services.impl;

import com.student.wxzhongyao.dao.CollectArticleDao;
import com.student.wxzhongyao.dao.CollectGoodsDao;
import com.student.wxzhongyao.entity.CollectArticle;
import com.student.wxzhongyao.entity.CollectGoods;
import com.student.wxzhongyao.services.CollectArticleService;
import com.student.wxzhongyao.services.CollectGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectGoodsServiceImpl implements CollectGoodsService {
    @Autowired
    private CollectGoodsDao collectGoodsDao;


    @Override
    public Integer addCollectGoods(CollectGoods collectGoods) {
        return collectGoodsDao.addCollectGoods(collectGoods);
    }

    @Override
    public List<CollectGoods> findCollectGoods(Integer user_id) {
        return collectGoodsDao.findCollectGoods(user_id);
    }
}
