package com.student.wxzhongyao.controller;

import com.student.wxzhongyao.entity.MedicinalClass;
import com.student.wxzhongyao.services.MedicinalClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicinalClassController {

    @Autowired
    private MedicinalClassService medicinalClassService;


    @RequestMapping("medicinalClass/list")
    public List<MedicinalClass> findAll(){
        return medicinalClassService.findAll();
    }
}
