package com.your.team13.week5;

public class Customer {
	private int lineNumber;
	private int callTime;

	protected Plan plan;

	public Customer() {
		this.plan = null;
		this.callTime = 0;
		this.lineNumber = 0; 
	}
	
	public Customer(Plan plan, int callTime, int lineNumber) {
		this.plan = plan;
		this.callTime = callTime;
		this.lineNumber = lineNumber;
	}
	
	public Plan getPlan() {
		return plan;
	}
	
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public int getlineNumber() {
		return lineNumber;
	}

	public void setlineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getCallTime() {
		return callTime;
	}

	public void setCallTime(int callTime) {
		this.callTime = callTime;
	}
}
