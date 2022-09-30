package com.example.flexstageapi.controller;

import com.example.flexstageapi.Hotel;
import com.example.flexstageapi.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@AllArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/create")
    public Hotel create(@RequestBody Hotel hotel){
        return hotelService.creer(hotel);
    }

    @GetMapping(value = "/read", headers = "Accept=application/json")
    public List<Hotel> read(){
        return hotelService.lire();
    }

/*
    @PutMapping("/update/{id}")
    public  Hotel update(@PathVariable Integer id,@RequestBody Hotel hotel){
        return hotelService.modifier(id, hotel);
    }
*/

/*    @DeleteMapping("/delete/{id}") //
    public String delete(@PathVariable Integer id){

        return hotelService.supprimer(id);
    }*/
}
