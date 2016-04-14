package com.your.team13.week5;

public class Bill {
	int callTime;
	int lineNumber;
	Plan plan;
	Customer customer;
	Calculate calculate;
	
	public Bill() {
		
	}
	
	public void run(String inputPlan, int callTime, int lineNumber) {
		this.getPlan(inputPlan);
		this.callTime = callTime;
		this.lineNumber = lineNumber;
		
		this.result();
	}
	
	public void getPlan(String inputPlan) {
		if("gold".equals(inputPlan.toLowerCase())) {
			this.plan = new Gold();
		}
		else if("silver".equals(inputPlan.toLowerCase())) {
			this.plan = new Silver();
		}
		
	}
	
	public void result() {
		customer = new Customer(plan, callTime, lineNumber);
		calculate = new Calculate(customer);
		
		System.out.printf("금액 : %.2f", calculate.totalRate());
	}
}
