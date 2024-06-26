package com.mvc.DataBinding.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.DataBinding.service.IEmpService;

@Controller
public class HomeController
{
	@Autowired
	private IEmpService Eservice;
    
	@GetMapping("/home")
	public String home(@ModelAttribute("emp") EmployeePojo emp)
	{
		return "signUp";
	}
	
	@PostMapping("/home/register")
	public String register(Map<String,Object> map,@ModelAttribute("emp") EmployeePojo emp)
	{
		map.put("emp" , Eservice.saveEmployee(emp));
		
		return "response";
	}
	
}
