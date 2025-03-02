package com.ratingservice.controller;

import com.ratingservice.entities.Rating;
import com.ratingservice.repo.RatingRepo;
import com.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @Autowired
    private RatingRepo ratingRepo;

    @PostMapping("/save")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
        return ResponseEntity.ok(ratingService.saveRating(rating));
    }

    @GetMapping("/getAllRatings")
    public ResponseEntity<Iterable<Rating>> getAllRatings() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    @PostMapping("/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingRepo.findAllByUserId(userId));
    }


}
