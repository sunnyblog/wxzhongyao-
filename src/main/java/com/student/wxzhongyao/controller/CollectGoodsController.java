package com.student.wxzhongyao.controller;

import com.student.wxzhongyao.entity.CollectArticle;
import com.student.wxzhongyao.entity.CollectGoods;
import com.student.wxzhongyao.services.CollectArticleService;
import com.student.wxzhongyao.services.CollectGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class CollectGoodsController {

    @Autowired
    private CollectGoodsService collectGoodsService;

    @PostMapping("goods/add")
    public Integer addCollectGoods(@RequestParam("user_id") Integer user_id, @RequestParam("goods_id") Integer goods_id, @RequestParam("goods_name") String goods_name
    ,@RequestParam("goods_poster") String goods_poster){
        CollectGoods collectGoods = new CollectGoods();
        collectGoods.setUser_id(user_id);
        collectGoods.setGoods_id(goods_id);
        collectGoods.setGoods_name(goods_name);
        collectGoods.setGoods_poster(goods_poster);
        collectGoods.setCollect_time(new Date());

        return collectGoodsService.addCollectGoods(collectGoods);
    }

    @GetMapping("goods/get/user_id/{user_id}")
    public List<CollectGoods> findCollectGoods(@PathVariable("user_id") Integer user_id){
        return collectGoodsService.findCollectGoods(user_id);
    }
}
