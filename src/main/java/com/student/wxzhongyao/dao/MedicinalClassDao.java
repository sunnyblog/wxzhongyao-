package com.student.wxzhongyao.dao;

import com.student.wxzhongyao.entity.MedicinalClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicinalClassDao {
    public List<MedicinalClass> findAll();
}
