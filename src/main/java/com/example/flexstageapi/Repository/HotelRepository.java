package com.uscitechstage.FlexStage2.repository;

import com.uscitechstage.FlexStage2.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
