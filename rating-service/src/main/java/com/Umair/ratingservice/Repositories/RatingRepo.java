package com.Umair.ratingservice.Repositories;

import com.Umair.ratingservice.Entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating,String> {
    List<Rating> findByUserId(String userId);
}
