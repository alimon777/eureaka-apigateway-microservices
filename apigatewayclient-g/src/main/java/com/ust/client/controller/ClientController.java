package com.ust.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class ClientController {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping
	public String fetchtest()
	{
		String url = "http://localhost:8073/rest/service1/test";
		String result= template.getForObject(url,String.class);
		return result;
	}
}