package com.MovieBooking.BookingSystem.Service;

import com.MovieBooking.BookingSystem.dto.User;

public interface UserService {

	void insertUser(User user);
	User getUser(int userid);
}
