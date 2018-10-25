package com.nargilabars.demo.services;

import com.nargilabars.demo.models.Rating;
import com.nargilabars.demo.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getAllRatings(){
        return (List<Rating>) ratingRepository.findAll();
    }

    public Rating getRatingByUserIdAndNargilaBarId(Long userId, Long nargilaBarId) {
        return ratingRepository.findByUserIDAndNargilaBarId(userId, nargilaBarId);
    }


}
