package com.home.cafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/cafe")
	public String showWelcomePage() {
		return "welcom-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(Model model, HttpServletRequest request) {
		
		// handle the data from user
		String userData = request.getParameter("foodType");
		
		// set user data with the model and send it to view
		model.addAttribute("userInput", userData);
		
		return "process-order";
	}
	
}
