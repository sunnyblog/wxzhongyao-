package com.student.wxzhongyao.services;

import com.student.wxzhongyao.entity.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> findGoodsByClassId(Integer classId);

    public Goods findOne(Integer goodsId);


}
