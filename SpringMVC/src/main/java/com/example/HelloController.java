package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping (path= "hello")
public class HelloController {
	
		@GetMapping
		public String  getMessage(ModelMap model){
			System.out.println("Get Method");
			model.addAttribute("message", "Hello Spring MVC");
			return "hello";
			
		}
	

}
