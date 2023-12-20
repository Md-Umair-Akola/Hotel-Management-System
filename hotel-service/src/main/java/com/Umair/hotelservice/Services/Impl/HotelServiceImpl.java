package com.Umair.hotelservice.Services.Impl;

import com.Umair.hotelservice.Entities.Hotel;
import com.Umair.hotelservice.Repositories.HotelRepo;
import com.Umair.hotelservice.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class HotelServiceImpl implements HotelService {


    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel getHotel(String id) {
        return hotelRepo.findById(id).orElseThrow(()->new RuntimeException("Rating Not found with Id:"+id));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel addHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setHotelId(id);
        return hotelRepo.save(hotel);
    }

}
