package com.prabhatcodes.Service;

import com.prabhatcodes.Entity.Hotel;

import java.util.List;

public interface HotelService {

    // create
    Hotel create(Hotel hotel);

    // get all
    List<Hotel> getAll();


    // get one (getById + getByName)
    Hotel get(String id, String name);

}
