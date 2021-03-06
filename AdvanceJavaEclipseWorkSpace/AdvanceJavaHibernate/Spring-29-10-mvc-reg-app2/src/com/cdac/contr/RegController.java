package com.cdac.contr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.User;

@Controller
public class RegController {

	@RequestMapping(value = "/prep_reg_form.htm", method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
		map.put("user", new User());
		return "reg_form";
	}
	
	@RequestMapping(value = "/reg.htm", method = RequestMethod.POST)
	public String register(User user,ModelMap map) {
		map.put("user", user);
		return "info";
	}
}
