package com.Umair.hotelservice.Services;

import com.Umair.hotelservice.Entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel getHotel(String id);

    List<Hotel> getAllHotels();

    Hotel addHotel(Hotel user);


}
