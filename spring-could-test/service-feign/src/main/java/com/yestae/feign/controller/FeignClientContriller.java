package com.yestae.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yestae.feign.api.RemoteFeignApi;

@RestController
public class FeignClientContriller {
	@Autowired
	private RemoteFeignApi RemoteFeignApi;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam(value = "name") String name){
		return RemoteFeignApi.sayHi(name);
	}
}
