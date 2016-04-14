package com.your.team13.week5;

public class Customer {
	private int lineNumber;
	private int callTime;

	protected Plan plan;

	public Customer(Plan plan, int callTime, int lineNumber) {
		this.plan = plan;
		this.callTime = callTime;
		this.lineNumber = lineNumber;
	}

	public int getlineNumber() {
		return lineNumber;
	}

//	public void setlineNumber(int lineNumber) {
//		this.lineNumber = lineNumber;
//	}

	public int getCallTime() {
		return callTime;
	}

//	public void setCallTime(int callTime) {
//		this.callTime = callTime;
//	}
}
