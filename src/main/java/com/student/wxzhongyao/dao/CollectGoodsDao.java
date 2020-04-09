package com.student.wxzhongyao.dao;

import com.student.wxzhongyao.entity.CollectGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectGoodsDao {
    public Integer addCollectGoods(CollectGoods collectGoods);

    public List<CollectGoods> findCollectGoods(Integer user_id);
}
