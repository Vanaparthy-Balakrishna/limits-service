package com.bala.webservices.limitsservice.controller.dto;

public class Limit {

	private int maxLimit;
	private int minLimit;

	public Limit() {
		
	}

	public Limit(int maxLimit, int minLimit) {
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
