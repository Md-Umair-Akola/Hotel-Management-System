package com.Umair.ratingservice.Services.Impl;

import com.Umair.ratingservice.Entities.Rating;
import com.Umair.ratingservice.Repositories.RatingRepo;
import com.Umair.ratingservice.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class RatingServiceImpl implements RatingService {


    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating getRating(String id) {
        return ratingRepo.findById(id).orElseThrow(()->new RuntimeException("Rating Not found with Id:"+id));
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public Rating addRating(Rating rating) {
        String id = UUID.randomUUID().toString();
        rating.setRatingId(id);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getUserRating(String userId) {
        return ratingRepo.findByUserId(userId);
    }

}
