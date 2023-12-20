package com.Umair.userservice.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @Column(name = "userId")
    private String id;

    private String name;

    private String email;

    @Column(name="mobile", length = 10)
    private long mobile;

    @Transient
    private List<Rating> ratings=new ArrayList<>();

}
