package com.nargilabars.demo.repositories;

import com.nargilabars.demo.models.Rating;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends PagingAndSortingRepository<Rating, Long> {

    Rating findByUserIdAndNargilaBarId(Long userId, Long nargilaBarId);

}
