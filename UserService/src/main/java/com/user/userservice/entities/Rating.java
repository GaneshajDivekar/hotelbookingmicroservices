package com.user.userservice.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@lombok.Builder
public class Rating {

    private String user_id;
    private String rating_id;
    private int rating;
    private String hotel_id;
    private String feedback;

}
