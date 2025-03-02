package com.ratingservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@lombok.Builder
@Entity(name = "rating")
public class Rating {

    @Id
    @Column(name = "rating_id")
    private String rating_id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "rating")
    private int rating;


    @Column(name = "hotel_id")
    private String hotelId;


    @Column(name = "feedback")
    private String feedback;

}
