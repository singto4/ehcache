package com.eh.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.app.service.GetInfoService;

@RestController
public class InfoController {
	
	@Autowired
	private GetInfoService getInfoService;
	
	@GetMapping("/getInfo/{id}")
	public String getInfo(@PathVariable String id) {
		return getInfoService.getDataById(id);
	}
	
	@PostMapping("/updateCache/{id}/{msg}")
	public String updateCache(@PathVariable String id, @PathVariable String msg) {
		return getInfoService.updateDataById(id, msg);
	}
	
	@PostMapping("/clearCache/{id}")
	public String clearCache(@PathVariable String id) {
		getInfoService.clearCacheById(id);
		return "Clear cache infoCache ID : " + id + " SUCCESS";
	}

}
