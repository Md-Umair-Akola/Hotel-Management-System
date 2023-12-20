package com.Umair.ratingservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Rating {

    @Id
    private String ratingId;

    private String hotelId;

    private String userId;

    private int rating;

}
