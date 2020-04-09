package com.student.wxzhongyao.controller;

import com.student.wxzhongyao.entity.Article;
import com.student.wxzhongyao.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/list")
    public List<Article> findAll(){

        return articleService.findAll();
    }

    @GetMapping("/article/get/{id}")
    public Article findOne(@PathVariable("id")Integer id){
       return articleService.findOne(id);
    }

}
