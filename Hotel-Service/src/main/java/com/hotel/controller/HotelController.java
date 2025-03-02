package com.hotel.controller;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @PostMapping("/saveHotel")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
        hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
    }

    @PostMapping("/getHotelById")
    public ResponseEntity<Hotel> getHotelById(@PathVariable  String id) {
        return ResponseEntity.ok(hotelService.getHotelById(id));
    }

    @PostMapping("/deleteHotelById")
    public ResponseEntity<Void> deleteHotelById(@PathVariable  String id) {
        hotelService.deleteHotelById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/updateHotel")
    public ResponseEntity<Hotel> updateHotel(Hotel hotel) {
        return ResponseEntity.ok(hotelService.updateHotel(hotel));
    }


    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }


}
