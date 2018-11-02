package com.yestae.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yestae.ribbon.service.RemoteRibbonService;

@RestController
public class RibbonClientContriller {
	@Autowired
	private RemoteRibbonService remoteRibbonService;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam(value = "name") String name){
		return remoteRibbonService.sayHi(name);
	}
}
