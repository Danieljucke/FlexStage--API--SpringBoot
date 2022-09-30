package com.example.flexstageapi.repository;

import com.example.flexstageapi.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
