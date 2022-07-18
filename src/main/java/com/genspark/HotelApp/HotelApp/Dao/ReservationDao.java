package com.genspark.HotelApp.HotelApp.Dao;

import com.genspark.HotelApp.HotelApp.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer> {
}
