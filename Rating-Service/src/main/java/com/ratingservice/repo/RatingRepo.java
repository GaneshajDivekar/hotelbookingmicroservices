package com.ratingservice.repo;

import com.ratingservice.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating, String> {


    List<Rating> findAllByHotelId(String hotelId);
    List<Rating> findAllByUserId(String userId);


}
