package com.spike.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class OneToManyController {

	public void creatData()
	{
		
	}
	private String generateTrackerId() {
		String trackId = "";
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(9999);
		String randomValue = String.format("%04d", randomNumber);
		
		trackId =randomValue;
		return trackId;
	}

}
