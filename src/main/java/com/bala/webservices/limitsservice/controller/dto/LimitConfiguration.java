package com.bala.webservices.limitsservice.controller.dto;

public class LimitConfiguration {

	private int maxLimit;
	private int minLimit;

	public LimitConfiguration() {
		
	}

	public LimitConfiguration(int maxLimit, int minLimit) {
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}
}
