package com.Umair.ratingservice.Services;

import com.Umair.ratingservice.Entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    Rating getRating(String id);

    List<Rating> getAllRatings();

    Rating addRating(Rating user);

    List<Rating> getUserRating(String userId);

}
