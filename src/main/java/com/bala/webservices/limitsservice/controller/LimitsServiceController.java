package com.bala.webservices.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.webservices.limitsservice.controller.dto.LimitConfiguration;

@RestController
@RequestMapping("/limit")
public class LimitsServiceController {

	@GetMapping("/limitConfig")
	public LimitConfiguration getLimitConfiguration() {
		return new LimitConfiguration(1000, 1);
	}
}
