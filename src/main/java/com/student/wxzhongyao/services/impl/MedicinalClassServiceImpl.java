package com.student.wxzhongyao.services.impl;

import com.student.wxzhongyao.dao.MedicinalClassDao;
import com.student.wxzhongyao.entity.MedicinalClass;
import com.student.wxzhongyao.services.MedicinalClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicinalClassServiceImpl implements MedicinalClassService {

    @Autowired
    private MedicinalClassDao medicinalClassDao;

    @Override
    public List<MedicinalClass> findAll() {
        return medicinalClassDao.findAll();
    }
}
