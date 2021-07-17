package com.mailsonymathew.microservices.limitsservicev2.beans;

public class LimitsBean {
	
	private int maximum;
	private int minimum;
	
	
	
	protected LimitsBean() {

	}



	public LimitsBean(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}



	public int getMaximum() {
		return maximum;
	}



	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}



	public int getMinimum() {
		return minimum;
	}



	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}



	@Override
	public String toString() {
		return "LimitsBean [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
	
	
		

}
