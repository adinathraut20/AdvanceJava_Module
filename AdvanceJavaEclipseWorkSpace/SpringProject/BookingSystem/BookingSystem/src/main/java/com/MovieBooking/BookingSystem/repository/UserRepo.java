package com.MovieBooking.BookingSystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MovieBooking.BookingSystem.dto.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
		
		
}
