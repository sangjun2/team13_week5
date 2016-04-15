package com.your.team13.week5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppController {
	private static final Logger logger = Logger.getLogger("PrintBill");
	private StringBuffer buf;

	Plan plan;
	Customer customer;
	Calculate calculate;

	public AppController() {

	}

	public void run(String inputPlan, int callTime, int lineNumber) {
		customer = new Customer();

		customer.setPlan(getPlan(inputPlan));
		customer.setCallTime(callTime);
		customer.setlineNumber(lineNumber);

		calculate = new Calculate(customer);

		this.printBill();
	}

	public Plan getPlan(String inputPlan) {
		if ("gold".equals(inputPlan.toLowerCase())) {
			this.plan = new Gold();
		} else if ("silver".equals(inputPlan.toLowerCase())) {
			this.plan = new Silver();
		}

		return this.plan;
	}

	public void printBill() {
		buf = new StringBuffer("=================================");
		buf.append("<Phone Bill>");
		buf.append("Plan : ");
		System.out.printf("금액 : %.2f\n", calculate.totalRate());
	}
}
