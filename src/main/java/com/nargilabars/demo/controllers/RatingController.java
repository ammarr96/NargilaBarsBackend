package com.nargilabars.demo.controllers;

import com.nargilabars.demo.models.NargilaBar;
import com.nargilabars.demo.models.Rating;
import com.nargilabars.demo.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    RatingService ratingService;

    @GetMapping("/all")
    public List<Rating> getAll(){
        return ratingService.getAllRatings();
    }

    @GetMapping("/get/{id1}/{id2}")
    public Rating getRating(@PathVariable(name = "id1") Long userId, @PathVariable(name = "id2") Long nargilaBarId ) {
        return ratingService.getRatingByUserIdAndNargilaBarId(userId, nargilaBarId);
    }

    @PostMapping(value="/insertRating")
    public String createRating(@Valid @RequestBody final Rating r) {
        return ratingService.createRating(r);
    }

}
