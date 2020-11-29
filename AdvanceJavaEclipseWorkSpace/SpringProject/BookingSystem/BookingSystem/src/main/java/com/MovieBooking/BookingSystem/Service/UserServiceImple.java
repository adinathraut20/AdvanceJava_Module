package com.MovieBooking.BookingSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MovieBooking.BookingSystem.dto.User;
import com.MovieBooking.BookingSystem.repository.UserRepo;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void insertUser(User user) {
		userRepo.save(user);
		return;
	}

	@Override
	public User getUser(int userid) {
		
		return userRepo.findById(userid).get();
	}

}
