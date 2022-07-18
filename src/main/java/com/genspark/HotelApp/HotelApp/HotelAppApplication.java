package com.genspark.HotelApp.HotelApp;

import com.genspark.HotelApp.HotelApp.Dao.ReservationDao;
import com.genspark.HotelApp.HotelApp.Dao.UserDao;
import com.genspark.HotelApp.HotelApp.Entity.Reservation;
import com.genspark.HotelApp.HotelApp.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HotelAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(HotelAppApplication.class, args);

	}

}
