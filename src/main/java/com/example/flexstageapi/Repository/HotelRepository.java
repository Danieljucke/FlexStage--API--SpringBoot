package com.uscitechstage.flexstageapi.repository;

import com.uscitechstage.flexstageapi.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
