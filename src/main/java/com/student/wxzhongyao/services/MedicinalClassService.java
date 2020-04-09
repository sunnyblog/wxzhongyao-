package com.student.wxzhongyao.services;

import com.student.wxzhongyao.entity.MedicinalClass;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MedicinalClassService {
    public List<MedicinalClass> findAll();

}
