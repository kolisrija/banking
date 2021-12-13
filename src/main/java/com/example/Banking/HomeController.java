package com.example.Banking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/home")
	public String home()
	{
		return "hello Welcome to SBI Bank";
	 }
	@RequestMapping("/contact")
	public String contact()
		{
		return "Welcome to SBI Contact";
		}
	@RequestMapping("/about")
	public String about()
	{
		return "About SbI Bank";
	}
	@RequestMapping("/balance")
	public String balance()
	{
		return "Balance in your bank";
	}
}
