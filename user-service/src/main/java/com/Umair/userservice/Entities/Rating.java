package com.Umair.userservice.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rating {

    private String ratingId;

    private String hotelId;

    private String userId;

    private int rating;

    private Hotel hotel;

}
