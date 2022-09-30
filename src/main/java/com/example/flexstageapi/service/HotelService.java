package com.uscitechstage.FlexStage2.service;

import com.uscitechstage.FlexStage2.Hotel;

import java.util.List;

public interface HotelService {
    Hotel creer( Hotel hotel);

    List<Hotel> lire();

    Hotel modifier(Integer id, Hotel hotel);

    String supprimer(Integer id);
}
