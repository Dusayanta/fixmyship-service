package com.fixmyship.service;

public class TestConfiguration {

	private int maximum;
	private int minimum;
	
	protected TestConfiguration() {
		
	}
	
	public TestConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}

}
