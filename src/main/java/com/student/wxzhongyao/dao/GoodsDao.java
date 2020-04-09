package com.student.wxzhongyao.dao;

import com.student.wxzhongyao.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    public List<Goods> findGoodsByClassId(Integer classId);

    public Goods findOne(Integer goodsId);
}
