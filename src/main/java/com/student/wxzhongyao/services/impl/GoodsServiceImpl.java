package com.student.wxzhongyao.services.impl;

import com.student.wxzhongyao.dao.GoodsDao;
import com.student.wxzhongyao.entity.Goods;
import com.student.wxzhongyao.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findGoodsByClassId(Integer classId) {
        return goodsDao.findGoodsByClassId(classId);
    }

    @Override
    public Goods findOne(Integer goodsId) {
        return goodsDao.findOne(goodsId);
    }
}
