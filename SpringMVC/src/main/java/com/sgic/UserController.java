package com.sgic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("regist")
	public ModelAndView showRegistration() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRegister");
		return modelAndView;
	}
	
	@RequestMapping(value="registerUser" , method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		//System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("UserList");
		return modelAndView;
	}
}
