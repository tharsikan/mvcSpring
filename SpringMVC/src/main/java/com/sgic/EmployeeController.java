package com.sgic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.dto.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/employee")
	public ModelAndView sendObject() {
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("employee");
		
		Employee employee = new Employee();
		List d = new ArrayList();
		d.add("dog");
		d.add("dog2");
		d.add("dog3");
		employee.setDogs(d);
		employee.setName("tharsikan");
		employee.setId(1);
		employee.setSalary(300000d);
		modelandview.addObject("obj", employee);
		return modelandview;
	}
}
