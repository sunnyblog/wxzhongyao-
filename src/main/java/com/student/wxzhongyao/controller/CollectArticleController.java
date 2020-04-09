package com.student.wxzhongyao.controller;

import com.student.wxzhongyao.entity.CollectArticle;
import com.student.wxzhongyao.entity.User;
import com.student.wxzhongyao.services.CollectArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class CollectArticleController {

    @Autowired
    private CollectArticleService collectArticleService;

    @PostMapping("article/add")
    public Integer addCollectArticle(@RequestParam("user_id") Integer user_id, @RequestParam("article_id") Integer article_id, @RequestParam("article_title") String article_title
    ,@RequestParam("article_poster") String article_poster){

        CollectArticle collectArticle = new CollectArticle();
        collectArticle.setUser_id(user_id);
        collectArticle.setArticle_id(article_id);
        collectArticle.setArticle_title(article_title);
        collectArticle.setArticle_poster(article_poster);
        collectArticle.setCollect_time(new Date());
        Integer resulet = collectArticleService.addCollectArticle(collectArticle);

        return resulet;
    }

    @GetMapping("article/get/user_id/{user_id}")
    public List<CollectArticle> findCollectArticle(@PathVariable("user_id") Integer user_id){
        return collectArticleService.findCollectArticle(user_id);
    }
}
