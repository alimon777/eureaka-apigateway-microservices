package com.ust.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service2")
public class FactorialController {
	@GetMapping("/test")
	public String confirm() {
		return "factorial service connected and responding...";
	}
	
	@GetMapping("/factorial/{number}")
	public String factorial(@PathVariable int number) {
		long factorial = 1;
        while(number>0) {
        	factorial*=number;
        	number-=1;
        }
        return ""+factorial;
	}
}
