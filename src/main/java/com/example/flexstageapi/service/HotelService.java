package com.example.flexstageapi.service;

import com.example.flexstageapi.Hotel;

import java.util.List;

public interface HotelService {
    Hotel creer( Hotel hotel);

    List<Hotel> lire();

    Hotel modifier(Integer id, Hotel hotel);

    String supprimer(Integer id);
}
