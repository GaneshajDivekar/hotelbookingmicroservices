package com.hotel.service;

import com.hotel.entities.Hotel;
import com.hotel.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;


    @Override
    public Hotel saveHotel(Hotel hotel) {
        String randomID = UUID.randomUUID().toString();
        hotel.setHotelId(randomID);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        if (hotelRepo.count() > 0) return hotelRepo.findAll();
        else return List.of();
    }

    @Override
    public Hotel getHotelById(String id) {
        if (hotelRepo.existsById(id)) return hotelRepo.findById(id).get();
        else System.out.println("Hotel with id: " + id + " does not exist");
        return null;
    }

    @Override
    public void deleteHotelById(String id) {
        if (hotelRepo.existsById(id)) hotelRepo.deleteById(id);
        else System.out.println("Hotel with id: " + id + " does not exist");
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return null;
    }
}
