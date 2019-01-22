package com.nargilabars.demo.controllers;

import com.nargilabars.demo.models.News;
import com.nargilabars.demo.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @GetMapping("/all")
    public List<News> getAll(){
        return newsService.getAllNews();
    }
}
