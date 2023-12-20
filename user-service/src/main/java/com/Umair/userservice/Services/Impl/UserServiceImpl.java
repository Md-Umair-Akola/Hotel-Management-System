package com.Umair.userservice.Services.Impl;

import com.Umair.userservice.Entities.Hotel;
import com.Umair.userservice.Entities.Rating;
import com.Umair.userservice.Entities.User;
import com.Umair.userservice.Feign.HotelInterface;
import com.Umair.userservice.Feign.RatingInterface;
import com.Umair.userservice.Repositories.UserRepo;
import com.Umair.userservice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RatingInterface ratingInterface;

    @Autowired
    private HotelInterface hotelInterface;

    @Override
    public User getUser(String id) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not found with Id:" + id));
        List<Rating> userRating = ratingInterface.getUserRating(id).getBody();
        List<Rating> ratings = userRating.stream().map(rating -> {
            Hotel hotel = hotelInterface.getHotelById(rating.getHotelId()).getBody();
            rating.setHotel(hotel);
            return rating;
        }).collect(Collectors.toList());
        user.setRatings(ratings);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User addUser(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        return userRepo.save(user);
    }
}
