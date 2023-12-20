package com.Umair.hotelservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Hotel {

    @Id
    private String hotelId;

    private String name;

    private String location;

    private String about;

}
