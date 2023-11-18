package com.Hotel.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class HotelController {
    @Autowired
    HotelService hotelService;
    @GetMapping({"/hotels"})
    public List<Hotel> getHotels() {
        return hotelService.getAllHotels();
    }

}
