package com.ratingservice.service;

import com.ratingservice.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {


    Rating saveRating(Rating rating);

    List<Rating> getAllRatings();





}
