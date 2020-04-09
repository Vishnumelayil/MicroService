package com.vishnu.microservice.newlimitservice.bean;

public class LimitConfiguration {
	int max;
	int minimum;
	
	
	public LimitConfiguration() {
		super();
	}
	public LimitConfiguration(int max, int minimum) {
		super();
		this.max = max;
		this.minimum = minimum;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
}
