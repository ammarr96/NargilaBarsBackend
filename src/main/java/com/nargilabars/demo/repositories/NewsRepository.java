package com.nargilabars.demo.repositories;

import com.nargilabars.demo.models.News;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NewsRepository extends PagingAndSortingRepository<News, Long> {

}
