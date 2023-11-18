package com.Hotel.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Long id) {
        return null;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        return null;
    }

    @Override
    public Hotel updateHotel(Long id, Hotel hotel) {
        return null;
    }

    @Override
    public void deleteHotel(Long id) {

    }
}
