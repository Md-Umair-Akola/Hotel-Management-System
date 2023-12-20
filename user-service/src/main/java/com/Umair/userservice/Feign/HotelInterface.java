package com.Umair.userservice.Feign;

import com.Umair.userservice.Entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("HOTEL-SERVICE")
public interface HotelInterface {

    @GetMapping("hotel/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String id);
}
