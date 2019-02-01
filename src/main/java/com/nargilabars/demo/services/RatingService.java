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
        return ratingRepository.findByUserIdAndNargilaBarId(userId, nargilaBarId);
    }

    public String createRating(Rating r) {
        NargilaBar nb = nargilaBarsRepository.findById(r.getNargilaBarId()).orElseThrow(() -> new FileSystemNotFoundException("Not found"));
        Rating old = ratingRepository.findById(r.getId()).orElse(null);
        Double newRating;
        if (r.getId() == 0) {
            nb.setNumberOfGuests(nb.getNumberOfGuests()+1);
            newRating = (r.getOcjena() + nb.getRating()*(nb.getNumberOfGuests()-1))/(nb.getNumberOfGuests());
        }
        else {
            newRating = ((nb.getRating()*nb.getNumberOfGuests()-old.getOcjena() + r.getOcjena()))/nb.getNumberOfGuests();
        }
        nb.setRating(newRating);
        nargilaBarsRepository.save(nb);
        ratingRepository.save(r);
        return "{\"status\": \"" + "Rating is registered" + "\"}";
    }
}
