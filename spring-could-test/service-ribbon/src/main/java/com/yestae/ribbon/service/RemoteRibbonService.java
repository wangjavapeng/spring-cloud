package com.yestae.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteRibbonService {
	@Autowired
	private RestTemplate restTemplate;
	
	public String sayHi(String name){
		return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
	}
}
