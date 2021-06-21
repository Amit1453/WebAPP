package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Employeeinterface;
import entity.EmployeeEntity;



public class EmployeeController 
{
	@Autowired
	private Employeeinterface emplyoeeinterface;
	
	@GetMapping("/forlogin")
	public String auth()
	{
		return "login";
		
	}
	
	
	@PostMapping("/authenticate")
	public String authenticateEmployee(@RequestParam String email,@RequestParam String password, Model model)
	{
		System.out.println(email + " " + password);
		
		
		EmployeeEntity employeentity = emplyoeeinterface.authenticate(email, password);
		
		if (employeentity!= null)
		{
			model.addAttribute("employee",employeentity);
			model.addAttribute("sucessmsg","Sucessfullylogin");
			return "login";
		}
		
		else
		{
			model.addAttribute("msg", "wrong credential");
			return "login";
		}
	
	}
}
