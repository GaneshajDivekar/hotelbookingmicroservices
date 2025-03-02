package com.hotel.service;

import com.hotel.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getHotelById(String id);

    void deleteHotelById(String id);

    Hotel updateHotel(Hotel hotel);
}
