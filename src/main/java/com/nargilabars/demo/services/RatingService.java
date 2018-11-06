package com.nargilabars.demo.services;

import com.nargilabars.demo.models.NargilaBar;
import com.nargilabars.demo.models.Rating;
import com.nargilabars.demo.repositories.NargilaBarsRepository;
import com.nargilabars.demo.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    @Autowired
    NargilaBarsRepository nargilaBarsRepository;

    public List<Rating> getAllRatings(){
        return (List<Rating>) ratingRepository.findAll();
    }

    public Rating getRatingByUserIdAndNargilaBarId(Long userId, Long nargilaBarId) {
        return ratingRepository.findByUserIDAndNargilaBarId(userId, nargilaBarId);
    }

    public String createRating(Rating r) {
        NargilaBar nb = nargilaBarsRepository.findById(r.getNargilaBarId()).orElseThrow(() -> new FileSystemNotFoundException("Not found"));
        Double newRating = (r.getOcjena() + nb.getRating())/(nb.getNumberOfGuests()+1);
        nb.setRating(newRating);
        nb.setNumberOfGuests(nb.getNumberOfGuests()+1);
        nargilaBarsRepository.save(nb);
        ratingRepository.save(r);
        return "{\"status\": \"" + "Rating is registered" + "\"}";
    }


}