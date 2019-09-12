package com.sgic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {
	@RequestMapping("/showdata")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam(value="salary", required=false, defaultValue="10000") Double salary) {
		// TODO Auto-generated method stub
		//ModelAndView mv = new ModelAndView();
		System.out.println("Id" + id);
		System.out.println("name" + name);
		System.out.println("salary" + salary);
		return new ModelAndView("UserList");
	}
}
