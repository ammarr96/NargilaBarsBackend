package com.nargilabars.demo.repositories;

import com.nargilabars.demo.models.NargilaBar;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NargilaBarsRepository extends PagingAndSortingRepository<NargilaBar, Long> {
    NargilaBar findById(int id);
}
