package com.bala.webservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.webservices.limitsservice.controller.dto.Limit;
import com.bala.webservices.limitsservice.controller.dto.LimitConfiguration;

@RestController
@RequestMapping("/limits")
public class LimitsServiceController {

	@Autowired
	private LimitConfiguration config;

	@GetMapping("/limit")
	public Limit getLimit() {
		return new Limit(1000, 1);
	}

	@GetMapping("/limitconfig")
	public Limit getLimitConfig() {
		return new Limit(config.getMaximum(), config.getMinimum());
	}
}
