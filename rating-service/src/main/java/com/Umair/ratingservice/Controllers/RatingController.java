package com.Umair.ratingservice.Controllers;

import com.Umair.ratingservice.Entities.Rating;
import com.Umair.ratingservice.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return new ResponseEntity<>(ratingService.getAllRatings(), HttpStatus.OK);
    }

    @GetMapping("/{ratingId}")
    public ResponseEntity<Rating> getRatingById(@PathVariable("ratingId") String id){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRating(id));
    }

    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating){
        return ResponseEntity.ok(ratingService.addRating(rating));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getUserRating(@PathVariable("userId") String id){
        return  ResponseEntity.ok(ratingService.getUserRating(id));
    }
}
