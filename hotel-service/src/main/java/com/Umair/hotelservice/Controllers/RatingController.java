package com.Umair.hotelservice.Controllers;

import com.Umair.hotelservice.Entities.Hotel;
import com.Umair.hotelservice.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class RatingController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return new ResponseEntity<>(hotelService.getAllHotels(), HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String id){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(id));
    }

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        return ResponseEntity.ok(hotelService.addHotel(hotel));
    }

}
