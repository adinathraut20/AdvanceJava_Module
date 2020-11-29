package com.MovieBooking.BookingSystem.Contr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.MovieBooking.BookingSystem.Service.UserService;
import com.MovieBooking.BookingSystem.dto.User;

@RestController
public class Controller {
		
		@Autowired
		UserService userService;
		
			
		@PostMapping("/")
		public String index(@RequestBody User user) {
				
				userService.insertUser(user);
				return "Insert Done";
		}
		@RequestMapping("/h")
		public String index1(@RequestParam int  id) {
				
				return userService.getUser(id).toString();
		}
				
		@RequestMapping(value = "/getDateAndTime")
		public String getDateAndTime() {
		
		    var now = LocalDateTime.now();
		    var dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		    var date_time = dtf.format(now);
		
		    var params = new HashMap<String, Object>();
		    params.put("date_time", date_time);
		
		    return new ModelAndView("showMessage", params).toString();
		}
}
