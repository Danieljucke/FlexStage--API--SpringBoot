package com.uscitechstage.FlexStage2.service;

import com.uscitechstage.FlexStage2.Hotel;
import com.uscitechstage.FlexStage2.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HotelServiceImplement implements  HotelService{

    private final HotelRepository hotelRepository;



    @Override
    public Hotel creer(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> lire() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel modifier(Integer id, Hotel hotel) {
        return hotelRepository.findById(id)
                .map(h->{
                    h.setAdresse(hotel.getAdresse());
                    h.setNomHotel(hotel.getNomHotel());
                    h.setNombreEtoiles(hotel.getNombreEtoiles());
                    h.setVille(hotel.getVille());
                    return hotelRepository.save(h);
                }).orElseThrow(() -> new RuntimeException("Hotel non trouvé"));
    }

    @Override
    public String supprimer(Integer id) {
        hotelRepository.deleteById(id);
        return "Hotel supprimé avec succès";
    }
}
