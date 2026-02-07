package com.prabhatcodes.Service.Impl;

import com.prabhatcodes.Entity.Hotel;
import com.prabhatcodes.Repository.HotelRepository;
import com.prabhatcodes.Service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return null;
    }

    @Override
    public Hotel get(String id, String name) {
        return null;
    }
}
