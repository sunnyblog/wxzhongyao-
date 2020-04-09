package com.student.wxzhongyao.controller;

import com.student.wxzhongyao.entity.Goods;
import com.student.wxzhongyao.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods/get/{id}")
    public List<Goods> findGoodsByClassId(@PathVariable Integer id){

        return goodsService.findGoodsByClassId(id);

    }

    @GetMapping("goods/id/{id}")
    public Goods findOne(@PathVariable Integer id){
        return goodsService.findOne(id);
    }

}
