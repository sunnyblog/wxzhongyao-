package com.student.wxzhongyao.services;

import com.student.wxzhongyao.entity.CollectArticle;
import com.student.wxzhongyao.entity.CollectGoods;

import java.util.List;

public interface CollectGoodsService {
    public Integer addCollectGoods(CollectGoods collectGoods);

    public List<CollectGoods> findCollectGoods(Integer user_id);

}
