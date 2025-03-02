package com.ratingservice.service;

import com.ratingservice.entities.Rating;
import com.ratingservice.repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {


    private final RatingRepo ratingRepo;

    @Autowired
    public RatingServiceImpl(RatingRepo ratingRepo) {
        this.ratingRepo = ratingRepo;
    }


    @Override
    public Rating saveRating(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRating_id(ratingId);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        if (ratingRepo.count() > 0) return ratingRepo.findAll();
        return List.of();
    }



}