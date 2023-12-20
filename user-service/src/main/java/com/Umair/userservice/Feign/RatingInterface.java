package com.Umair.userservice.Feign;

import com.Umair.userservice.Entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("RATING-SERVICE")
public interface RatingInterface {

    @GetMapping("rating/user/{userId}")
    public ResponseEntity<List<Rating>> getUserRating(@PathVariable("userId") String id);

}
