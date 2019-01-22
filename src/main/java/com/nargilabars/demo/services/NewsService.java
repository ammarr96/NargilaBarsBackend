package com.nargilabars.demo.services;

import com.nargilabars.demo.models.News;
import com.nargilabars.demo.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public List<News> getAllNews(){
        return (List<News>) newsRepository.findAll();
    }
}
