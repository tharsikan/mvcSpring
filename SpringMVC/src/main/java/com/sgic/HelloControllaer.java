package com.sgic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllaer {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("employee");
		modelandview.addObject("id",1);
		modelandview.addObject("name","tharsikan");
		modelandview.addObject("salary",100000);
		return modelandview;
	}

}
